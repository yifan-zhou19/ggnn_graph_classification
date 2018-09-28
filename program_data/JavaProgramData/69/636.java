package <missing>;

public class GlobalMembers
{
	public static int sdw1(String s1, int[] a)
	{
		int len = s1.length();
		int i;
		for (i = 0;i < len;i++)
		{
						  a[len - 1 - i] = s1[i] - '0';
		}
		return len;
	}
	public static int add(int[] a, int[] b, int[] c, int la, int lb)
	{
		int i;
		int len = (la > lb)?la:lb;
		for (i = 0;i < len;i++)
		{
					  c[i] = a[i] + b[i];
		}
		for (i = 0;i < len;i++)
		{
						  if (c[i] >= 10)
						  {
									  c[i + 1] = c[i + 1] + 1;
									  c[i] = c[i] % 10;
						  }
		}
		return (c[len] != 0)?(len + 1):len;
	}
	public static int Main()
	{
		String s1 = new String(new char[300]);
		String s2 = new String(new char[300]);
		int[] a = new int[300];
		int[] b = new int[300];
		int[] c = new int[300];
		int i;
		int la;
		int lb;
		int len;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		la = sdw1(s1, a);
		lb = sdw1(s2, b);
		len = add(a, b, c, la, lb);
		for (i = len - 1;i > 0;i--)
		{
							if (c[i] != 0)
							{
									   n = i;
									   break;
							}
		}
		for (i = n;i > -1;i--)
		{
						  System.out.printf("%d",c[i]);
		}

		return 0;
	}





}

