package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		char[][] c = new char[50][50];
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
				c[i] = tempVar2.charAt(0);
			}
		k = String.valueOf(c[i]).length();
		b[i][0] = c[i][k - 2];
		b[i][1] = c[i][k - 1];
		if (strcmp(b[i],"er") == 0)
		{
			for (j = 0;j < k - 2;j++)
			{
				System.out.printf("%c",c[i][j]);
			}
		}
		else if (strcmp(b[i],"ly") == 0)
		{
			for (j = 0;j < k - 2;j++)
			{
				System.out.printf("%c",c[i][j]);
			}
		}
		else
		{
			for (j = 0;j < k - 3;j++)
			{
				System.out.printf("%c",c[i][j]);
			}
		}
		System.out.print("\n");
		}
	}
}

