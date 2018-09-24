public class book
{
	public int num;
	public String name = new String(new char[27]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] b = tangible.Arrays.initializeWithDefaultbookInstances(1001);
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int d;
		int[] g = new int[27];
		int e = 0;
		int f = 0;
		int l;
		char m;
		char h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i].name = tempVar3.charAt(0);
			}
		}
		m = 'A';
		for (k = 0;k < 26;k++)
		{
			d = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < 26;j++)
				{
					if (b[i].name.charAt(j) == m)
					{
						d++;
					}
					if (b[i].name.charAt(j) == '\0')
					{
						break;
					}
				}
			}
			m = m + 1;
			g[k] = d;
			if (g[k] > e)
			{
				e = g[k];
				f = k;
			}
		}
		h = 'A' + f;
		System.out.printf("%c\n%d\n",h,e);
		for (i = 0;i < n;i++)
		{
			d = 0;
			for (j = 0;j < 26;j++)
			{
				if (b[i].name.charAt(j) == h)
				{
					d++;
				}
				if (b[i].name.charAt(j) == '\0')
				{
					break;
				}
			}
			if (d != 0)
			{
				System.out.printf("%d\n",b[i].num);
			}
		}
	}
}

