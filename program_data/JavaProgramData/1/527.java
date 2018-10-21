package <missing>;

public class GlobalMembers
{
	public static int f(int x,int y)
	{ //x??????y????????
		if ((int)Math.pow(x,0.5) < y)
		{
			return 1; //??x^0.5???y??1
		}
		int d = 1;
		for (int i = y;i <= (int)Math.pow(x,0.5);i++) //??i<=x^0.5,??????
		{
			if ((x % i) == 0)
			{
				d += f(x / i, i); //??
			}
		}
		return d;
	}
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 1;k <= n;k++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(m, 2));
			System.out.print("\n");
		}
		return 0;
	}
}

