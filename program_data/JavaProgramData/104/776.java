package <missing>;

public class GlobalMembers
{
	public static int find(int x, int y)
	{
		if (x == y) //????????
		{
			return x;
		}
		else if (x > y)
		{
			while (x > y) //????t???????2t,2t+1??????2?????????
			{
				x = x / 2; //??x<=y????????
			}
			return find(x, y);
		}
		else
		{
			while (y > x) //y??x
			{
				y = y / 2;
			}
			return find(x, y);
		}
	}
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(find(m, n));
		return 0;
	}

}

