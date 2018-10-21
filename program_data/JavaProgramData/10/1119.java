package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] c = new int[25];
	public static int max(int a,int b)
	{
		if (a >= b)
		{
		return (a);
		}
		else
		{
			return (b);
		}
	}
	public static int f(int mx,int st)
	{
		for (;st < n;st++)
		{
		if (c[st] <= mx)
		{
		return (max(f(c[st], st + 1) + 1, f(mx, st + 1)));
		}
		}
		return 0;
	}
	public static int Main()
	{
		int i;
		int s;
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
			c[i] = Integer.parseInt(tempVar2);
		}
		}
		s = f(4000, 0);
		System.out.printf("%d",s);
	}
}

