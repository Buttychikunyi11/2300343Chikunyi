public class Magazine extends LibraryItem {
    private String issueDate;

    public Magazine(String id, String title, String issueDate) {
        super(id, title);
        this.issueDate = issueDate;
    }

    @Override
    public String getDetails() {
        return "Magazine - " + super.toString() + ", Issue Date: " + issueDate;
    }

    @Override
    public boolean isAvailable() {
        // Assuming magazines are always available for simplicity
        return true;
    }
}