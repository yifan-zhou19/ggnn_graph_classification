package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] l = new int[n];
		char[][] dc = new char[n][33];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				dc[i] = tempVar2.charAt(0);
			}
			l[i] = String.valueOf(dc[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			if (dc[i][l[i] - 1] == 'r')
			{
				dc[i][l[i] - 1] = 0;
				dc[i][l[i] - 2] = 0;
			}
			else if (dc[i][l[i] - 1] == 'y')
			{
				dc[i][l[i] - 1] = 0;
				dc[i][l[i] - 2] = 0;
			}
			else if (dc[i][l[i] - 1] == 'g')
			{
				dc[i][l[i] - 1] = 0;
				dc[i][l[i] - 2] = 0;
				dc[i][l[i] - 3] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",dc[i]);
		}
		return 0;
	}

}

