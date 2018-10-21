package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] d = new int[1000];
		int i = 0;
		int j;
		int n = 0;
		int t = 0;
		while ((c = System.in.read()) != '\n')
		{
			if (c == ',')
			{
				i++;
			}
			else
			{
				a[i] *= 10;
				a[i] += (c - '0');
			}
		}
		n = i + 1;
		i = 0;
		while ((c = System.in.read()) != '\n')
		{
			if (c == ',')
			{
				i++;
			}
			else
			{
				b[i] *= 10;
				b[i] += (c - '0');
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = a[i];j < b[i];j++)
			{
				d[j]++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] > t)
			{
				t = b[i];
			}
		}
		j = 0;
		for (i = 0;i < t;i++)
		{
			if (d[i] > j)
			{
				j = d[i];
			}
		}
		System.out.printf("%d %d",n,j);
		return 0;
	}
}
