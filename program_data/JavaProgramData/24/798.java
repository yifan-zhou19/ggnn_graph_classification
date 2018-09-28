package <missing>;

public class GlobalMembers
{
	public static int p;
	public static int q;
	public static int Main()
	{
		int choose = new int(int*,int);
		char[][] ss = new char[50][100];
		int i;
		int n;
		int[] a = new int[50];
		for (i = 0;scanf("%s",ss[i]) != EOF;i++)
		{
			;
		}
		n = i;
		for (i = 0;i < n;i++)
		{
			a[i] = String.valueOf(ss[i]).length();
		}
		choose(a, n);
		System.out.printf("%s\n%s",ss[p],ss[q]);
	}

	public static int choose(int[] a, int n)
	{
		int i;
		int max;
		int min;
		max = 0;
		min = a[0];
		p = 0;
		q = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] > max)
			{
			max = a[i];
			p = i;
			}
		if (a[i] < min)
		{
			min = a[i];
			q = i;
		}
		}
		return 0;
	}
}
