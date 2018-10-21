package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (a = 3; a <= (m / 2); a = a + 2)
		{
				 int count1 = 1;
				 for (int n = 2; n <= Math.sqrt(a); n++)
				 {
						 if (a % n == 0)
						 {
							  continue;
						 }
						  count1++;
				 }
				 if (count1 > Math.sqrt(a) - 1)
				 {
						 b = m - a;
						 int count2 = 1;
						 for (int i = 2; i <= Math.sqrt(b); i++)
						 {
								  if (b % i == 0)
								  {
									  continue;
								  }
								  count2++;
						 }
							 if (count2 > Math.sqrt(b) - 1)
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

