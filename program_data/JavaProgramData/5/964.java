package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int len1;
	  int len2;
	  int i;
	  int same = 0;
	  double rate;
	  double z;
	  char[][] DNA = new char[2][600];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  rate = Double.parseDouble(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  DNA[0] = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  DNA[1] = tempVar3.charAt(0);
	  }

	 len1 = String.valueOf(DNA[0]).length();
	 len2 = String.valueOf(DNA[1]).length();
	 if (len1 != len2)
	 {
		 System.out.print("error");
		 return 0;
	 }
	 else
	 {
	 for (i = 0;i < len1;i++)
	 {
		 if (((DNA[0][i] != 'A') && (DNA[0][i] != 'G') && (DNA[0][i] != 'C') && (DNA[0][i] != 'T')) || ((DNA[1][i] != 'A') && (DNA[1][i] != 'G') && (DNA[1][i] != 'C') && (DNA[1][i] != 'T')))
		 {
			 System.out.print("error");
			 return 0;
		 }
		 else
		 {
		 if (DNA[0][i] == DNA[1][i])
		 {
			 same++;
		 }
		 }
	 }
	z = (1.0 * same) / len1;
	if (z >= rate)
	{
	System.out.print("yes");
	}
	else
	{
		System.out.print("no");
	}

	 }
	return 0;

	}

}

