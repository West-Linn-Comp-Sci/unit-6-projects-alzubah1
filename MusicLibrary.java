public class MusicLibrary{
    private Album[] Library;
    private boolean sortedByTitle = false;
    public MusicLibrary() {
        Library = new Album[10];
    }
    public void add(Album album) {
        for (int i = 0; i < Library.length; i++) {
            if (Library[i] == null) {
                Library[i] = album;
                break;
            }
        }
    }
    public void remove(int index) {
        Library[index - 1] = null;
    }
    public void doubleSize() {
         Album[] temp = new Album[Library.length * 2];
    } 
    public int linSearchTitle(String target) {
        for (int i = 0; i < Library.length; i++) {
            if (Library[i].getTitle().equals(target)) {
                return i;
            }
        }
        return -1;
    }
    public int linSearchArtist(String target) {
        for (int i = 0; i < Library.length; i++) {
            if (Library[i].getArtist().equals(target)) {
                return i;
            }
        }
        return -1;
    }
    public void sortByTitle() {
        Album temp;
        for (int i = 0; i < Library.length - 1; i++) {
            for (int j = i + 1; j < Library.length; j++) {
                if (!(Library[j] != null)) {
                    break;
                }
                if (Library[i].getTitle().compareToIgnoreCase(Library[j].getTitle()) > 0) {
                    temp = Library[i];
                    Library[i] = Library[j];
                    Library[j] = temp;
                }
            }
        }
        sortedByTitle = true;
    }
    public void sortByPlayTime() {
        Album temp;
        for (int i = 0; i < Library.length - 1; i++) {
            for (int j = i + 1; j < Library.length; j++) {
                if (!(Library[j] != null)) {
                    break;
                }
                if (Library[i].getPlayTime() < Library[j].getPlayTime()) {
                    temp = Library[i];
                    Library[i] = Library[j];
                    Library[j] = temp;
                }
            }
        }
        sortedByTitle = false;
    }
    public int binarySearch(String target) {
        if (!sortedByTitle) {
            return -1;
        }
        int low = 0, high = Library.length-1, middle = (low + high)/2;
        while (Library[middle].getTitle() != target && low <= high){
            if (target.compareToIgnoreCase(Library[middle].getTitle()) < 0) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
            middle = (low + high)/2;
        }
        if (Library[middle].getTitle().equals(target))
            return middle;
        else
        return -1;
    }
    public String toString() {
        String output = "My Library\n";
        for (int i = 0; i < Library.length; i++) {
            output += ("Album " + (i + 1) + ": ");
            if (Library[i] != null) {
                output += (Library[i].getArtist() + " - " + Library[i].getTitle() + 
                " [" + Library[i].getNumTracks() + " tracks] [" + Library[i].getPlayTime() + "]\n");
            } else output += "[EMPTY]\n";
        }
        return output;
    }
}
