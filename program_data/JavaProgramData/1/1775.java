package <missing>;

public class GlobalMembers
{
	public static int s(int a,int b)
	{
		int sum = 0;
		int z = 0;
		if (a != 1 && b <= a)
		{
		  for (int i = b;i <= a;++i)
		  {
		   if (a % i == 0)
		   {
			   sum += s(a / i, i);
			   z = 1;
		   }
		  }

		}
		else if (a == 1)
		{
			return 1;
		}

		return sum;

	}
	public static int Main()
	{
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;++i)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(s(a, 2));
			System.out.print("\n");
		}
		return 0;
	}


}

