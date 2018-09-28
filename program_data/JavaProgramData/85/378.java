package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int l;
		char[][] a = new char[100][200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			if (a[i][0] < 58 && a[i][0]>47)
			{
				System.out.print("no\n");
			}
			else
			{
				for (j = 0;a[i][j] != '\0';j++)
				{
				if (a[i][j] != '_')
				{
					if (a[i][j] < 48 || a[i][j]>122)
					{
						System.out.print("no\n");
						break;
					}
					if (a[i][j] < 65 && a[i][j]>57)
					{
						System.out.print("no\n");
						break;
					}
					if (a[i][j] < 97 && a[i][j]>90)
					{
						System.out.print("no\n");
						break;
					}
				}
				}
			if (a[i][j] == '\0')
			{
				System.out.print("yes\n");
			}
			}
		}
	}
}

