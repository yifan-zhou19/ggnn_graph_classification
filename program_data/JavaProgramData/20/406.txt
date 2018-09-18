package <missing>;

public class GlobalMembers
{
	public static void into(String x, String y)
	{
		int l;
		int i;
		int m = 0;
		int k = 0;
		final String a = "";
		l = x.length();
		for (i = 1;i < l;i++)
		{
			if (x[i].compareTo(x[m]) > 0)
			{
				m = i;
			}
		}
		for (i = m + 1;i < l;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, k++, x[i]);
			x[i] = '\0';
		}
		x += y;
		x += a;
	}
	public static void Main()
	{
		int d;
		for (d = 0;d < 10;d++)
		{
			final String str = "";
			final String substr = "";
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				substr = tempVar2.charAt(0);
			}
			into(str, substr);
			System.out.println(str);
		}
	}


}

