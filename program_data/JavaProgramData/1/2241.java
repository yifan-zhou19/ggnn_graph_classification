package <missing>;

public class GlobalMembers
{
	public static int sum;

	public static void f(int x,int i)
	{
		 if (x == 1)
		 {
			 sum++;
		 }
		 else
		 {
			  for (;i <= x;i++)
			  {
					  if (x % i == 0)
					  {
						  f(x / i, i);
					  }
			  }

		 }

	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{

			  int x = 0;
			  int i;
			  int ans = 1;
			  x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  for (i = 2;i * i < x;i++)
			  {
					if (x % i == 0)
					{
						sum = 0;
						f(x / i, i);
						ans += sum;
					}
			  }
			  System.out.print(ans);
			  System.out.print("\n");
			  n--;
		}

		return 0;
	}

}

