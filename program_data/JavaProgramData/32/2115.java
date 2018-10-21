package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[10][100];
		char[][] b = new char[10][100];
		int n;
		int i;
		int j;
		int[] lengtha = new int[10];
		int[] lengthb = new int[10];
		int begin;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 10;i++)
		{
			for (j = 0;j < 100;j++)
			{
			a[i][j] = '\0';
			b[i][j] = '\0';
			}
		}
		for (i = 0;i < 10;i++)
		{
			lengtha[i] = 0;
			lengthb[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;a[i][j] != '\0';j++)
			{
				lengtha[i]++;
			}
			for (j = 0;b[i][j] != '\0';j++)
			{
				lengthb[i]++;
			}
			for (j = lengthb[i] - 1;j >= 0;j--)
			{
				b[i][j + lengtha[i] - lengthb[i]] = b[i][j];
			}
			for (j = 0;j < lengtha[i] - lengthb[i];j++)
			{
				b[i][j] = '0';
			}
			for (j = lengtha[i] - 1;j >= 0;j--)
			{
				if (b[i][j] <= a[i][j])
				{
					a[i][j] = a[i][j] - b[i][j] + 48;
				}
				else
				{
					a[i][j] = 10 + a[i][j] - b[i][j] + 48;
					a[i][j - 1]--;
				}
			}
			begin = 0;
			for (j = 0;j < lengtha[i] - 1;j++)
			{
				if (a[i][j] != '0')
				{
					System.out.printf("%c",a[i][j]);
					begin = 1;
				}
				else if (begin == 1)
				{
					System.out.printf("%c",a[i][j]);
				}
			}
			System.out.printf("%c",a[i][lengtha[i] - 1]);
			System.out.print("\n");
		}
		return 0;
	}
}

