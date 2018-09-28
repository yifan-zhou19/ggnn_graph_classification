package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int a;
		int b;
		int t = 2;
		b = Math.sqrt(x);
		for (int i = 2;i <= b;i++)
		{
			if (x % i == 0)
			{
				t = i;
				break;
			}
			else
			{
				t = i + 1;
			}
		}
		if (t > b)
		{
			a = 1;
		}
		else
		{
			a = 0;
		}
		return (a);
	}
	public static int Main()
	{
		int n;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 3;j <= (n / 2);j++)
		{
			c = n - j;
			if (sushu(c) + sushu(j) == 2)
			{
				System.out.print(j);
				System.out.print(" ");
				System.out.print(c);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

