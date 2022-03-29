import java.util.List;

public class PaginationHelper<I> {
    List<I> collection;
    int itemsPerPage;
    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return this.collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return (int) Math.ceil(this.collection.size() / (float) this.itemsPerPage);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if(pageIndex < 0 || pageIndex >= this.pageCount()) {
            return -1;
        } else {
            return pageIndex == this.pageCount() - 1 ?
                    this.collection.size() % this.itemsPerPage : this.itemsPerPage;
        }
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex >= this.collection.size()) {
            return -1;
        } else {
            return itemIndex / this.itemsPerPage;
        }
    }
}