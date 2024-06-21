package Third_Assignment;


import java.util.ArrayList;

public class Task03 {

    class Movie{
        String title;
        String studio;
        String rating;

        public Movie(String title,String studio,String rating){
                this.title = title;
                this.studio = studio;
                this.rating = rating;
        }
        public Movie(String title,String studio){
                this.title = title;
                this.studio = studio;
                rating = "PG";
        }
/*
        public Movie[] getPG (Movie[] movies){
            ArrayList<Movie> pgMovies = new ArrayList<>();
            for(Movie movie : movies){
                if(movie.rating.equals("PG")) {
                    pgMovies.add(movie);
                }
                }

            }
            return pgMovies.toArray(new Movie[0]);
        }*/

        /*

         public Movie[] getPG(Movie[] movies) {
            ArrayList<Movie> pgMovies = new ArrayList<>();
            for (Movie movie : movies) {
                if (movie.rating.equals("PG")) {
                    pgMovies.add(movie);
                }
            }
            return pgMovies.toArray(new Movie[0]);
        }

        * ****/


        public static void main(String[]args){

        }
    }




}
