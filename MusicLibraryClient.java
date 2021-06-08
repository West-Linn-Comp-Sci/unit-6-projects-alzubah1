public class MusicLibraryClient {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();

        Album a1 = new Album("First", "one Guy", 10, 42.5);
        Album a2 = new Album("This Music", "Some Band", 9, 36);
        Album a3 = new Album("Play", "People", 12, 39.1);

        myLibrary.add(a1);
        myLibrary.add(a2);

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.doubleSize();

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.remove(1);
        myLibrary.add(a3);
        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        myLibrary.add(new Album("aTitle", "aArtist", 10, 30.2));
        myLibrary.add(new Album("bTitle", "bArtist", 10, 30.3));
        myLibrary.add(new Album("cTitle", "cArtist", 10, 30.1));
        myLibrary.sortByPlayTime();
        
        System.out.println(myLibrary);
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        myLibrary.sortByTitle();
        
        System.out.println(myLibrary);
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        System.out.println(myLibrary.linSearchTitle("bTitle"));
        System.out.println(myLibrary.linSearchArtist("cArtist"));
        System.out.println(myLibrary.binarySearch("bTitle"));
    }
}
