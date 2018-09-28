package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 6; i <= n; i = i + 2)
		{
			int a;
			int b;
			int m = 0;
			for (a = 3; a <= i / 2; a = a + 2)
			{
				int s;
				int k = 0;
				for (s = 3; s <= Math.sqrt(a); s = s + 2)
				{
					if (a % s == 0)
					{
						 k = 1;
						 break;
					}
				}
				if (k == 0)
				{
					 b = i - a;
					 int j;
					 int t = 0;
					 for (j = 3; j <= Math.sqrt(b); j = j + 2)
					 {
						 if (b % j == 0)
						 {
							  t = 1;
							  break;
						 }
					 }
					 if (t == 0)
					 {
						  System.out.print(i);
						  System.out.print("=");
						  System.out.print(a);
						  System.out.print("+");
						  System.out.print(b);
						  System.out.print("\n");
						  m = 1;
					 }
				}
				if (m == 1)
				{
				   break;
				}
			}
		}
		return 0;
	}

}

