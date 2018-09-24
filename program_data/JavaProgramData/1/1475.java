package <missing>;

public class GlobalMembers
{
	//**********************
	//* ???   ????  *
	//* 1200012878 ???  *
	//* 12?1?            *
	//**********************
	public static int fengjie(int a, int b)
	{
		if (a == 2 || a == 3)
		{
			return 1;
		}
		int sum = 1;
		int c = Math.sqrt(a);
		for (int i = b; i <= c; i++)
		{
			if (a % i == 0)
			{
				sum = sum + fengjie(a / i, i);
			}
		}
		return sum;
	}
	public static int Main()
	{
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fengjie(a, 2));
			System.out.print("\n");
		}
		return 0;
	}



}

