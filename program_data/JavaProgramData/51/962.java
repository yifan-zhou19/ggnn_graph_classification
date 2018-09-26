package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int l;
	public static int i;
	public static int j;
	public static int[] f = new int[1000];
	public static int tm;
	public static int tn;
	public static int tt;
	public static String c = new String(new char[1000]);
	public static int st(int s,int t)
	{
		int k;
		for (k = 0;k < n;k++)
		{
		   if (c.charAt(s + k) != c.charAt(t + k))
		   {
					   return 0;
		   }
		}
		return 1;
	}

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		l = c.length();
		for (i = l - n;i >= 0;i--)
		{
			for (tt = 0,j = i;j <= l - n;j++)
			{
				if (st(i, j) != 0)
				{
					tt++;
				}
			}
			if (tt > tm)
			{
				f[0] = 1,f[1] = i,tm = tt;
			}
			else if (tt == tm)
			{
				f[++f[0]] = i;
			}
		}
		if (tm > 1)
		{
			System.out.printf("%d\n",tm);
		for (i = f[0];i != 0;i--,System.out.print("\n"))
		{
			for (j = 0;j < n;j++)
			{
				System.out.printf("%c",c.charAt(f[i] + j));
			}
		}
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}

}

