package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[800][80];
		char b;
		int i;
		int j;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine(); //scanf("%s",a[i]);
			if ((a[i][0] == '_') || ((a[i][0] >= 'a') && (a[i][0] <= 'z')) || ((a[i][0] >= 'A') && (a[i][0] <= 'Z')))
			{
				for (j = 1;a[i][j] != '\0';j++)
				{
							if ((a[i][j] == '_') || ((a[i][j] >= 'a') && (a[i][j] <= 'z')) || ((a[i][j] >= 'A') && (a[i][j] <= 'Z')) || ((a[i][j] >= '0') && (a[i][j] <= '9')))
							{
								continue;
							}
								else
								{
									System.out.print("0\n");
									break;
								}
				}
				if (a[i][j] == '\0')
				{
				System.out.print("1\n");
				}
			}
			else
			{
			System.out.print("0\n");
			}
		}
	}

}

