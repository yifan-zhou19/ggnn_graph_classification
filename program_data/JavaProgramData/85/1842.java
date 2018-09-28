package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l;
		int i;
		int j;
		int b;
		char[][] a = new char[100][20];
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
			b = 0;
			l = String.valueOf(a[i]).length();
			j = 0;
			if ((a[i][j] >= 'A' && a[i][j] <= 'Z') || (a[i][j] >= 'a' && a[i][j] <= 'z') || (a[i][j] == '_'))
			{
				b++;
			}
			for (j = 1;a[i][j] != '\0';j++)
			{
				if ((a[i][j] >= 'A' && a[i][j] <= 'Z') || (a[i][j] >= 'a' && a[i][j] <= 'z') || (a[i][j] >= '0' && a[i][j] <= '9') || (a[i][j] == '_'))
				{
					b++;
				}
			}
			if (b == l)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}

}

