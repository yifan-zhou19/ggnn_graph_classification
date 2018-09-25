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
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		for (i = 0;i < n;i++)
		{
			k = strcmp(b,a[i]);
			if (k == 0)
			{
				a[i] = c;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%s ",a[i]);
		}
		System.out.printf("%s",a[n - 1]);
	}

}

