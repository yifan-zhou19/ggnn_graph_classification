package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] c = new char[50][100];
		String[] b = {""};
		String[] a = {""};
		int n;
		int i;
		int j;
		int l;
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
				c[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(c[i]).length();
			b[i] = c[i];
			b[i][l - 2] = 'e';
			b[i][l - 1] = 'r';
			if (strcmp(c[i],b[i]) == 0)
			{
				a[i] = String.valueOf(c[i]).substring(0, l - 2);
			}
			b[i] = c[i];
			b[i][l - 2] = 'l';
			b[i][l - 1] = 'y';
			if (strcmp(c[i],b[i]) == 0)
			{
				a[i] = String.valueOf(c[i]).substring(0, l - 2);
			}
			b[i] = c[i];
			b[i][l - 3] = 'i';
			b[i][l - 2] = 'n';
			b[i][l - 1] = 'g';
			if (strcmp(c[i],b[i]) == 0)
			{
				a[i] = String.valueOf(c[i]).substring(0, l - 3);
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",a[i]);
		}
	}
}

