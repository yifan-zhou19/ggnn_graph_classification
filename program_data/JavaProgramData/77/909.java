package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[500]);
		char b;
		char g;
		int[] y = new int[500];
		int i;
		int j;
		int n;
		int a;
		x = new Scanner(System.in).nextLine();
		n = x.length();
		a = n;
		for (i = 0;i < n;i++)
		{
			y[i] = 1;
		}
		b = x.charAt(0);
		g = x.charAt(n - 1);
		for (i = 0;i < n && a != 0;i++)
		{
			if (x.charAt(i) == b && y[i] != 0)
			{
				for (j = 1;y[i + j] == 0;j++)
				{
				}
				if (x.charAt(i + j) == g)
				{
					y[i] = 0;
					y[i + j] = 0;
					System.out.printf("%d %d\n",i,i + j);
					i = -1;
					j = 0;
					a -= 2;
				}
			}
		}
	}

}
