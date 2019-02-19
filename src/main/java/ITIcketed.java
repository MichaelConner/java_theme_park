public interface ITIcketed {

    double defaultPrice();

    double priceFor(Visitor visitor);

}
