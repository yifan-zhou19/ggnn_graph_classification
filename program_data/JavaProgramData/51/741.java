package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int m;
		int n;
		int j;
		int k;
		int i;
		int p;
		int[] c = new int[500];
		int v = 0;
		String a = new String(new char[502]);
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
		l = a.length();
		for (i = 0;i < l - n + 1;i++)
		{
			c[i] = 1;
			for (j = i + 1;j < l - n + 1;j++)
			{
				p = 1;
				for (k = 0;k < n;k++)
				{
				if (a.charAt(i + k) != a.charAt(j + k))
				{
					p = 0;
				}
				}
				if (p != 0)
				{
					c[i]++;
				}
			}

		}
		p = 0;
		for (i = 0;i < l - n + 1;i++)
		{
		if (c[0] != c[i])
		{
			p = 1;
		}
		}
		if (p != 0)
		{
		for (i = 0;i < l - n + 1;i++)
		{
				p = 1;
				for (j = 0;j < l - n + 1;j++)
				{
				if (c[i] < c[j])
				{
					p = 0;
				}
				}
				if (p != 0)
				{
					v++;
					if (v == 1)
					{
						System.out.printf("%d",c[i]);
					}
					System.out.print("\n");
					for (m = 0;m < n;m++)
					{
					System.out.printf("%c",a.charAt(i + m));
					}
				}
		}
		}
		else
		{
			System.out.print("NO");
		}
	}
}

