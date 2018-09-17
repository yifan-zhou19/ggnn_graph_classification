package <missing>;

public class GlobalMembers
{
	public static int fenjie(int x,int y)
	{ //x????? y??????????
		int i; //s??????
		int s = 0;
		if (x == y)
		{
			return 1;
		}
		for (i = y;i < x;i++)
		{
			if (x % i == 0)
			{
				s += fenjie(x / i, i);
			}
		}
		if (i == x)
		{
			s++;
		}
		return s;
	}
	public static int Main()
	{
		int n; //n???????
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;n > 0;n--)
		{
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fenjie(i, 2));
			System.out.print("\n");
		}
		return 0;
	}
}

