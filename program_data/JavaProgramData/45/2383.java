package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int j;
		int loci;
		int same = 0;
		int sum = 0;
		String small = new String(new char[51]);
		String big = new String(new char[51]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			small = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			big = tempVar2.charAt(0);
		}
		for (i = 0;big.charAt(i) != '\0';i++)
		{
								  if (big.charAt(i) == small.charAt(0))
								  {
								  loci = i;
									 for (j = 0;small.charAt(j) != '\0';j++)
									 {
										  if (big.charAt(i + j) == small.charAt(j))
										  {
																 same += 1;
										  }
									 sum += 1;
									 }
									 if (sum == same)
									 {
												   System.out.printf("%d\n",loci);
												   break;
									 }
									 else
									 {
										   sum = 0;
										   same = 0;
									 }

								  }
		}

		return 0;
	}
}

