package Private.AtmCard;

import static Private.AtmCard.CardType.*;

public class CardMain {


	public static void main(String[] args) {
		AtmCard card_1 = new AtmCard("Royal", "Oviomaigho", "Ewomaoghene", "UBA", MASTER_CARD);
		card_1.getCardDetails();
		System.out.println("-----------------------------------------------------");
		AtmCard card_2 = new AtmCard("Pauline", "Adaeze", "Wayuma", "WEMA", VISA_CARD);
		card_2.getCardDetails();
		System.out.println("-----------------------------------------------------");
		AtmCard card_3 = new AtmCard("Paul", "Ada", "Wa", "WEMA", VERVE);
		card_3.getCardDetails();

//		card_1.validateCardType();


}
}
