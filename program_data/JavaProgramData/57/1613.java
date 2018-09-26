package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		char[][] a = new char[50][50];
		char[][] b = new char[50][50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			l = 0;
			l = String.valueOf(a[i]).length();
			if (a[i][l - 3] == 'i' && a[i][l - 2] == 'n')
			{
				b[i] = String.valueOf(a[i]).substring(0, l - 3);

			}
			else
			{
				b[i] = String.valueOf(a[i]).substring(0, l - 2);
			}
			System.out.printf("%s\n",b[i]);
		}
			 return 0;
	}

}

