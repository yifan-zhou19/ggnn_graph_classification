package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int e;
		int v = 0;
		int k;
		int[] m = new int[100];
		int[] p = new int[100];
		int[] b = new int[100];
		char[][] s = new char[100][11];
		String temp = new String(new char[11]);
		char[][] d = new char[100][11];
		char[][] f = new char[100][11];
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
				s[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (m[i] >= 60)
			{
				d[j] = s[i];
				p[j] = m[i];
				j++;
			}
			else
			{
				f[v] = s[i];
				b[v] = m[i];
				v++;
			}
		}
		for (k = 1;k < j;k++)
		{
			for (i = 0;i < j - k;i++)
			{
				if (p[i] < p[i + 1])
				{
					e = p[i + 1];
					p[i + 1] = p[i];
					p[i] = e;
					temp = d[i + 1];
					d[i + 1] = d[i];
					d[i] = temp;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s\n",d[i]);
		}
		for (i = 0;i < v;i++)
		{
			System.out.printf("%s\n",f[i]);
		}
		return 0;
	}

}

