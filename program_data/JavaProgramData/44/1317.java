package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int i;
		int j;
		int k;
		int c;
		int N;
		int renum;
		for (i = 0;c != 0;i++)
		{
			c = num / Math.pow(10,i);
		}
		int[] a = new int[20];
		a[0] = num / Math.pow(10,i - 1);
		N = num;
		for (j = 1;j < i;j++)
		{
			a[j] = (N - a[j - 1] * Math.pow(10,i - j)) / Math.pow(10,i - j - 1);
			N -= a[j - 1] * Math.pow(10,i - j);
		}
		renum = 0;
		for (j = i - 1,k = 0;j >= 0,k < i;j--,k++)
		{
			renum += a[j] * Math.pow(10,i - k - 2);
		}
		return renum;
	}

	public static int Main()
	{
		int i;
		int[] a = new int[6];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",reverse(a[i]));
		}
	}
}

