package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int j;
		int i;
		int n;

		int[][] t = new int[100][20];
		char[][] s = new char[100][20];
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
				s[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;s[i][j] != '\0';j++)
			{
				t[i][j] = s[i][j];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (t[i][0] >= 48 && t[i][0] <= 57)
			{
				System.out.print("no\n");

			}
			else
			{
				for (j = 0;s[i][j] != 0;j++)
				{
					if (t[i][j] >= 32 && t[i][j] <= 47)
					{
						c = 1;
						break;
					}
				   else if (t[i][j] >= 58 && t[i][j] <= 64)
				   {
						c = 1;
						break;
				   }
					else if (t[i][j] >= 91 && t[i][j] <= 94)
					{
						c = 1;
						break;
					}
					else if (t[i][j] >= 123 && t[i][j] <= 126)
					{
						c = 1;
						break;
					}
					else if (t[i][j] == 96)
					{
						c = 1;
						break;

					}
				   else
				   {
						c = 0;
				   }

				}
				if (c == 1)
				{
					System.out.print("no\n");
				}
				else
				{
					System.out.print("yes\n");
				}
			}
		}



		return 0;
	}

}

