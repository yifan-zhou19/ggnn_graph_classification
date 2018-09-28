package <missing>;

public class GlobalMembers
{
	public static int jian(int n,int m)
	{
		int i;
		int j;
		int s;
		int w;
		int p;
		int[] a = new int[301];
		int[] b = new int[300];
		for (i = 0;i < n;i++)
		{
			a[i] = i + 1;
		}
		w = n;
		for (i = 0;i < w - 1;i++)
		{
			s = m % n - 1;
			if (s == -1 && m < n)
			{
				s = m - 1;
			}
			else if (s == -1 && m >= n)
			{
				s = n - 1;
			}
			a[s] = a[300];
			if (s == 0)
			{
				for (j = 0;j < n;j++)
				{
					a[j] = a[j + 1];
				}
			}
			else
			{
			for (j = 0;j < s;j++)
			{
				b[j] = a[j];
			};
			for (j = s + 1;j < n;j++)
			{
				a[j - s - 1] = a[j];
			}
			j = 0;
			for (j = 0;j < s;j++)
			{
				p = n - s + j - 1;
				a[p] = b[j];
			}
			}
			n = n - 1;
		}
		System.out.printf("%d\n",a[0]);
		return (0);
	}
	public static void Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int j;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] == 0)
			{
				break;
			}
		}
		for (j = 0;j < i;j++)
		{
			jian(a[j], b[j]);
		}
	}

}

