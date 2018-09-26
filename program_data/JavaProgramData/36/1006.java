package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int i;
		int j;
		int m;
		int n;
		int k;
		n = a.length();
		m = b.length();
		if (m != n)
		{
			System.out.print("NO");
		}
		else
		{
			int[] c = new int[52];
			int[] d = new int[52];
			for (i = 0;i < n;i++)
			{
				for (j = 65;j <= 90;j++)
				{
					if (a.charAt(i) == j)
					{
						c[j - 65] += 1;
					}
					if (b.charAt(i) == j)
					{
						d[j - 65] += 1;
					}
				}

				for (j = 97;j <= 122;j++)
				{
					if (a.charAt(i) == j)
					{
						c[j - 71] += 1;
					}
					if (b.charAt(i) == j)
					{
						d[j - 71] += 1;
					}
				}
			}
			k = 0;
			for (i = 0;i < 52;i++)
			{
				if (c[i] != d[i])
				{
					k = 1;
				}
			}
			if (k == 1)
			{
				System.out.print("NO");
			}
			else
			{
				System.out.print("YES");
			}
		}
	}
}

