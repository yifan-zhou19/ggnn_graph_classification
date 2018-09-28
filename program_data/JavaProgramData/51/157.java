public class a
{
	public String s = new String(new char[10]);
	public int num;
	public int del;
}

package <missing>;

public class GlobalMembers
{
	public static a[] list = tangible.Arrays.initializeWithDefaultaInstances(500);
	public static int n;
	public static int len;
	public static String s = new String(new char[1000]);
	public static int tot;
	public static int max = -1;

	public static void init()
	{
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		len = String.valueOf(gets(s)).length();
		tot = len - n + 1;
		for (i = 0;i < tot;i++)
		{
			for (j = 0;j < n;j++)
			{
				list[i].s = tangible.StringFunctions.changeCharacter(list[i].s, j, s.charAt(i + j));
			}
			list[i].num = list[i].del = 0;
			list[i].s = tangible.StringFunctions.changeCharacter(list[i].s, n, '\0');
		}
	}

	public static void solve()
	{
		int i;
		int j;
		for (i = 0;i < tot;i++)
		{
			if (list[i].del == 0)
			{
				list[i].num = 1;
				for (j = i + 1;j < tot;j++)
				{
					if (!strcmp(list[i].s,list[j].s))
					{
						list[i].num++;
						list[j].del = 1;
					}
				}
				if (list[i].num > max)
				{
					max = list[i].num;
				}
			}
		}
	}

	public static void print()
	{
		int i;
		if (max - 1 != 0)
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < tot;i++)
			{
				if (list[i].del == 0 && list[i].num == max)
				{
					System.out.println(list[i].s);
				}
			}
		}
		else
		{
			System.out.println("NO");
		}
	}

	public static int Main()
	{
		init();
		solve();
		print();
		return 0;
	}

}

