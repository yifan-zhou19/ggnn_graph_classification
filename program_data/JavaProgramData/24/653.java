package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[50][20];
		char b;
		String c = new String(new char[50]);
		String d = new String(new char[50]);
		int i;
		int j;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			if (b == '\n')
			{
				j = i;
				break;
			}
		}
		c = a[0];
		d = a[0];

		for (i = 0;i <= j;i++)
		{
			if (String.valueOf(a[i]).length() > c.length())
			{
				c = a[i];
			}
			if (String.valueOf(a[i]).length() < d.length())
			{
				 d = a[i];
			}
		}
		System.out.printf("%s\n%s\n",c,d);
		return 0;
	}
}

