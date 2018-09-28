package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double n;
	double r;
	int m = 0;
	int i;
	int s = 0;
	String a = new String(new char[500]);
	String b = new String(new char[500]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = tempVar3.charAt(0);
	}
	int x = a.length();
	int y = b.length();
	if (x != y)
	{
			 System.out.print("error");
	}
			 else
			 {
				   for (i = 0;i < x;i++)
				   {
									 if (!(((a.charAt(i) == 'A') || (a.charAt(i) == 'T') || (a.charAt(i) == 'C') || (a.charAt(i) == 'G')) && ((b.charAt(i) == 'A') || (b.charAt(i) == 'T') || (b.charAt(i) == 'C') || (b.charAt(i) == 'G'))))
									 {

																							s++;
									 }
				   }

									 if (s != 0)
									 {
											  System.out.print("error");
									 }
											  else
											  {
													for (i = 0;i < x;i++)
													{
									 if (a.charAt(i) == b.charAt(i))
									 {
																							 m++;
									 }

													}
																							 r = 1.0 * m / x;
																							 if (r >= n)
																							 {
																									  System.out.print("yes");
																							 }
																									  else
																									  {
																											System.out.print("no");
																									  }

											  }
			 }

	return 0;
	}

}

