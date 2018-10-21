package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[505]);
	public static char[][] b = new char[505][10];
	public static int n;
	public static void zi(String a)
	{
		int i;
		int j;
		int m;
		m = a.length();
		for (i = 0;i <= m - n;i++)
		{
		for (j = 0;j < n;j++)
		{
		b[i][j] = a[i + j];
		}
		}
	}
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		zi(a);
		int m;
		int[] c = new int[505];
		int i;
		int j;
		int max;
		m = a.length();
		for (i = 0;i < m;i++)
		{
		for (j = 0;j < i;j++)
		{
		if (strcmp(b[i],b[j]) == 0)
		{
		c[j]++;
		}
		}
		}
		max = c[0];
		for (i = 0;i <= m - n;i++)
		{
		if (c[i] > max)
		{
		max = c[i];
		}
		}
		if (max == 0)
		{
		System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",max + 1);
			for (i = 0;i <= m - n;i++)
			{
			if (c[i] == max)
			{
			System.out.printf("%s\n",b[i]);
			}
			}
		}

	}
}

