package <missing>;

public class GlobalMembers
{
	public static int a;
	public static int b;
	public static int[] c = new int[20];
	public static int[] d = new int[20];
	public static int[] e = new int[40];
	public static void in()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < a;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < b;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				d[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static int number(int[] m)
	{
		int i;
		int n = 0;
		for (i = 0;m[i] != 0;i++)
		{
			n++;
		}
		return n;
	}
	public static void change(int[] s)
	{
		int i;
		int j;
		int m;
		for (i = 1;i < number(s);i++)
		{
			for (j = 0;j < number(s) - 1;j++)
			{
				if (s[j] > s[j + 1])
				{
					m = s[j];
					s[j] = s[j + 1];
					s[j + 1] = m;
				}
			}
		}
	}
	public static void link(int[] m, int[] n)
	{
		int i;
		int j = 0;
		for (i = 0;m[i] != 0;i++)
		{
			e[i] = m[i];
			j++;
		}
		for (i = 0;n[i] != 0;i++)
		{
			e[j] = n[i];
			j++;
		}
	}
	public static void out()
	{
		int i;
		for (i = 0;e[i] != 0;i++)
		{
			System.out.printf("%d",e[i]);
			if (e[i + 1] != 0)
			{
				System.out.print(" ");
			}
		}
	}
	public static int Main()
	{
		in();
		change(c);
		change(d);
		link(c, d);
		out();
	}
}

