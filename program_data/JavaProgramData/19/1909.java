package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[20][15];
		String b = new String(new char[15]);
		String c = new String(new char[15]);
		char d;
		int i;
		int j;
		for (i = 0,d = ' ';d != '\n';i++)
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
		}
		j = i;
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
		for (i = 0;i <= j - 1;i++)
		{
			if (strcmp(a[i],b) == 0)
			{
			a[i] = c;
			}
		}
		for (i = 0;i <= j - 2;i++)
		{
			System.out.printf("%s ",a[i]);
		}
		System.out.printf("%s",a[j - 1]);
		return 0;
	}


}

