package <missing>;

public class GlobalMembers
{
	public static int co(int[] m, int[] n, int j, int e)
	{
		int a;
		int b;
		int c;
		b = m[j];
		c = 0;
		for (a = j + 1;a < e;a++)
		{
			if (b >= m[a] != 0 && c <= n[a])
			{
				c = n[a];
			}
		}
		return (c);
	}
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int[] m = new int[26];
		int[] n = new int[26];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
		}
		n[a - 1] = 1;
		for (j = (a - 2);j >= 0;j--)
		{
			n[j] = co(m, n, j, a) + 1;
		}
		f = 0;
		for (g = 0;g < a;g++)
		{
			if (n[g] >= f)
			{
				f = n[g];
			}
		}
		System.out.printf("%d",f);
	}


}

