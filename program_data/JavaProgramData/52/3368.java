package <missing>;

public class GlobalMembers
{
	public static void change(int[] a, int n, int m)
	{
		int[] a1 = new int[1000];
		int[] p = a;
		int[] p1 = a1;
		int i;
		int j;
		int t = 1;
		for (i = n - m,j = 0;i < n;i++,j++)
		{
			p1[j] = p[i];
		}
		for (i = n - m - 1;i >= 0;i--,t++)
		{
			p[n - t] = (p + i);
		}
		for (t = 0;t < m;t++)
		{
			p[t] = (p1 + t);
		}
	}
	public static void Main()
	{
		int[] a = new int[1000];
		int n;
		int m;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		do
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			i++;
		} while (System.in.read() != '\n');
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}
		n = i;
		change(a, n, m);
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[i]);
	}

}

