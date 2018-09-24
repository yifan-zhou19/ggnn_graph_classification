package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int k;
		int l;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (a = 3;a <= n / 2;a = a + 2)
		{
		   j = 0;
		  for (i = 2;i < a;i++)
		  {
			  if (a % i == 0)
			  {
				j = j + 1;
			  }
		  }
		  if (j == 0)
		  {
			  b = n - a;
		  l = 0;
		  for (k = 2;k < b;k++)
		  {
			if (b % k == 0)
			{
				l = l + 1;
			}
		  }
		  if (l == 0)
		  {
				System.out.print(a);
				System.out.print(" ");
				System.out.print(b);
				System.out.print("\n");
		  }
		  continue;
		  }
		}
		return 0;
	}




}

