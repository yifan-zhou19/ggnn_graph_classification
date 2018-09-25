package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][20];
		char b;
		String t = new String(new char[100]);
		String h = new String(new char[100]);
		int i;
		int g = 0;
		int result;
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
			g++;
			if (b == 10)
			{
				break;
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			t = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			h = tempVar4.charAt(0);
		}

		for (i = 0;i < g;i++)
		{
			result = strcmp(t,a[i]);

			if (result == 0)
			{
				a[i] = h;
			}
		}
		for (i = 0;i < g - 1;i++)
		{
			System.out.printf("%s ",a[i]);
		}
		i = g - 1;
		System.out.printf("%s",a[i]);




		return 0;
	}
}

