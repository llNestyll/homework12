 public class Main {
         public static void main(String[] args){
                System.out.println("Классы и объекты");
                System.out.println();
                Author nikolayGogol = new Author("Николай", "Гоголь");
                System.out.println(nikolayGogol.getName());
                System.out.println(nikolayGogol.getLastname());
                System.out.println();
                Author alexandrBelaev = new Author("Александр", "Беляев");
                System.out.println(alexandrBelaev.getName());
                System.out.println(alexandrBelaev.getLastname());
                System.out.println();
                Book deadSoul = new Book("Мертвые души", 1842 , nikolayGogol);
                System.out.println(deadSoul.getTitle());
                System.out.println(deadSoul.getYear());
                System.out.println(deadSoul.getNameOfAuthor());
                System.out.println();
                System.out.println("Меняем год книги - Мертвые души");
                deadSoul.setYear(1860);
                System.out.println(deadSoul.getYear());
                System.out.println();
                Book amphibianMan = new Book("Человек-амфибия", 1927, alexandrBelaev);
                System.out.println(amphibianMan.getTitle());
                System.out.println(amphibianMan.getYear());
                System.out.println(amphibianMan.getNameOfAuthor());
                System.out.println();
                System.out.println("Меняем год книги - Человек-амфибия");
                amphibianMan.setYear(1950);
                System.out.println(amphibianMan.getYear());
        }
    }

