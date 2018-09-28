package <missing>;

public class GlobalMembers
{
	public static void change(String x)
	{
		int i;
		int j;
		int l;
		char c;
		l = x.length();
		for (i = 0;i < l - 1;i++)
		{
			for (j = i + 1;j < l;j++)
			{
				if (x[i].compareTo(x[j]) > 0)
				{
					c = x[i];
					x[i] = x[j];
					x[j] = c;
				}
			}
		}
	}
	public static void Main()
	{
		int d;
		final String a = "";
		final String b = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		change(a);
		change(b);
		if ((d = strcmp(a,b)) == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}
}

