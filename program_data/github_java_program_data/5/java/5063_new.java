package at.tuwien.sos.ue1.knapsack;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import at.tuwien.sos.ue1.knapsack.problem.KnapsackItem;
import at.tuwien.sos.ue1.knapsack.problem.KnapsackProblem;

public class KnapsackReaderTest {
		@Test
		public void testRead() throws FileNotFoundException, IOException{
			KnapsackProblem r = new KnapsackReader().read(new File("datasets/knapsack"));
			int i = 0;
			for (KnapsackItem k : r.getItems()) {
				assertEquals(i,k.getId());
				i++;
			}
			
			assertEquals(350,r.getKnapsackSize());
			assertEquals(100,r.getItems().size());
			
		}
}
