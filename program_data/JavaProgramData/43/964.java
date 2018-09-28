package <missing>;

public class GlobalMembers
{
	//******************************
	//*??:???   1200062705    *
	//*???:  1 ??????     *
	//*?? 2012-12-26             *
	//******************************
	public static int Main()
	{

	int m;
	int a = 3;
	int b;
	int c;
	int n;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (a = 3; a <= m / 2; a = a + 2)
	{
		n = (int)Math.sqrt(a);
		for (b = 2; b <= n; b++)
		{
			if (a % b == 0)
			{
				break;
			}
		}
		if (b == n + 1)
		{
			c = m - a;
			  n = (int)Math.sqrt(c);
			for (b = 2; b <= n; b++)
			{
			   if (c % b == 0)
			   {
				   break;
			   }
			}
		   if (b == n + 1)
		   {
			   System.out.print(a);
			   System.out.print(" ");
			   System.out.print(c);
			   System.out.print("\n");
		   }
		}
	}

	return 0;
	}

}

