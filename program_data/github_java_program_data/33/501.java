package malinakis.nlp.classifiers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MultinomialNaiveBayes extends Classifier {
	
	private static final long serialVersionUID = 1L;
	protected int[] categories;
	protected int[] categoriesCount; // the number of classified category[i]
	protected int documentsCount; // total number of train documents
	protected String[] catLabels;
	
	protected double[] prior; // prior probabilities
	protected Map<String, Map<Integer, Double>> conditionalProbs;
	
	protected NBFeatureVector features;
	
	protected MultinomialNaiveBayes(String[] features, int[] categories, String[] catLabels) {
		this(categories, catLabels);
		this.features = new NBFeatureVector(features, categories.length);
	}
	
	private MultinomialNaiveBayes(NBFeatureVector features, int[] categories, String[] catLabels) {
		this(categories, catLabels);
		this.features = features;	
	}
	
	private MultinomialNaiveBayes(int[] categories, String[] catLabels) {
		snapshots = new ArrayList<Classifier>();
		this.categories = categories;
		this.categoriesCount = new int[categories.length];
		this.catLabels = catLabels;
	}
	
	private MultinomialNaiveBayes(){}
	
	@Override
	public void addTrainText(String text, int categoryIndex) {
		categoriesCount[categoryIndex]++;
		documentsCount++;
		// tokenize
		String[] tokens = text.trim().split(" ");
		for (String str : tokens) {			
			features.increment(str, categoryIndex);
		}
	}
	
	// used to cross validate the classifier
	// argument is a HashMap of a group of texts where the key is an id of each collection
	// and the value is another hashmap with key its text and value its category.
	@Override
	public void crossValidate(List<Map<String, Integer>> textsList, boolean takeSnapshots) {
		//ClassificationScores[] partialScores = new ClassificationScores[textsList.size()]; // the scores after each iteration.
		List<ClassificationScores> partialScores = new ArrayList<ClassificationScores>();
		//MultinomialNaiveBayes[] partialClassifiers = new MultinomialNaiveBayes[textsList.size()]; // the partial classifiers
		List<MultinomialNaiveBayes> partialClassifiers = new ArrayList<>();
		conditionalProbs = new HashMap<String, Map<Integer, Double>>();
		double fMeasureSum = 0.0;
		
		for (int leftOut = 0; leftOut < textsList.size(); leftOut++) { // for all the texts
			MultinomialNaiveBayes mnb = new MultinomialNaiveBayes(features, categories, catLabels);
			partialClassifiers.add(mnb);
			
			for (int j = 0; j < textsList.size(); j++) { // train them except the left out
				if (j == leftOut) continue;
				Map<String, Integer> curMap = textsList.get(j);
				if (curMap == null) continue;
				for (Entry<String, Integer> entry : curMap.entrySet()) {
					mnb.addTrainText(entry.getKey(), entry.getValue());
				}
			}
			mnb.train();
			partialScores.add(mnb.getScores(textsList.get(leftOut)));
			fMeasureSum += partialScores.get(leftOut).fMeasure[0];
			if (takeSnapshots) { // if we want to draw the learning curve
				calculateCrossValidation(partialScores, partialClassifiers, fMeasureSum);
				snapshots.add(this.clone());
			}

		}
		
		calculateCrossValidation(partialScores, partialClassifiers, fMeasureSum);
		
		System.out.println("cross validation complete.");
	}
	
	private void calculateCrossValidation(List<ClassificationScores> partialScores, List<MultinomialNaiveBayes> partialClassifiers, double fMeasureSum) {
		// calculate the weights of each classifier
		double[] weights = new double[partialScores.size()];
		for (int i = 0; i < weights.length; i++) {
			weights[i] = partialScores.get(i).fMeasure[0] / fMeasureSum;
		}
		
		// calculate priors
		prior = new double[categories.length];
		for (int i = 0; i < prior.length; i++) {
			for (int j = 0; j < weights.length; j++) {
				prior[i] += weights[j] * partialClassifiers.get(j).prior[i]; 
			}
		}
		
		// calculate conditionals
		for (String feat : features.featureNames) { // for each feature
			Map<Integer, Double> curMap = new HashMap<Integer, Double>();
			double[] condWeight = new double[categories.length];
			Arrays.fill(condWeight, 0.0);
			conditionalProbs.put(feat, curMap);
			for (int i = 0; i < partialClassifiers.size(); i ++){ // for each partial classifier
				Map<Integer, Double> unweightedMap = partialClassifiers.get(i).conditionalProbs.get(feat);
				for (int cat = 0; cat < categories.length; cat++) { // for each category
					condWeight[cat] += weights[i] * unweightedMap.getOrDefault(cat, 0.0);
				}
			}
			for (int cat = 0; cat < condWeight.length; cat++) {
				curMap.put(cat, condWeight[cat]);
			}
		}
	}
	
	@Override
	public void train() {
		prior = new double[categories.length];
		
		for (int i = 0; i < prior.length; i++) {
			prior[i] = ((double)categoriesCount[i]) / documentsCount;
		}
		conditionalProbs = features.calculateCondProb();
	}
	
	@Override
	protected void cleanUp() {
		features.cleanUp();
	}
	
	// get the score of the given text for each trained category.
	@Override
	public double[] getScores(String text) {
		double[] scores = new double[categories.length];
		// tokenize the string
		String[] tokens = text.split(" ");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = Math.log10(prior[i]);
			for (String str : tokens) {
				double prob = getCondProb(str, i);
				if (prob == -1 ) continue;
				scores[i] += Math.log10(prob);
			}
		}
		return scores;
	}

	@Override
	protected int getCategoriesNum() {
		return categories.length;
	}
	
	protected double getCondProb(String feature, Integer categoryIndex) {
		Map<Integer, Double> probMap = conditionalProbs.get(feature);
		if (probMap == null) return -1;
		return probMap.get(categoryIndex);
	}

	@Override
	public Classifier clone() {
		MultinomialNaiveBayes mnb = new MultinomialNaiveBayes();
		mnb.categories = this.categories.clone();
		mnb.prior = this.prior.clone();
		mnb.conditionalProbs = new HashMap<String, Map<Integer,Double>>();
		mnb.conditionalProbs.putAll(this.conditionalProbs);
		return mnb;
	}
}
