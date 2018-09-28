package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[50][50];
		int i;
		int[] t = new int[50];
		int j;
		int n;
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
			t[i] = String.valueOf(a[i]).length();
		}
		for (i = 0;i < n;i++)
		{
		if (a[i][t[i] - 2] == 'e' && a[i][t[i] - 1] == 'r')
		{
			for (j = 0;j < t[i] - 3;j++)
			{
				System.out.printf("%c",a[i][j]);
			}
			System.out.printf("%c\n",a[i][t[i] - 3]);
		}
		if (a[i][t[i] - 2] == 'l' && a[i][t[i] - 1] == 'y')
		{
			for (j = 0;j < t[i] - 3;j++)
			{
				System.out.printf("%c",a[i][j]);
			}
			System.out.printf("%c\n",a[i][t[i] - 3]);
		}
		if (a[i][t[i] - 3] == 'i' && a[i][t[i] - 2] == 'n' && a[i][t[i] - 1] == 'g')
		{
			for (j = 0;j < t[i] - 4;j++)
			{
				System.out.printf("%c",a[i][j]);
			}
			System.out.printf("%c\n",a[i][t[i] - 4]);
		}
		}
	}
}

