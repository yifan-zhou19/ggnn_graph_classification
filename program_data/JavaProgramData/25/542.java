package <missing>;

public class GlobalMembers
{
	public static void play(int[] a, int[] b)
	{
		int p;
		int[] f = new int[100];
		int i = 0;
		for (i = 0;i < 100;i++)
		{
			if (a[i] + b[i] + f[i] >= 10)
			{
			  end[i] = (a[i] + b[i] + f[i]) - 10;
			  f[i + 1]++;
			}
		   else
		   {
			 end[i] = a[i] + b[i] + f[i];
		   }
		}

	}
	public static int[] end = new int[100];
	public static int Main()
	{
		int[] a = new int[100];
		int N;
		int i = 0;
		int j = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[1] = 2;
		if (N == 0)
		{
			System.out.print("1");
			return 0;
		}
		else
		{
			for (i = 0;i < N - 1;i++)
			{
				play(a, a);
				for (j = 0;j < 100;j++)
				{
					a[j] = end[j];
				}
			}
		}
		for (i = 99;i >= 0;i--)
		{
			if (a[i] != 0)
			{
				break;
			}
		}
		for (j = i;j > 0;j--)
		{
			System.out.print(a[j]);
		}
		return 0;
	}
}

