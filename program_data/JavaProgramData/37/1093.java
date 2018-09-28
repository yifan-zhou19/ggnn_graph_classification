package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int l;
		String c = new String(new char[100005]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int[] a = new int[123];
			int[] p = new int[123];
			int pose = 100005;
			int targetchar = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			l = c.length();
			for (j = 0;j < l;j++)
			{
				a[c.charAt(j)]++;
				if (a[c.charAt(j)] == 1)
				{
					p[c.charAt(j)] = j;
				}
			}
			for (j = 97;j < 123;j++)
			{
				if (a[j] == 1)
				{
					if (p[j] < pose)
					{
						pose = p[j];
						targetchar = j;
					}
				}
			}
			if (targetchar != 0)
			{
				System.out.printf("%c\n",targetchar);
			}
			else
			{
				System.out.print("no\n");
			}
		}
	}
}

