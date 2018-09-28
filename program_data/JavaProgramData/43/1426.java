package <missing>;

public class GlobalMembers
{
	//****************************
	//*?????????   **
	//*?????? 1200012896 **
	//*???2012.10.21  **
	//****************************
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (a = 3; a <= n / 2; a++)
		{
			b = n - a;
			for (i = 2; i <= (int)Math.sqrt(a); i++)
			{
				if (a % i == 0)
				{
				   break;
				}
			}
			if (i == (int)Math.sqrt(a) + 1)
			{
				  for (m = 2; m <= (int)Math.sqrt(b); m++)
				  {
						 if (b % m == 0)
						 {
							break;
						 }
				  }
					  if (m == (int)Math.sqrt(b) + 1)
					  {
						  System.out.print(a);
						  System.out.print(" ");
						  System.out.print(b);
						  System.out.print("\n");
					  }
			}
		}
		return 0;
	}
}

