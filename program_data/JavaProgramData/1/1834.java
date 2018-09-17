package <missing>;

public class GlobalMembers
{
	public static int t = 0; //??????t?ways
	public static int ways;
	public static void divide(int x,int h)
	{
		int i;
		if (x == 1) //??x==1
		{
			t++;
			ways = t;
		} //t+1?ways?????t
		else
		{
			for (i = h;i <= x;i++)
			{
				if (x % i == 0)
				{
						h = i;
					divide(x / h, h); //h?????????????divide?????????
				}
			}
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = 0;
		divide(a[i], 2);
		System.out.print(ways);
		System.out.print("\n");
		}
		return 0;
	}
}

