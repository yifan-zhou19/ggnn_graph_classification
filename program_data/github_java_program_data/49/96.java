/*
 * Task 2 Estimate price car using Regression

The program uses the java library "Jama-1.0.1" 
that is suitable for regression and matrices manipulations 
and provides additional methods. 

The libary is included in the folder!


 Compilation:  javac -classpath jama.jar:. *.java
 *  Execution:    java  -classpath jama.jar:. MultipleLinearRegression
 *  Dependencies: jama.jar

 */
package multipleregression;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Hashtable;

public class MultipleLinearRegression {

	public static ArrayList<double[]> a = new ArrayList(); // Arraylist used to
															// parse the data
	public static double[] Yprices; // array of the prices of each data parsed
	public static final int numOfAttr = 19; // number of attributes used in the
											// regression Model
	public static double[][] dataMatrix; // Matrix storing all the data that is
											// used in the Regression

	public static Hashtable<String, double[]> wheels; // Stores the value of the
														// wheel type attribute
	public static Hashtable<String, double[]> bodystyle; // Stores the value of
															// the body-style
															// type attribute
	public static Hashtable<String, Integer> cylinders; // Stores the value of
														// the cylinder type
														// attribute

	public static void main(String[] args) throws Exception {

		setDummyVariables(); // initialize the categorical/dummy attributes
		parseData(); // parse the data using HTTP GET method
		double[][] M = createMatrix(); // create the matrix for the regression

		// run the regression using ReegressionModel object
		RegressionModel regression = new RegressionModel(M, Yprices);

		// Output the regression equation
		System.out.printf(
				"Regression Model:"
						+ "\n %.2f + %.2f b1 + %.2f b2 + %.2f b3 + %.2f b4 + %.2f b5 + %.2f b6 + %.2f b7 + %.2f beta8 +"
						+ " %.2f b9 + %.2f b10 + %.2f b11 + %.2f b12 + %.2f b13 + %.2f b14 + %.2f b15 + %.2f b16 + %.2f b17 + %.2f b18    (R^2 = %.2f)\n",
				regression.beta(0), regression.beta(1), regression.beta(2), regression.beta(3), regression.beta(4),
				regression.beta(5), regression.beta(6), regression.beta(7), regression.beta(8), regression.beta(9),
				regression.beta(10), regression.beta(11), regression.beta(12), regression.beta(13), regression.beta(14),
				regression.beta(15), regression.beta(16), regression.beta(17), regression.beta(18), regression.R2());
	}

	/*
	 * Method used for parsing the data set 1-Checks if there is a missing data
	 * "?" and if there is it skips it and does not include it in the regression
	 * model. 2-Converts all the non numerical values to numerical values by
	 * checking if there are numerical values or not by calling method
	 * isStringDouble() and then converting them to numerical values of type
	 * double calling convertDouble()
	 */
	public static void parseData() throws Exception {

		URL url = new URL("https://archive.ics.uci.edu/ml/machine-learning-databases/autos/imports-85.data");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line;
		boolean emptyVal = false;

		// start parsing the data
		while ((line = rd.readLine()) != null) {
			String[] s = line.split(",");
			double[] arrD = new double[numOfAttr + 1];
			/*
			 * check if there is a data with missing values and if there is do
			 * not parse it skip it
			 */
			for (String str : s) {
				if (str.equals("?")) {
					emptyVal = true;
				}
			}
			if (!emptyVal) {
				int index = 0;
				for (int i = 0; i < s.length; i++) {
					/*
					 * Skip all the data attributes that are not suitable for
					 * the regression model. These attributes are either
					 * independent with the price or dependent with the other
					 * dependent variables.
					 */
					if (i == 0 || i == 1 || i == 2 || i == 12 || i == 14 || i == 17 || i == 19 || i == 20 || i == 22
							|| i == 13) {
						continue;
					}

					/*
					 * Parse the variables that are eligible for the regression
					 * model after the analysis performed
					 */
					if (isStringDouble(s[i])) {
						arrD[index] = Double.parseDouble(s[i]);
						index++;
					} else if (wheels.containsKey(s[i])) {
						for (int c = 0; c < wheels.get(s[i]).length; c++) {
							arrD[index] = wheels.get(s[i])[c];
							index++;
						}
					} else if (bodystyle.containsKey(s[i])) {
						for (int c = 0; c < bodystyle.get(s[i]).length; c++) {
							arrD[index] = bodystyle.get(s[i])[c];
							index++;
						}

					} else if (i == 15 && cylinders.containsKey(s[i])) {
						arrD[index] = cylinders.get(s[i]);
						index++;

					} else {
						arrD[index] = convertDouble(s[i]);
						index++;
					}
				}
				a.add(arrD);
			}
			emptyVal = false;
			arrD = null;

		}
		rd.close();
	}

	/*
	 * Method used to create the Matrix and the array of prices that will be
	 * used in the regression
	 */
	public static double[][] createMatrix() {

		double[][] x = new double[a.size()][numOfAttr];
		Yprices = new double[a.size()];
		for (int i = 0; i < a.size(); i++) {
			Yprices[i] = a.get(i)[a.get(i).length - 1];
			int index = 0;
			for (int j = 0; j < a.get(i).length - 1; j++) {
				x[i][index] = a.get(i)[j];
				index++;
			}
		}

		a = null;
		return x;
	}

	/*
	 * Method used in order to convert BINARY categorical variables of type
	 * String to variables of type double. Converts non numerical values to
	 * double values
	 */
	public static double convertDouble(String s) {
		// engine type
		double value = 0;
		if (s.equals("gas")) {
			value = 0;
		} else if (s.equals("diesel")) {
			value = 1;
		}
		// fuel type
		else if (s.equals("std")) {
			value = 0;
		} else if (s.equals("turbo")) {
			value = 1;
		}
		// # of doors
		else if (s.equals("two")) {
			value = 0;
		} else if (s.equals("four")) {
			value = 1;
		}
		// engine location
		else if (s.equals("front")) {
			value = 1;
		} else if (s.equals("rear")) {
			value = 0;
		}
		return value;
	}

	/*
	 * Method that is used to Check if a value of type String can be converted
	 * to numerical or not
	 */
	public static boolean isStringDouble(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}

	/*
	 * Method that is used in order to initialize all the categorical
	 * variables/dummy variables that are not binary(more than 2 attributes)
	 * using a Hashtable for each attribute having as a key the attribute name
	 * and as a value the list of variables
	 */
	public static void setDummyVariables() {
		wheels = new Hashtable();
		wheels.put("4wd", new double[] { 1, 0 });
		wheels.put("fwd", new double[] { 0, 1 });
		wheels.put("rwd", new double[] { 1, 1 });
		// System.out.print(wheels.get("fwd")[0]);

		bodystyle = new Hashtable();
		bodystyle.put("hardtop", new double[] { 1, 0, 0, 0 });
		bodystyle.put("wagon", new double[] { 0, 1, 0, 0 });
		bodystyle.put("sedan", new double[] { 0, 0, 1, 0 });
		bodystyle.put("convertible", new double[] { 0, 0, 0, 1 });
		bodystyle.put("hatchback", new double[] { 0, 0, 0, 0 });
		// System.out.println(bodystyle.get("convertible")[3]);

		cylinders = new Hashtable();
		cylinders.put("two", 0);
		cylinders.put("three", 1);
		cylinders.put("four", 2);
		cylinders.put("five", 3);
		cylinders.put("six", 4);
		cylinders.put("eight", 5);
		cylinders.put("twelve", 6);

	}

}