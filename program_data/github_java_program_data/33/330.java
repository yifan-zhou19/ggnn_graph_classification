import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class NaiveBayes {

	// This function reads in a file and returns a
	// set of all the tokens. It ignores the subject line
	//
	// If the email had the following content:
	//
	// Subject: Get rid of your student loans
	// Hi there ,
	// If you work for us, we will give you money
	// to repay your student loans . You will be
	// debt free !
	// FakePerson_22393
	//
	// This function would return to you
	// [hi, be, student, for, your, rid, we, get, of, free, if, you, us, give,
	// !, repay, will, loans, work, fakeperson_22393, ,, ., money, there, to,
	// debt]
	public static HashSet<String> tokenSet(File filename) throws IOException {
		HashSet<String> tokens = new HashSet<String>();
		Scanner filescan = new Scanner(filename);
		filescan.next(); // Ignoring "Subject"
		while (filescan.hasNextLine() && filescan.hasNext()) {
			tokens.add(filescan.next());
		}
		filescan.close();
		return tokens;
	}

	public static void main(String[] args) throws IOException {
		// list out the files in the three directories
		File[] testFiles = new File("data/test").listFiles();
		File[] spamFiles = new File("data/train/spam").listFiles();
		File[] hamFiles = new File("data/train/ham").listFiles();

		// have a hashset to store tokens
		HashSet<String> tempTokens = new HashSet<>();
		// a map to store words that appear in spam and
		// another one to store words that appear in ham
		Map<String, Double> givenSpamMap = new HashMap<>();
		Map<String, Double> givenHamMap = new HashMap<>();

		// STEP 1

		// iterate through the spam files and map it to a map
		// with the key being the word and value being the number
		// of files containing them
		for (File aFile : spamFiles) {
			tempTokens = tokenSet(aFile);
			Iterator<String> tempIter = tempTokens.iterator();
			while (tempIter.hasNext()) {
				String tempString = tempIter.next();
				if (!givenSpamMap.containsKey(tempString)) {
					givenSpamMap.put(tempString, 1.0);
				} else {
					givenSpamMap.put(tempString, (double) givenSpamMap.get(tempString) + 1.0);
				}
			}
		}

		// STEP 2
		// iterate through the ham files and map it to a map
		// with the key being the word and value being the number
		// of files containing them
		for (File aFile : hamFiles) {
			tempTokens = tokenSet(aFile);
			Iterator<String> tempIter = tempTokens.iterator();
			while (tempIter.hasNext()) {
				String tempString = tempIter.next();
				if (!givenHamMap.containsKey(tempString)) {
					givenHamMap.put(tempString, 1.0);
				} else {
					givenHamMap.put(tempString, (double) givenHamMap.get(tempString) + 1.0);
				}
			}
		}

		// STEP 3 & 4
		// calculate the probability of spam and ham
		double probOfSpam = (double) spamFiles.length / (double) (spamFiles.length + hamFiles.length);
		double probOfHam = (double) hamFiles.length / (double) (spamFiles.length + hamFiles.length);

		// STEP 5

		// iterate through the test files and create a hashset to store each
		// word
		// that appears
		for (File aFile : testFiles) {
			HashSet<String> tempTestTokens = new HashSet<>();
			tempTestTokens = tokenSet(aFile);
			Iterator<String> testIter = tempTestTokens.iterator();
			double sumOfGivenSpam = 0;
			double sumOfGivenHam = 0;
			// for every word that appears, we check if it appears in the two
			// maps
			while (testIter.hasNext()) {
				String st = testIter.next();
				// if it appears in either one
				if (givenSpamMap.containsKey(st) || givenHamMap.containsKey(st)) {
					// check if it appears in the given spam map. If it does,
					// add up the log probability of the word given spam
					if (givenSpamMap.containsKey(st)) {
						sumOfGivenSpam += Math.log((givenSpamMap.get(st) + 1) / (double) (spamFiles.length + 2));
					}
					// if it does not, adjust the probability with the condition
					// to avoid underflow
					else {
						sumOfGivenSpam += Math.log((1) / (double) (spamFiles.length + 2));
					}
					// check if it appears in the given ham map. If it does,
					// add up the log probability of the word given ham
					if (givenHamMap.containsKey(st)) {
						sumOfGivenHam += Math.log((givenHamMap.get(st) + 1) / (double) (hamFiles.length + 2));
					}
					// if it does not, adjust the probability with the condition
					// to avoid underflow
					else {
						sumOfGivenHam += Math.log((1) / (double) (hamFiles.length + 2));
					}
				}
			}

			// compute the two values to determine whether a file is spam or not
			double denominatorSpam = Math.log(probOfSpam) + sumOfGivenSpam;
			double denominatorHam = Math.log(probOfHam) + sumOfGivenHam;
			// print the correct message according to the result
			if (denominatorSpam > denominatorHam) {
				System.out.println(aFile.getName() + " spam");
			} else {
				System.out.println(aFile.getName() + " ham");
			}
		}
	}
}
