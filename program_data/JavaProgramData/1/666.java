package <missing>;

public class GlobalMembers
{
	public static int sum;
	public static int yin(int c,int g) //?????
	{
		int j;
		int k;
		int f;
		int e;
		for (j = g;j <= c;j++) //??
		{
			if (c % j == 0)
			{
			   e = c / j;
				if (e > 1)
				{
					f = j;
					yin(e, f);
				}
				else
				{
					sum++; //?????????
				}
			}
		}
		return sum; //??
	}
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i;
		int d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			d = 2;
			sum = 0;
			b[i] = yin(a[i], d);
		}
		for (i = 0;i < n;i++)
		{
			System.out.print(b[i]);
			System.out.print("\n");
		}
		return 0;

	}

}

