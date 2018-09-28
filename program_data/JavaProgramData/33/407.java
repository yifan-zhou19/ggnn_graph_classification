package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		String dna = new String(new char[10000]);
		String hbl = new String(new char[10000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (t = 0;t < n;t++)
		{

						 int i;
						 int k = 0;
						 for (i = 0;i < 10000;i++)
						 {
											 dna = tangible.StringFunctions.changeCharacter(dna, i, '0');
						 }
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 dna = tempVar2.charAt(0);
						 }
						 for (i = 0;i < 10000;i++)
						 {
											 if (dna.charAt(i) != '0')
											 {
															 k++;
											 }
						 }

						 for (i = 0;i < k;i++)
						 {
											 if (dna.charAt(i) == 'A')
											 {
															 hbl = tangible.StringFunctions.changeCharacter(hbl, i, 'T');
											 }
											 if (dna.charAt(i) == 'T')
											 {
															 hbl = tangible.StringFunctions.changeCharacter(hbl, i, 'A');
											 }
											 if (dna.charAt(i) == 'G')
											 {
															 hbl = tangible.StringFunctions.changeCharacter(hbl, i, 'C');
											 }
											 if (dna.charAt(i) == 'C')
											 {
															 hbl = tangible.StringFunctions.changeCharacter(hbl, i, 'G');
											 }
						 }
						 hbl = tangible.StringFunctions.changeCharacter(hbl, k - 1, '\0');
			   System.out.printf("%s\n",hbl);
		}
		return 0;
	}

}

