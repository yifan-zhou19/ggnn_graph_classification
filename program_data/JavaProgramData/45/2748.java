package <missing>;

public class GlobalMembers
{
	public static int f(String a, String b, int i)
	{
		int j;
		int s = 1;
		for (j = 0; !a[j].equals(0);j++)
		{
			if (!a[j].equals(b[i + j]))
			{
				s = 0;
				break;
			}
		}
		return (s);
	}
	public static int Main()
	{
		String a = new String(new char[60]);
		String b = new String(new char[60]);
		int i;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		m = a.length();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		n = b.length();
		for (i = 0;i <= n - m;i++)
		{
			if (f(a, b, i) == 1)
			{
				break;
			}
		}
		System.out.printf("%d",i);
	}



}

