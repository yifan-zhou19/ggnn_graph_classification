package <missing>;

public class GlobalMembers
{
	public static void qut(int a, int b)
	{
		int i;
		if (a >= b)
		{
			num++;
			if (b == 1)
			{
				b++;
			}
			for (i = b;i <= a;i++)
			{
				if (a % i == 0)
				{
					qut(a / i, i); //??a%i==0,??
				}
			}
		}
	}
	public static int num = 0; //?????????
	public static int Main()
	{
		int i; //?????????
		int n;
		int[] g = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //??????
		{
			g[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			qut(g[i], 1); //????
			System.out.print(num);
			System.out.print("\n");
				  num = 0;
		}
		return 0;
	}


}

