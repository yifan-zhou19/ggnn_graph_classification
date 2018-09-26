package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int flag = new int(char x[100],char y[100]);
	String stro = new String(new char[100]);
	String strt = new String(new char[100]);
	int f;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		stro = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		strt = tempVar2.charAt(0);
	}
	f = flag(stro, strt);
	if (f == 0)
	{
	System.out.print("YES");
	}
	else
	{
	System.out.print("NO");
	}
	}

	public static int flag(String x, String y)
	{
		int i;
		int j;
		int c;
		int m;
		int n;
		m = x.length();
		n = y.length();
		if (m != n)
		{
			c = 1;
		}
		else
		{
			for (i = 0,c = m;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (x[i].equals(y[j]))
					{
						x[i] = null;
						y[j] = null;
						c--;
						break;
					}
				}
			}
		}
		return (c);
	}

}

