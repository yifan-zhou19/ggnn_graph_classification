package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m = 0;
		int i = 0;
		int j = 0;
		char[][] a = new char[100][10];
		char b;
		while (i < 100)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i++] = tempVar.charAt(0);
			}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		m++;
		if (b == '\n')
		{
							break;
		}
		}
		for (i = 1;i <= m - 1;i++)
		{
		j = m - i;
		System.out.printf("%s ",a[j]);
		}
		System.out.printf("%s",a[0]);



	  return 0;
	}

}

