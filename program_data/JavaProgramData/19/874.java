package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] a = new char[100][100];
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		char d;
		int i;
		int n;
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
				d = tempVar2.charAt(0);
			}
			if (d == 10)
			{
				break;
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			c = tempVar4.charAt(0);
		}
		for (n = 0;n < i + 1;n++)
		{
			if (strcmp(a[n],b) == 0)
			{
			a[n] = c;
			}
		}

		for (n = 0;n < i;n++)
		{
			System.out.printf("%s ",a[n]);
		}
		System.out.printf("%s",a[i]);
		return 0;
	}

}

