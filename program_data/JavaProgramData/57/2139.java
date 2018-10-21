package <missing>;

public class GlobalMembers
{
	public static int f(String a, int la, String p, int lp)
	{
		int m = la - 1;
		int n = lp - 1;
		if (la < lp)
		{
			return 0;
		}
		while ((n >= 0) && (a[m].equals(p[n])))
		{
			m--;
			n--;
		}
		if (n < 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void g(String a, int l, int k)
	{
		a[l - k] = null;
	}

	public static void Main()
	{
		int count;
		int i;
		int j;
		int l;
		int k;
		int[] c = {2, 2, 3};
		String a = new String(new char[33]);
		String[] b = {"er", "ly", "ing"};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			count = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < count;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a = tempVar2.charAt(0);
		   }
		   l = a.length();
		   k = 0;
		   while ((k < 3) && (f(a, l, b[k], c[k]) == 0))
		   {
			   k++;
		   }
		   if (k < 3)
		   {
			   g(a, l, c[k]);
		   }
		   System.out.println(a);
		}
	}
}

