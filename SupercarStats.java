import java.util.Scanner;
import java.util.Random;

public class SupercarStats {

	public static void printS(String s) {
		System.out.println(s);
	}// Prints a string

	public static void printI(long i) {
		System.out.println(i);
	}// Prints an integer

	public static void main(String[] args) {
		try (Scanner myScanner = new Scanner(System.in)) {
			printS("Enter the supercar name here (type \"list\" for the list of cars available, \n\"fastest\" for the fastest among them, \"fastest acceleration\" for the car with the fastest acceleration, \n\"random\" for a random car, \"last added\" for the last added car, \"engine type\" to search by engine type, \n\"brand\" to search by brand, \"highest rpm\" to search for the car with the highest rpm, \n\"highest hp\" to search for the car with the highest HorsePower, \n\"lowest rpm\" to search for the car with the lowest rpm and \"lowest hp\" to search for the car with the lowest hp):\n");
			String carname = myScanner.nextLine();
			
			String[] carNum = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
			Random randomNum = new Random();
			int randomCarNum = randomNum.nextInt(carNum.length);
			
			String[] carNames = {"Aston Martin One-77", "Bugatti Chiron Super Sport", "Bugatti Veyron", "Chevrolet Camaro ZL1", "Devel 16", "Koenigsegg Agera RS", "Koenigsegg Gemera", "Koenigsegg Jesko", "Lamborghini Asterion", "Lamborghini Aventador", "Lamborghini Huracan", "Lamborghini Sián FKP 37", "Lamborghini Terzo Millenio", "Lamborghini Veneno", "McLaren 12C Spider", "McLaren Senna", "McLaren Speedtail", "Nissan GT-R Nismo", "Porsche 918 Spyder"};
			int[] topSpeeds = {319, 320, 325, 325, 329, 330, 335, 340, 348, 350, 351, 354, 355, 400, 403, 410, 439, 447, 483, 560};

			switch (carname) {
			
				case "Chevrolet Camaro ZL1":
					printS("\nChevrolet Camaro ZL1:" + "\n\nTop Speed: " + topSpeeds[0] + "km/h" + "\nAcceleration Speed: 3.6 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 6400" + "\nHorsePower: 650" + "\nMileage: 15L/100km" + "\nDefining Features: Powerful Engine, Strong, Stylish and Iconic Design");
					break;
					
				case "Lamborghini Asterion":
					printS("\nLamborghini Asterion:" + "\n\nTop Speed: " + topSpeeds[1] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: V10" + "\nRPM: 8250" + "\nHorsePower: 897" + "\nMileage: 4L/100km, 50km/Fully Charged Battery" + "\nDefining Features: Bulky, Sleek and Subtle Design, Powerful Engine, Hexagonal Dual Twin Exhausts");

				case "Lamborghini Huracan":
					printS("\nLamborghini Huracan:" + "\n\nTop Speed: " + topSpeeds[2] + "km/h" + "\nAcceleration Speed: 2.9 seconds to 100km/h" + "\nEngine Type: V10" + "\nRPM: 8000" + "\nHorsePower: 630" + "\nMileage: 15L/100km" + "\nDefining Features: Optional Convertible, Sleek and Stylish Design, Exhausts on Sides of License Plate");
					break;
					
				case "Lamborghini Terzo Millenio":
					printS("\nLamborghini Terzo Millenio:" + "\n\nTop Speed: " + topSpeeds[3] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 8000" + "\nHorsePower: 630" + "\nMileage: 350km/Fully Charged Battery" + "\nDefining Features: Self-Driving on Race Tracks, Separate Engines on Each Wheel, Futuristic Design, Can Fix Itself If It Is Damaged");
					break;
					
				case "McLaren 12C Spider":
					printS("\nMcLaren 12C Spider:" + "\n\nTop Speed: " + topSpeeds[4] + "km/h" + "\nAcceleration Speed: 3.1 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 7000" + "\nHorsePower: 616" + "\nMileage: 21L/100km" + "\nDefining Features: Rocket-Like Exhausts, Sleek Exterior");
					break;
					
				case "Nissan GT-R Nismo":
					printS("\nNissan GT-R Nismo:" + "\n\nTop Speed: " + topSpeeds[5] + "km/h" + "\nAcceleration Speed: 2.6 seconds to 100km/h" + "\nEngine Type: V6" + "\nRPM: 6800" + "\nHorsePower: 600" + "\nMileage: 13L/100km" + "\nDefining Features: Powerful Engine, Dual Twin Exhausts, Signature GT-R Circular Taillights, Bulky, Tough, Compact Design");
					break;
					
				case "Mclaren Senna":
					printS("\nMcLaren Senna:" + "\n\nTop Speed: " + topSpeeds[6] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 7250" + "\nHorsePower: 789" + "\nMileage: 15L/100km" + "\nDefining Features: Sleek, Streamlined Design, Powerful Engine, Linear Taillights, 2 \'Pockets\' on Front Bumper, Tri-Exhausts at Top Rear");
					break;
										
				case "Porsche 918 Spyder":
					printS("\nPorsche 918 Spyder:" + "\n\nTop Speed: " + topSpeeds[7] + "km/h" + "\nAcceleration Speed: 2.3 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 8700" + "\nHorsePower: 887" + "\nMileage: 695km/Fully Charged Battery and Full Gas Tank (10L/100km of gas and 31kwh/100km)" + "\nDefining Features: Side Exhausts, Optional Convertible, Sleek Design");
					break;

				case "Ford GT":
					printS("\nFord GT" + "\n\nTop Speed: " + topSpeeds[8] + "km/h" + "\nAcceleration Speed: 3.1 seconds to 100km/h" + "\nEngine Type: V6" + "\nRPM: 6500" + "\nHorsePower: 660" + "\nMileage: 17L/100km" + "\nDefining Features: Sleek and Strong Design, Circular Taillights, 2 Small Rocket-Like Exhausts");
					break;

				case "Lamborghini Sián FKP 37":
					printS("\nLamborghini Sián FKP 37" + "\n\nTop Speed: " + topSpeeds[9] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 8500" + "\nHorsePower: 774" + "\nMileage: 2800L/100km's Equivalent of Battery and Gas Usage (Hybrid)" + "\nDefining Features: Strong, Sleek and Racecar-Like Design, Unique Headlight and Taillight Design, 2 Large Flipped, Pentagonal Exhausts");
					break;
				
				case "Lamborghini Aventador":
					printS("\nLamborghini Aventador:" + "\n\nTop Speed: " + topSpeeds[10] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 8500" + "\nHorsePower: 759" + "\nMileage: 20L/100km" + "\nDefining Features: Single, Wide Rear Exhaust, Sleek and Stylish Design");
					break;
			
				case "Aston Martin One-77":
					printS("\nAston Martin One-77:" + "\n\nTop Speed: " + topSpeeds[11] + "km/h" + "\nAcceleration Speed: 3.6 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 6500" + "\nHorsePower: 750" + "\nMileage: 17L/100km" + "\nDefining Features: Sleek and Compact Design");
					break;

				case "Lamborghini Veneno":
					printS("\nLamborghini Veneno:" + "\n\nTop Speed: " + topSpeeds[12] + "km/h" + "\nAcceleration Speed: 2.9 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 8400" + "HorsePower: 750" + "\nMileage: 18L/100km" + "\nDefining Features: Sharp, Spiky Front, Futuristic and Strong Design, Tough, Solid and Sleek Exterior");
					break;

				case "Koenigsegg Gemera":
					printS("\nKoenigsegg Gemera:" + "\n\nTop Speed:" + topSpeeds[13] + "km/h" + "\nAcceleration Speed: 1.9 seconds to 100km/h" + "\nEngine Type: TFG(3-Cylinder Engine)" + "\nRPM: 8500" + "\nHorsePower: 1700" + "\nMileage: 13/L and 50km/full battery" + "Defining Features: Sleek, Exotic Look, Extremely Powerful Engine, Dual Oval-Shaped, Angled (Outward) Exhausts at Rear Windshield Area");
					break;
					
				case "McLaren Speedtail":
					printS("\nMcLaren Speedtail:" + "\n\nTop Speed: " + topSpeeds[14] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 6500" + "\nHorsePower: 747" + "\nMileage: 16L/100km" + "\nDefining Features: Aerodynamic, Sleek, Wide, Futuristic look, Powerful Engine, Dual Hidden Circular Exhausts, Linear Taillight From Rear to Roof, Digital Rearview Cameras Replacing Sideview Mirrors");
					break;
					
				case "Bugatti Veyron":
					printS("\nBugatti Veyron:" + "\n\nTop Speed: " + topSpeeds[15] + "km/h" + "\nAcceleration Speed: 2.5 seconds to 100km/h" + "\nEngine Type: W16 (Equal to 2 V8 engines combined)" + "\nRPM: 6400" + "\nHorsePower: 1184" + "\nMileage: 25L/100km" + "\nDefining Features: Bulky Design, Extremely Powerful Engine, Single Large Exhaust, Circular Taillights");
					break;
					
				case "Bugatti Chiron Super Sport":
					printS("\nBugatti Chiron Super Sport:" + "\n\nTop Speed: " + topSpeeds[16] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: W16" + "\nRPM: 7100" + "\nHorsePower: 1577" + "\nMileage: Unknown" + "\nDefining Features: Wide, Low and Sleek Design, Extremely Powerful Engine, Quickly Burns Through Gas, 2 Large Exhausts, Single Line Taillight");
					break;
					
				case "Koenigsegg Agera RS":
					printS("\nKoenigsegg Agera RS" + "\n\nTop Speed: " + topSpeeds[17] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 6900" + "\n949" + "\nMileage: 12.5L/100km" + "\nDefining Features: Sleek and Low Design, Very Innovative V8 Engine, Single, Large, Flipped Trapezoid-Shaped Exhaust");
					break;
				
				case "Koenigsegg Jesko":
					printS("\nKoenigsegg Jesko:" + "\n\nTop Speed: " + topSpeeds[18] + "km/h" + "\nAcceleration Speed: 2.6 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 8500" + "\nHorsePower: 1280" + "\nMileage: Unknown" + "\nDefining Features: Sleek, Futuristic Design, Very Innovative V8 Engine, Wide and Low Body, Single, Wide Rocket-Like Exhaust");
					break;
				
				case "Devel 16":
					printS("\nDevel 16: " + "\n\nTop Speed: " + topSpeeds[19] + "km/h" + "\nAcceleration Speed: 2 seconds to 100 km/h" + "\nEngine Type: V16" + "\nRPM: 6900" + "\nHorsePower: 5000" + "\nMileage: Unknown" + "\nDefining Features: Futuristic, Sleek and Low Design, Lamborghini Veneno-like Front, 2 Large Rocket-Like Exhausts");
					break;

				case "list":
					printS("");
					for (int cn = 0; cn < carNames.length; cn += 1) {
						printS((cn + 1) + ". " + carNames[cn]);
					}
					break;
					
				case "random":
					
					switch (randomCarNum) {
					
						case 1:
							printS("\nChevrolet Camaro ZL1:" + "\n\nTop Speed: " + topSpeeds[0] + "km/h" + "\nAcceleration Speed: 3.6 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 6400" + "\nHorsePower: 650" + "\nMileage: 15L/100km" + "\nDefining Features: Powerful Engine, Strong, Stylish and Iconic Design");
							break;

						case 2:
							printS("\nLamborghini Asterion:" + "\n\nTop Speed: " + topSpeeds[1] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: V10" + "\nRPM: 8250" + "\nHorsePower: 897" + "\nMileage: 4L/100km, 50km/Fully Charged Battery" + "\nDefining Features: Bulky, Sleek and Subtle Design, Powerful Engine, Hexagonal Dual Twin Exhausts");
							break;
							
						case 3:
							printS("\nLamborghini Huracan:" + "\n\nTop Speed: " + topSpeeds[2] + "km/h" + "\nAcceleration Speed: 2.9 seconds to 100km/h" + "\nEngine Type: V10" + "\nRPM: 8000" + "\nHorsePower: 630" + "\nMileage: 15L/100km" + "\nDefining Features: Optional Convertible, Sleek and Stylish Design, Exhausts on Sides of License Plate");
							break;
							
						case 4:
							printS("\nLamborghini Terzo Millenio:" + "\n\nTop Speed: " + topSpeeds[3] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 8000" + "\nHorsePower: 630" + "\nMileage: 350km/Fully Charged Battery" + "\nDefining Features: Self-Driving on Race Tracks, Separate Engines on Each Wheel, Futuristic Design, Can Fix Itself If It Is Damaged");
							break;
						
						case 5:
							printS("\nMcLaren 12C Spider:" + "\n\nTop Speed: " + topSpeeds[4] + "km/h" + "\nAcceleration Speed: 3.1 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 7000" + "\nHorsePower: 616" + "\nMileage: 21L/100km" + "\nDefining Features: Rocket-Like Engines, Sleek Exterior");
							break;
							
						case 6:
							printS("\nNissan GT-R Nismo:" + "\n\nTop Speed: " + topSpeeds[5] + "km/h" + "\nAcceleration Speed: 2.6 seconds to 100km/h" + "\nEngine Type: V6" + "\nRPM: 6800" + "\nHorsePower: 600" + "\nMileage: 13L/100km" + "\nDefining Features: Powerful Engine, Dual Twin Exhausts, Signature GT-R Circular Taillights, Bulky, Tough, Compact Design");							
							break;
							
						case 7:
							printS("\nMcLaren Senna:" + "\n\nTop Speed: " + topSpeeds[6] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 7250" + "\nHorsePower: 789" + "\nMileage: 15L/100km" + "\nDefining Features: Sleek, Streamlined Design, Powerful Engine, Linear Taillights, 2 \'Pockets\' on Front Bumper, Tri-Exhausts at Top Rear");
							break;
							
						case 8:
							printS("\nPorsche 918 Spyder:" + "\n\nTop Speed: " + topSpeeds[7] + "km/h" + "\nAcceleration Speed: 2.3 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 8700" + "\nHorsePower: 887" + "\nMileage: 695km/Fully Charged Battery and Full Gas Tank (10L/100km of gas and 31kwh/100km)" + "\nDefining Features: Side Exhausts, Optional Convertible, Sleek Design");
							break;

						case 9:
							printS("\nFord GT" + "\n\nTop Speed: " + topSpeeds[8] + "km/h" + "\nAcceleration Speed: 3.1 seconds to 100km/h" + "\nEngine Type: V6" + "\nRPM: 6500" + "\nHorsePower: 660" + "\nMileage: 17L/100km" + "\nDefining Features: Sleek and Strong Design, Circular Taillights, 2 Small Rocket-Like Exhausts");
							break;
							
						case 10:
							printS("\nLamborghini Sián FKP 37" + "\n\nTop Speed: " + topSpeeds[9] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 8500" + "\nHorsePower: 774" + "\nMileage: 2800L/100km's Equivalent of Battery and Gas Usage (Hybrid)" + "\nDefining Features: Strong, Sleek and Racecar-Like Design, Unique Headlight and Taillight Design, 2 Large Flipped, Pentagonal Exhausts");
							break;

						case 11:
							printS("\nLamborghini Aventador:" + "\n\nTop Speed: " + topSpeeds[10] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 8500" + "\nHorsePower: 759" + "\nMileage: 20L/100km" + "\nDefining Features: Single, Wide Rear Exhaust, Sleek and Stylish Design");
							break;
						
						case 12:
							printS("\nAston Martin One-77:" + "\n\nTop Speed: " + topSpeeds[11] + "km/h" + "\nAcceleration Speed: 3.6 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 6500" + "\nHorsePower: 750" + "\nMileage: 17L/100km" + "\nDefining Features: Sleek and Compact Design");
							break;

						case 13:
							printS("\nLamborghini Veneno:" + "\n\nTop Speed: " + topSpeeds[12] + "km/h" + "\nAcceleration Speed: 2.9 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 8400" + "\nHorsePower: 750" + "\nMileage: 18L/100km" + "\nDefining Features: Sharp, Spiky Front, Futuristic and Strong Design, Tough, Solid and Sleek Exterior");
							break;
							
						case 14:
							printS("\nKoenigsegg Gemera:" + "\n\nTop Speed: " + topSpeeds[13] + "km/h" + "\nAcceleration Speed: 1.9 seconds to 100km/h" + "\nEngine Type: TFG(3-Cylinder Engine)" + "\nRPM: 8500" + "\nHorsePower: 1700" + "\nMileage: 13/L and 50km/full battery" + "Defining Features: Sleek, Exotic Look, Extremely Powerful Engine, Dual Oval-Shaped, Angled (Outward) Exhausts at Rear Windshield Area");
							break;
							
						case 15:
							printS("\nMcLaren Speedtail:" + "\n\nTop Speed: " + topSpeeds[14] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 6500" + "\nHorsePower: 747" + "\nMileage: 16L/100km" + "\nDefining Features: Aerodynamic, Sleek, Wide, Futuristic look, Powerful Engine, Dual Hidden Circular Exhausts, Linear Taillight From Rear to Roof, Digital Rearview Cameras Replacing Sideview Mirrors");
							break;

						case 16:
							printS("\nBugatti Veyron:" + "\n\nTop Speed: " + topSpeeds[15] + "km/h" + "\nAcceleration Speed: 2.5 seconds to 100km/h" + "\nEngine Type: W16 (Equal to 2 V8 engines combined)" + "\nRPM: 6400" + "\nHorsePower: 1184" + "\nMileage: 25L/100km" + "\nDefining Features: Bulky Design, Extremely Powerful Engine, Single Large Exhaust, Circular Taillights");
							break;
							
						case 17:
							printS("\nBugatti Chiron Super Sport:" + "\n\nTop Speed: " + topSpeeds[16] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: W16" + "\nRPM: 7100" + "\nHorsePower: 1577" + "\nMileage: Unknown" + "\nDefining Features: Wide, Low and Sleek Design, Extremely Powerful Engine, Quickly Burns Through Gas, 2 Large Exhausts, Single Line Taillight");
							break;
						
							
						case 18:
							printS("\nKoenigsegg Agera RS" + "\n\nTop Speed: " + topSpeeds[17] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 6900" + "\n949" + "\nMileage: 12.5L/100km" + "\nDefining Features: Sleek and Low Design, Very Innovative V8 Engine, Single, Large, Flipped Trapezoid-Shaped Exhaust");
							break;

						case 19:
							printS("\nKoenigsegg Jesko:" + "\n\nTop Speed: " + topSpeeds[18] + "km/h" + "\nAcceleration Speed: 2.6 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 8500" + "\nHorsePower: 1280" + "\nMileage: Unknown" + "\nDefining Features: Sleek, Futuristic Design, Very Innovative V8 Engine, Wide and Low Body, Single, Wide Rocket-Like Exhaust");
							break;
						
						case 20:
							printS("\nDevel 16: " + "\n\nTop Speed: " + topSpeeds[19] + "km/h" + "\nAcceleration Speed: 2 seconds to 100 km/h" + "\nEngine Type: V16" + "\nRPM: 6900" + "\nHorsePower: 5000" + "\nMileage: Unknown" + "\nDefining Features: Futuristic, Sleek and Low Design, Lamborghini Veneno-like Front, 2 Large Rocket-Like Exhausts");
							break;

					}
					
					break;

				case "fastest":
						printS("\nDevel 16: " + "\n\nTop Speed: " + topSpeeds[19] + "km/h" + "\nAcceleration Speed: 2 seconds to 100 km/h" + "\nEngine Type: V16" + "\nRPM: 6900" + "\nHorsePower: 5000" + "\nMileage: Unknown" + "\nDefining Features: Futuristic, Sleek and Low Design, Lamborghini Veneno-like Front, 2 Large Rocket-Like Exhausts");
						break;	

				case "fastest acceleration":
					printS("\nKoenigsegg Gemera:" + "\n\nTop Speed: " + topSpeeds[13] + "km/h" + "\nAcceleration Speed: 1.9 seconds to 100km/h" + "\nEngine Type: TFG(3-Cylinder Engine)" + "\nRPM: 8500" + "\nHorsePower: 1700" + "\nMileage: 13/L and 50km/full battery" + "Defining Features: Sleek, Exotic Look, Extremely Powerful Engine, Dual Oval-Shaped, Angled (Outward) Exhausts at Rear Windshield Area");
					break;

				case "engine type":	
					printS("\nAvailable engine types: V8, V10, V12, V16, W16 and TFG. Enter an engine type here to search for cars with that engine type: ");
					String enginetype = myScanner.nextLine();

					switch (enginetype) {
						
						case "V6":
							printS("\nFord GT" + "\n\nTop Speed: " + topSpeeds[8] + "km/h" + "\nAcceleration Speed: 3.1 seconds to 100km/h" + "\nRPM: 6500" + "\nHorsePower: 660" + "\nMileage: 17L/100km" + "\nDefining Features: Sleek and Strong Design, Circular Taillights, 2 Small Rocket-Like Exhausts");							
							printS("\nNissan GT-R Nismo:" + "\n\nTop Speed: " + topSpeeds[5] + "km/h" + "\nAcceleration Speed: 2.6 seconds to 100km/h" + "\nEngine Type: V6" + "\nRPM: 6800" + "\nHorsePower: 600" + "\nMileage: 13L/100km" + "\nDefining Features: Powerful Engine, Dual Twin Exhausts, Signature GT-R Circular Taillights, Bulky, Tough, Compact Design");

						case "V8":
							printS("\nChevrolet Camaro ZL1:" + "\n\nTop Speed: " + topSpeeds[0] + "km/h" + "\nAcceleration Speed: 3.6 seconds to 100km/h" + "\nRPM: 6400" + "\nHorsePower: 650" + "\nMileage: 15L/100km" + "\nDefining Features: Powerful Engine, Strong, Stylish and Iconic Design");
							printS("\nMcLaren 12C Spider:" + "\n\nTop Speed: " + topSpeeds[4] + "km/h" + "\nAcceleration Speed: 3.1 seconds to 100km/h" + "\nRPM: 7000" + "\nHorsePower: 616" + "\nMileage: 21L/100km" + "\nDefining Features: Rocket-Like Engines, Sleek Exterior");							
							printS("\nMcLaren Senna:" + "\n\nTop Speed: " + topSpeeds[6] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 7250" + "\nHorsePower: 789" + "\nMileage: 15L/100km" + "\nDefining Features: Sleek, Streamlined Design, Powerful Engine, Linear Taillights, 2 \'Pockets\' on Front Bumper, Tri-Exhausts at Top Rear");
							printS("\nPorsche 918 Spyder:" + "\n\nTop Speed: " + topSpeeds[7] + "km/h" + "\nAcceleration Speed: 2.3 seconds to 100km/h" + "\nRPM: 8700" + "\nHorsePower: 887" + "\nMileage: 695km/Fully Charged Battery and Full Gas Tank (10L/100km of gas and 31kwh/100km)" + "\nDefining Features: Side Exhausts, Optional Convertible, Sleek Design");
							printS("\nMcLaren Speedtail:" + "\n\nTop Speed: " + topSpeeds[14] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 6500" + "\nHorsePower: 747" + "\nMileage: 16L/100km" + "\nDefining Features: Aerodynamic, Sleek, Wide, Futuristic look, Powerful Engine, Dual Hidden Circular Exhausts, Linear Taillight From Rear to Roof, Digital Rearview Cameras Replacing Sideview Mirrors");
							printS("\nKoenigsegg Agera RS" + "\n\nTop Speed: " + topSpeeds[17] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nRPM: 6900" + "\nHorsePower: 949" + "\nMileage: 12.5L/100km" + "\nDefining Features: Sleek and Low Design, Very Innovative V8 Engine, Single, Large, Flipped Trapezoid-Shaped Exhaust");
							printS("\nKoenigsegg Jesko:" + "\n\nTop Speed: " + topSpeeds[18] + "km/h" + "\nAcceleration Speed: 2.6 seconds to 100km/h" + "\nRPM: 8500" + "\nHorsePower: 1280" + "\nMileage: Unknown" + "\nDefining Features: Sleek, Futuristic Design, Very Innovative V8 Engine, Wide and Low Body, Single, Wide Rocket-Like Exhaust");
							break;

						case "V10":
							printS("\nLamborghini Asterion:" + "\n\nTop Speed: " + topSpeeds[1] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: V10" + "\nRPM: 8250" + "\nHorsePower: 897" + "\nMileage: 4L/100km, 50km/Fully Charged Battery" + "\nDefining Features: Bulky, Sleek and Subtle Design, Powerful Engine, Hexagonal Dual Twin Exhausts");
							printS("\nLamborghini Huracan:" + "\n\nTop Speed: " + topSpeeds[2] + "km/h" + "\nAcceleration Speed: 2.9 seconds to 100km/h" + "\nRPM: 8000" + "\nHorsePower: 630" + "\nMileage: 15L/100km" + "\nDefining Features: Optional Convertible, Sleek and Stylish Design, Exhausts on Sides of License Plate");							
							break;

						case "V12":
							printS("\nAston Martin One-77:" + "\n\nTop Speed: " + topSpeeds[11] + "km/h" + "\nAcceleration Speed: 3.6 seconds to 100km/h" + "\nRPM: 6500" + "\nHorsePower: 750" + "\nMileage: 17L/100km" + "\nDefining Features: Sleek and Compact Design");							
							printS("\nLamborghini Aventador:" + "\n\nTop Speed: " + topSpeeds[10] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nRPM: 8500" + "\nHorsePower: 759" + "\nMileage: 20L/100km" + "\nDefining Features: Single, Wide Rear Exhaust, Sleek and Stylish Design");
							printS("\nLamborghini Sián FKP 37" + "\n\nTop Speed: " + topSpeeds[9] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nRPM: 8500" + "\nHorsePower: 774" + "\nMileage: 2800L/100km's Equivalent of Battery and Gas Usage (Hybrid)" + "\nDefining Features: Strong, Sleek and Racecar-Like Design, Unique Headlight and Taillight Design, 2 Large Flipped, Pentagonal Exhausts");
							printS("\nLamborghini Terzo Millenio:" + "\n\nTop Speed: " + topSpeeds[3] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 8000" + "\nHorsePower: 630" + "\nMileage: 350km/Fully Charged Battery" + "\nDefining Features: Self-Driving on Race Tracks, Separate Engines on Each Wheel, Futuristic Design, Can Fix Itself If It Is Damaged");
							printS("\nLamborghini Veneno:" + "\n\nTop Speed: " + topSpeeds[12] + "km/h" + "\nAcceleration Speed: 2.9 seconds to 100km/h" + "\nRPM: 8400" + "HorsePower: 750" + "\nMileage: 18L/100km" + "\nDefining Features: Sharp, Spiky Front, Futuristic and Strong Design, Tough, Solid and Sleek Exterior");
							break;

						case "V16":
							printS("\nDevel 16: " + "\n\nTop Speed: " + topSpeeds[19] + "km/h" + "\nAcceleration Speed: 2 seconds to 100 km/h" + "\nEngine Type: V16" + "\nRPM: 6900" + "\nHorsePower: 5000" + "\nMileage: Unknown" + "\nDefining Features: Futuristic, Sleek and Low Design, Lamborghini Veneno-like Front, 2 Large Rocket-Like Exhausts");
							break;

						case "W16":
							printS("\nBugatti Chiron Super Sport:" + "\n\nTop Speed: " + topSpeeds[16] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nRPM: 7100" + "\nHorsePower: 1577" + "\nMileage: Unknown" + "\nDefining Features: Wide, Low and Sleek Design, Extremely Powerful Engine, Quickly Burns Through Gas, 2 Large Exhausts, Single Line Taillight");
							printS("\nBugatti Veyron:" + "\n\nTop Speed: " + topSpeeds[15] + "km/h" + "\nAcceleration Speed: 2.5 seconds to 100km/h" + "\nRPM: 6400" + "\nHorsePower: 1184" + "\nMileage: 25L/100km" + "\nDefining Features: Bulky Design, Extremely Powerful Engine, Single Large Exhaust, Circular Taillights");
							break;
						
						case "TFG":
							printS("\nKoenigsegg Gemera:" + "\n\nTop Speed: " + topSpeeds[13] + "km/h" + "\nAcceleration Speed: 1.9 seconds to 100km/h" + "\nEngine Type: TFG(3-Cylinder Engine)" + "\nRPM: 8500" + "\nHorsePower: 1700" + "\nMileage: 13/L and 50km/full battery" + "Defining Features: Sleek, Exotic Look, Extremely Powerful Engine, Dual Oval-Shaped, Angled (Outward) Exhausts at Rear Windshield Area");
							break;
							
					}
					
					break;

				case "brand":
					printS("Enter the brand name here (or type \"list\" to list the available brands): ");
					String brandname = myScanner.nextLine();

					switch (brandname) {

						case "list":
							printS("Ford, Lamborghini, Bugatti, Koenigsegg, Porsche, Chevrolet, Aston Martin, McLaren and Devel");
							break;
							
						case "Nissan":
							printS("\nNissan GT-R Nismo:" + "\n\nTop Speed: " + topSpeeds[5] + "km/h" + "\nAcceleration Speed: 2.6 seconds to 100km/h" + "\nEngine Type: V6" + "\nRPM: 6800" + "\nHorsePower: 600" + "\nMileage: 13L/100km" + "\nDefining Features: Powerful Engine, Dual Twin Exhausts, Signature GT-R Circular Taillights, Bulky, Tough, Compact Design");
							
						case "Ford":
							printS("\nFord GT" + "\n\nTop Speed: " + topSpeeds[8] + "km/h" + "\nAcceleration Speed: 3.1 seconds to 100km/h" + "\nEngine Type: V6" + "\nRPM: 6500" + "\nHorsePower: 660" + "\nMileage: 17L/100km" + "\nDefining Features: Sleek and Strong Design, Circular Taillights, 2 Small Rocket-Like Exhausts");
							break;

						case "Lamborghini":
							printS("\nLamborghini Aventador:" + "\n\nTop Speed: " + topSpeeds[10] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 8500" + "\nHorsePower: 759" + "\nMileage: 20L/100km" + "\nDefining Features: Single, Wide Rear Exhaust, Sleek and Stylish Design");
							printS("\nLamborghini Huracan:" + "\n\nTop Speed: " + topSpeeds[2] + "km/h" + "\nAcceleration Speed: 2.9 seconds to 100km/h" + "\nEngine Type: V10" + "\nRPM: 8000" + "\nHorsePower: 630" + "\nMileage: 15L/100km" + "\nDefining Features: Optional Convertible, Sleek and Stylish Design, Exhausts on Sides of License Plate");
							printS("\nLamborghini Sián FKP 37" + "\n\nTop Speed: " + topSpeeds[9] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 8500" + "\nHorsePower: 774" + "\nMileage: 2800L/100km's Equivalent of Battery and Gas Usage (Hybrid)" + "\nDefining Features: Strong, Sleek and Racecar-Like Design, Unique Headlight and Taillight Design, 2 Large Flipped, Pentagonal Exhausts");
							printS("\nLamborghini Asterion:" + "\n\nTop Speed: " + topSpeeds[1] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: V10" + "\nRPM: 8250" + "\nHorsePower: 897" + "\nMileage: 4L/100km, 50km/Fully Charged Battery" + "\nDefining Features: Bulky, Sleek and Subtle Design, Powerful Engine, Hexagonal Dual Twin Exhausts");
							printS("\nLamborghini Terzo Millenio:" + "\n\nTop Speed: " + topSpeeds[3] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 8000" + "\nHorsePower: 630" + "\nMileage: 350km/Fully Charged Battery" + "\nDefining Features: Self-Driving on Race Tracks, Separate Engines on Each Wheel, Futuristic Design, Can Fix Itself If It Is Damaged");
							printS("\nLamborghini Veneno:" + "\n\nTop Speed: " + topSpeeds[12] + "km/h" + "\nAcceleration Speed: 2.9 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 8400" + "HorsePower: 750" + "\nMileage: 18L/100km" + "\nDefining Features: Sharp, Spiky Front, Futuristic and Strong Design, Tough, Solid and Sleek Exterior");
							break;
							
						case "Bugatti":
							printS("\nBugatti Chiron Super Sport:" + "\n\nTop Speed: " + topSpeeds[16] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: W16" + "\nRPM: 7100" + "\nHorsePower: 1577" + "\nMileage: Unknown" + "\nDefining Features: Wide, Low and Sleek Design, Extremely Powerful Engine, Quickly Burns Through Gas, 2 Large Exhausts, Single Line Taillight");							
							printS("\nBugatti Veyron:" + "\n\nTop Speed: " + topSpeeds[15] + "km/h" + "\nAcceleration Speed: 2.5 seconds to 100km/h" + "\nEngine Type: W16" + "\nRPM: 6400" + "\nHorsePower: 1184" + "\nMileage: 25L/100km" + "\nDefining Features: Bulky Design, Extremely Powerful Engine, Single Large Exhaust, Circular Taillights");
							break;
							
						case "Koenigsegg":
							printS("\nKoenigsegg Gemera:" + "\n\nTop Speed: " + topSpeeds[13] + "km/h" + "\nAcceleration Speed: 1.9 seconds to 100km/h" + "\nEngine Type: TFG(3-Cylinder Engine)" + "\nRPM: 8500" + "\nHorsePower: 1700" + "\nMileage: 13/L and 50km/full battery" + "Defining Features: Sleek, Exotic Look, Extremely Powerful Engine, Dual Oval-Shaped, Angled (Outward) Exhausts at Rear Windshield Area");
							printS("\nKoenigsegg Agera RS" + "\n\nTop Speed: " + topSpeeds[17] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 6900" + "\nHorsePower: 949" + "\nMileage: 12.5L/100km" + "\nDefining Features: Sleek and Low Design, Very Innovative V8 Engine, Single, Large, Flipped Trapezoid-Shaped Exhaust");
							printS("\nKoenigsegg Jesko:" + "\n\nTop Speed: " + topSpeeds[18] + "km/h" + "\nAcceleration Speed: 2.6 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 8500" + "\nHorsePower: 1280" + "\nMileage: Unknown" + "\nDefining Features: Sleek, Futuristic Design, Very Innovative V8 Engine, Wide and Low Body, Single, Wide Rocket-Like Exhaust");
							break;
					
						case "Porsche":
							printS("\nPorsche 918 Spyder:" + "\n\nTop Speed: " + topSpeeds[7] + "km/h" + "\nAcceleration Speed: 2.3 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 8700" + "\nHorsePower: 887" + "\nMileage: 695km/Fully Charged Battery and Full Gas Tank (10L/100km of gas and 31kwh/100km)" + "\nDefining Features: Side Exhausts, Optional Convertible, Sleek Design");							
							break;

						case "Chevrolet":
							printS("\nChevrolet Camaro ZL1:" + "\n\nTop Speed: " + topSpeeds[0] + "km/h" + "\nAcceleration Speed: 3.6 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 6400" + "\nHorsePower: 650" + "\nMileage: 15L/100km" + "\nDefining Features: Powerful Engine, Strong, Stylish and Iconic Design");
							break;
							
						case "Aston Martin":
							printS("\nAston Martin One-77:" + "\n\nTop Speed: " + topSpeeds[11] + "km/h" + "\nAcceleration Speed: 3.6 seconds to 100km/h" + "\nEngine Type: V12" + "\nRPM: 6500" + "\nHorsePower: 750" + "\nMileage: 17L/100km" + "\nDefining Features: Sleek and Compact Design");
							break;

						case "McLaren":
							printS("\nMcLaren 12C Spider:" + "\n\nTop Speed: " + topSpeeds[4] + "km/h" + "\nAcceleration Speed: 3.1 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 7000" + "\nHorsePower: 616" + "\nMileage: 21L/100km" + "\nDefining Features: Rocket-Like Engines, Sleek Exterior");							
							printS("\nMcLaren Senna:" + "\n\nTop Speed: " + topSpeeds[6] + "km/h" + "\nAcceleration Speed: 2.8 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 7250" + "\nHorsePower: 789" + "\nMileage: 15L/100km" + "\nDefining Features: Sleek, Streamlined Design, Powerful Engine, Linear Taillights, 2 \'Pockets\' on Front Bumper, Tri-Exhausts at Top Rear");
							printS("\nMcLaren Speedtail:" + "\n\nTop Speed: " + topSpeeds[14] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 6500" + "\nHorsePower: 747" + "\nMileage: 16L/100km" + "\nDefining Features: Aerodynamic, Sleek, Wide, Futuristic look, Powerful Engine, Dual Hidden Circular Exhausts, Linear Taillight From Rear to Roof, Digital Rearview Cameras Replacing Sideview Mirrors");
							break;
						
						case "Devel":
							printS("\nDevel 16: " + "\n\nTop Speed: " + topSpeeds[19] + "km/h" + "\nAcceleration Speed: 2 seconds to 100 km/h" + "\nEngine Type: V16" + "\nRPM: 6900" + "\nHorsePower: 5000" + "\nMileage: Unknown" + "\nDefining Features: Futuristic, Sleek and Low Design, Lamborghini Veneno-like Front, 2 Large Rocket-Like Exhausts");
							break;
							
					}
				
				break;	
				
			case "last added":
				printS("\nLamborghini Asterion:" + "\n\nTop Speed: " + topSpeeds[1] + "km/h" + "\nAcceleration Speed: 3 seconds to 100km/h" + "\nEngine Type: V10" + "\nRPM: 8250" + "\nHorsePower: 897" + "\nMileage: 4L/100km, 50km/Fully Charged Battery" + "\nDefining Features: Bulky, Sleek and Subtle Design, Powerful Engine, Hexagonal Dual Twin Exhausts");
				break;
				

			case "highest rpm":				
				printS("\nPorsche 918 Spyder:" + "\n\nTop Speed: " + topSpeeds[7] + "km/h" + "\nAcceleration Speed: 2.3 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 8700" + "\nHorsePower: 887" + "\nMileage: 695km/Fully Charged Battery and Full Gas Tank (10L/100km of gas and 31kwh/100km)" + "\nDefining Features: Side Exhausts, Optional Convertible, Sleek Design");							
				break;

			case "highest hp":
				printS("\nDevel 16: " + "\n\nTop Speed: " + topSpeeds[19] + "km/h" + "\nAcceleration Speed: 2 seconds to 100 km/h" + "\nEngine Type: V16" + "\nRPM: 6900" + "\nHorsePower: 5000" + "\nMileage: Unknown" + "\nDefining Features: Futuristic, Sleek and Low Design, Lamborghini Veneno-like Front, 2 Large Rocket-Like Exhausts");
				break;

			case "lowest rpm":
				printS("\nChevrolet Camaro ZL1:" + "\n\nTop Speed: " + topSpeeds[0] + "km/h" + "\nAcceleration Speed: 3.6 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 6400" + "\nHorsePower: 650" + "\nMileage: 15L/100km" + "\nDefining Features: Powerful Engine, Strong, Stylish and Iconic Design");
				break;

			case "lowest hp":
				printS("\nMcLaren 12C Spider:" + "\n\nTop Speed: " + topSpeeds[4] + "km/h" + "\nAcceleration Speed: 3.1 seconds to 100km/h" + "\nEngine Type: V8" + "\nRPM: 7000" + "\nHorsePower: 616" + "\nMileage: 21L/100km" + "\nDefining Features: Rocket-Like Engines, Sleek Exterior");							
				break;
				
			}
		}
	}
}
