import java.util.Arrays;

class MoviesArray {

    String [] moviesArray = {"Raiders of the Lost Ark", "Indiana Jones and the Temple of Doom", "Indiana Jones and the Last Crusade", "Indiana Jones and the Kingdom of he Crystal Skulls", };
    String[] moviesArray2 = Arrays.copyOf(moviesArray, moviesArray.length + 2);

    int lastPreviousIndex = moviesArray.length - 1;

    moviesArray2[lastPreviousIndex + 1] = "Indiana Jones and the Fate of Atlantis";
    moviesArray2[lastPreviousIndex + 2] = "Indiana Jones and Facebook's Personal Data";
} 
