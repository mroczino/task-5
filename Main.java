public class Main {
public static void main(String[] args) {
User guest1 = new User("s30985@gmail.com");
User guest2 = new User("xdxd@gmail.com");
User user1 = new User("Marian","Kruszwil","marian@gmail.com","maniek8989");
guest2.guestToUser("Adam","kaliński","86845");

Product p1 = new Product("jellybeans", 11, "1034312", 2);
Product p2 = new Product("rockstarenergy", 2, "276886");
Product p3 = new Product("Snickers", 6, "34535634", 10);
p2.changePrice(3);
p3.changeNumOfPieces(15);

}
}
