package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[][] p =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[][] q =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int[] a = new int[101];
		int[] b = new int[101];
		int[] c = new int[101];
		int n;
		int i = 0;
		int j = 0;
		int f = 0;
		int g = 0;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] >= 60)
			{
				b[f] = a[i];
				p[f] = s[i];
				f++;
			}
			else if (a[i] < 60)
			{
				c[g] = a[i];
				q[g] = s[i];
				g++;
			}
		}
		int e = 0;
		char[] y = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		for (j = 0;j < f;j++)
		{
			for (i = f - 2;i >= j;i--)
			{
				if (b[i] < b[i + 1])
				{
					e = b[i];
					b[i] = b[i + 1];
					b[i + 1] = e;
					y = p[i];
					p[i] = p[i + 1];
					p[i + 1] = y;
				}
			}
		}
		for (i = 0;i < f;i++)
		{
			System.out.printf("%s\n",p[i]);
		}
		for (j = 0;j < g;j++)
		{
			System.out.printf("%s\n",q[j]);
		}
		return 0;
	}


}

