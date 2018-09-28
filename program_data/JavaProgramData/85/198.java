package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		char[][] shit = new char[100][100];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		int m = 0;



		for (i = 0;i < a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				shit[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < a;i++)
		{
			m = 0;
			for (j = 0;shit[i][j] != 0;j++)
			{
				if (((shit[i][j] >= 65) && (shit[i][j] <= 90)) || ((shit[i][j] >= 97) && (shit[i][j] <= 122)) || ((shit[i][j] >= 48) && (shit[i][j] <= 57)) || (shit[i][j] == 95))
				{
					continue;

				}
				else
				{
					m = 1;
				}


			}
			if (shit[i][0] >= 48 && shit[i][0] <= 57)
			{
					m = 1;
			}
			if (m == 0)
			{
			System.out.print("yes\n");
			}
			else if (m == 1)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}



}

