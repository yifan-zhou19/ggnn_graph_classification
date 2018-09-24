package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[50][50];
		int n;
		int i;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i - 1] = tempVar2.charAt(0);
			}
		}
		for (i = 1;i <= n;i++)
		{
			len = String.valueOf(a[i - 1]).length();
			if ((a[i - 1][len - 1] == 'r') && (a[i - 1][len - 2] == 'e'))
			{
				a[i - 1][len - 2] = 0;
			}
			else if ((a[i - 1][len - 1] == 'y') && (a[i - 1][len - 2] == 'l'))
			{
				a[i - 1][len - 2] = 0;
			}
			else if ((a[i - 1][len - 1] == 'g') && (a[i - 1][len - 2] == 'n') && (a[i - 1][len - 3] == 'i'))
			{
				a[i - 1][len - 3] = 0;
			}
		}
		for (i = 1;i <= n;i++)
		{
			System.out.printf("%s\n",a[i - 1]);
		}
		return 0;
	}







}

