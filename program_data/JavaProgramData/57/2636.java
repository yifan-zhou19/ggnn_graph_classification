package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		String w = new String(new char[20]);
		char[][] w1 = new char[100][20];
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
				w = tempVar2.charAt(0);
			}
			if (w.charAt(w.length() - 1) == 'r')
			{
				for (j = 0;j < w.length() - 2;j++)
				{
					w1[i][j] = w.charAt(j);
				}
				w1[i][j] = '\0';
			}
			if (w.charAt(w.length() - 1) == 'y')
			{
				for (j = 0;j < w.length() - 2;j++)
				{
					w1[i][j] = w.charAt(j);
				}
				w1[i][j] = '\0';
			}
			if (w.charAt(w.length() - 1) == 'g')
			{
				for (j = 0;j < w.length() - 3;j++)
				{
					w1[i][j] = w.charAt(j);
				}
				w1[i][j] = '\0';
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.println(w1[i]);
		}
	}

}

