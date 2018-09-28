package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] dc = new char[9999][33];
		int n;
		int i;
		int[] sz = new int[9999];
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
				dc[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			sz[i] = String.valueOf(dc[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			if ((dc[i][sz[i] - 1] == 'r') && (dc[i][(sz[i] - 2)] == 'e'))
			{
				dc[i][(sz[i] - 2)] = '\0';
			}
			else if (dc[i][sz[i] - 1] == 'y' && dc[i][sz[i] - 2] == 'l')
			{
				dc[i][sz[i] - 2] = '\0';
			}
			else if (dc[i][sz[i] - 1] == 'g' && dc[i][sz[i] - 2] == 'n' && dc[i][sz[i] - 3] == 'i')
			{
				dc[i][sz[i] - 3] = '\0';
			}
			System.out.printf("%s\n",dc[i]);
		}


		return 0;
	}




}

