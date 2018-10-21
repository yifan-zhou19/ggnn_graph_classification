package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		char[][] a = new char[100][100];
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		int n = 0;
		for (i = 0;i < 100;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar.charAt(0);
			}
			n++;
			k = System.in.read();
			if (k == '\n')
			{
				break;
			}
		}
		b = a[0];
		for (i = 0;i < n;i++)
		{
			if (b.length() > String.valueOf(a[i]).length())
			{
				b = a[i];
			}
		}
		c = a[0];
		for (i = 0;i < n;i++)
		{
			if (c.length() < String.valueOf(a[i]).length())
			{
				c = a[i];
			}
		}
		System.out.printf("%s\n",c);
		System.out.printf("%s\n",b);
	}
}

