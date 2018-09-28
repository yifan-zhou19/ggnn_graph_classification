package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] sz1 = new char[100][21];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz1[i] = tempVar2.charAt(0);
			}
		}
		int[] sz2 = new int[100];
		for (i = 0;i < n;i++)
		{
			sz2[i] = String.valueOf(sz1[i]).length();
		}
		char[][] sz3 = new char[100][10];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < sz2[i];j++)
			{
				if (sz1[i][j] <= 47 || sz1[i][j] >= 58 && sz1[i][j] <= 64 || sz1[i][j] >= 91 && sz1[i][j] <= 94 || sz1[i][j] == 96 || sz1[i][j] >= 123 || sz1[i][0] >= 48 && sz1[i][0] <= 57)
				{
					sz3[i][0] = 'n';
					sz3[i][1] = 'o';
					sz3[i][2] = 0;
					break;
				}
				else
				{
					sz3[i][0] = 'y';
					sz3[i][1] = 'e';
					sz3[i][2] = 's';
					sz3[i][3] = 0;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.println(sz3[i]);
		}
		return 0;
	}











}

