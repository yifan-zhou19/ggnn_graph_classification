package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[12];
	public static int[] b = new int[12];
	public static void path(int x,int y)
	{
		int i;
		int j;
		int n1;
		int n2;
		int t = 0;
		for (i = 1;i <= 10;i++)
		{
			if ((int)Math.pow(2.0,(double)(i - 1)) <= x != 0 && x < (int)Math.pow(2.0,(double)i))
			{
				n1 = i;
				break;
			}
		}
		a[1] = x;
		for (i = 2;i <= n1;i++)
		{
			a[i] = (a[i - 1] - (int)Math.pow(2.0,(double)(n1 - i + 1)) + 2) / 2 + (int)Math.pow(2.0,(double)(n1 - i)) - 1;
		}
		for (j = 1;j <= 10;j++)
		{
			if ((int)Math.pow(2.0,(double)(j - 1)) <= y != 0 && y < (int)Math.pow(2.0,(int)j))
			{
				n2 = j;
				break;
			}
		}
		b[1] = y;
		for (j = 2;j <= n2;j++)
		{
			b[j] = (b[j - 1] - (int)Math.pow(2.0,(double)(n2 - j + 1)) + 2) / 2 + (int)Math.pow(2.0,(double)(n2 - j)) - 1;
		}
		for (i = 1;i <= n1;i++)
		{
			if (t == 1)
			{
				break;
			}
			for (j = 1;j <= n2;j++)
			{
				if (a[i] == b[j])
				{
					t = t + 1;
					System.out.print(a[i]);
					System.out.print("\n");
					break;
				}
			}
		}
	}
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		path(x, y);
		return 0;
	}






}

