package <missing>;

public class GlobalMembers
{
	//max=(max>=arr[s])?max:arr[s];

	public static int Main()
	{
	 int i;
	 int k = 0;
	 double xs;
	 double sj;
	 String dna1 = new String(new char[600]);
	 String dna2 = new String(new char[600]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 xs = Double.parseDouble(tempVar);
	 }
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		dna1 = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		dna2 = tempVar3.charAt(0);
	}
	 if (dna1.length() != dna2.length())
	 {
		 System.out.print("error");
		 return 0;
	 }
	 for (i = 0;i < (dna1.length() - 1);i++)
	 {
		 if (dna1.charAt(i) != 'A' && dna1.charAt(i) != 'G' && dna1.charAt(i) != 'C' && dna1.charAt(i) != 'T')
		 {
			 System.out.print("error");
			 return 0;
		 }
		 if (dna2.charAt(i) != 'A' && dna2.charAt(i) != 'G' && dna2.charAt(i) != 'C' && dna2.charAt(i) != 'T')
		 {
			 System.out.print("error");
			 return 0;
		 }
		 if (dna1.charAt(i) == dna2.charAt(i))
		 {
			 k++;
		 }
	 }
	 sj = 1.0 * k / (dna1.length() - 1);
	 if (sj > xs)
	 {
		 System.out.print("yes");
	 }
	 else
	 {
		 System.out.print("no");
	 }
		return 0;
	}
}

