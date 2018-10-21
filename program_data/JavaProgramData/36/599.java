package <missing>;

public class GlobalMembers
{
	public static void ex(String a, String b)
	{
		char c;
		int l;
		int i;
		int j;
		l = a.length();
		for (i = 0;i < l;i++)
		{
			for (j = 0;j < l - 1;j++)
			{
				if (a[j].compareTo(a[j + 1]) < 0)
				{
					c = a[j];
					a[j] = a[j + 1];
					a[j + 1] = c;
				}
			}
		}
		l = b.length();
		for (i = 0;i < l;i++)
		{
			for (j = 0;j < l - 1;j++)
			{
				if (b[j].compareTo(b[j + 1]) < 0)
				{
					c = b[j];
					b[j] = b[j + 1];
					b[j + 1] = c;
				}
			}
		}
	}
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int l;
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
		ex(a, b);
		if (a.length() == b.length())
		{
			l = a.length();
			i = strcmp(a, b);
			if (i == 0)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
		else
		{
			System.out.print("NO");
		}
	}
}

