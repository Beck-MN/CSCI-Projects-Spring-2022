package hw1;


public class Printer {
	
    // store Tray Capacity
    private int trayCapacity;
    // store Sheets available for printing
    private int availableSheets;
    // store the total pages in a document
    private int documentPages;
    // store the next page to print in a document
    private int nextPage;
    // store the total pages printed by the printer so far
    private int totalPages;
    // store the total pages in tray
    private int sheetsInTray;

    // Constructor to set the parameters
    public Printer(int trayCapacity) {
        this.trayCapacity = trayCapacity;
        this.availableSheets = 0;
        this.totalPages = 0;
    }
    // Function to set the size of the document to be printed
    public void startPrintJob(int documentPages) {
        this.documentPages = documentPages;
    }

    // Function to return the number of sheets available for printing
    public int getSheetsAvailable() {
        return this.availableSheets;
    }

    // Function to get the next page number to be printed for the document
    public int getNextPage() {
        return this.nextPage;
    }

    // Function to return the total number of pages printed by the printer
    public int getTotalPages() {
        return this.totalPages;
    }

    // Function to simulate printing of a page by the printer
    public void printPage() {
    	
        // Only print if there are sheets available
        if(this.availableSheets == 0)
            return;

        // Increments the counter for the next page
        this.nextPage = (this.nextPage + 1) % this.documentPages;
        // Increments the counter for total pages printed
        this.totalPages++;
        // Decreases the number of available sheets by 1.
        this.availableSheets = Math.max(this.availableSheets - 1, 0);
    }

    //removes the tray and make available sheets to 0
    public void removeTray() {
    	this.sheetsInTray = this.availableSheets;
        this.availableSheets = 0;
    }
    
    // replaces recentlly removed tray
    public void replaceTray() {
    	this.availableSheets = this.sheetsInTray;
    }

    // adds sheets into the printer upto tray capacity
    public void addPaper(int sheets) {
        this.availableSheets = Math.min(this.availableSheets+sheets, this.trayCapacity);
    }

    // removes the available sheets from the printer
    public void removePaper(int sheets) {
        this.availableSheets = Math.max(this.availableSheets-sheets, 0);
    }
}
