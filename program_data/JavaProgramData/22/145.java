package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int[] a = new int[1000];
		int t = 0;
		int q = 0;
		int max;
		int min;
		int[] b = new int[1000];
		for (i = 0;;i++)
		{
			if (scanf("%d,", a[i]) == EOF)
			{
			break;
			}
		}
		max = a[0];
		for (j = 0;j < i;j++)
		{
			if (a[j] > max)
			{
				max = a[j];
			}
		}
		for (j = 0;j < i;j++)
		{
			if (a[j] == max)
			{
				t++;
			}
		}
		if (t == i)
		{
			System.out.print("No");
		}
		else
		{
			for (j = 0;j < i;j++)
			{
				if (a[j] != max)
				{
					b[q] = a[j];
					q++;
				}
			}
			min = b[0];
			for (j = 0;j <= q;j++)
			{
				if (b[j] > min)
				{
					min = b[j];
				}
			}
			System.out.printf("%d",min);
		}
	}
}
