public class Cinema {

}

    class Movie {
        String title;
        String genre;
        int durationMinutes;

        public Movie(String title, String genre, int durationMinutes) {
            this.title = title;
            this.genre = genre;
            this.durationMinutes = durationMinutes;
        }

        public void showMovieInfo() {
            System.out.println("Film: " + title + " (" + genre + ", " + durationMinutes + " min)");
        }
    }

    class Screening {
        Movie movie;
        String time;
        int availableSeats;

        public Screening(Movie movie, String time, int availableSeats) {
            this.movie = movie;
            this.time = time;
            this.availableSeats = availableSeats;
        }

        public boolean reserveSeats(int count) {
            if (count > 0 && availableSeats >= count) {
                availableSeats -= count;
                return true;
            }
            return false;
        }

        public void showScreeningInfo() {
            System.out.println("Seans o godz. " + time + " | Wolne miejsca: " + availableSeats);
            movie.showMovieInfo();
        }
    }

    class Viewer {
        String name;
        int ticketsOwned;

        public Viewer(String name) {
            this.name = name;
            this.ticketsOwned = 0;
        }

        public void buyTicket(Screening screening, int count) {
            if (screening.reserveSeats(count)) {
                this.ticketsOwned += count;
                System.out.println(name + " kupił(a) " + count + " bilet(y) na film " + screening.movie.title + ".");
            } else {
                System.out.println("Brak wystarczającej liczby miejsc dla: " + name);
            }
        }
    }
