package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double c;
		int b = 0;
		int p = 1;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		char[][] a = new char[2][501];
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[1] = tempVar3.charAt(0);
		}
		for (i = 0;i < 501;i++)
		{
						   if (a[0][i] == '\0')
						   {
										  if (a[1][i] != '\0')
										  {
														 p = 0;
										  }
										 break;
						   }
							if (a[0][i] != 'A' && a[0][i] != 'T' && a[0][i] != 'C' && a[0][i] != 'G')
							{
																				   p = 0;
																				   break;
							}
							if (a[1][i] != 'A' && a[1][i] != 'T' && a[1][i] != 'C' && a[1][i] != 'G')
							{
																					   p = 0;
																					   break;
							}

						   if (a[0][i] == a[1][i])
						   {
												 b = b + 1;
						   }
		}
		c = b * 1.0 / i;

		if (p == 0)
		{
			System.out.print("error");
		}
		else
		{
			 if (c > n)
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

