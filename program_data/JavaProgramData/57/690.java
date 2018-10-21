package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int c;
		int i;
		char[][] a = new char[50][50];
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
			c = String.valueOf(a[i]).length();
			if (a[i][c - 1] == 'r')
			{
				a[i][c - 2] = '\0';
			}
			else if (a[i][c - 1] == 'y')
			{
				a[i][c - 2] = '\0';
			}
			else
			{
				a[i][c - 3] = '\0';
			}
			System.out.printf("%s\n",a[i]);
		}


	}
}

