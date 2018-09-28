package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] l = new int[50];
		char[][] w = new char[50][33];
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
				w[i] = tempVar2.charAt(0);
			}
			l[i] = String.valueOf(w[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			if (w[i][(l[i]) - 1] == 'r')
			{
				l[i] -= 2;
			}
			else if (w[i][(l[i]) - 1] == 'y')
			{
				l[i] -= 2;
			}
			else if (w[i][(l[i]) - 1] == 'g')
			{
				l[i] -= 3;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (int j = 0;j < l[i];j++)
			{
				System.out.printf("%c",w[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}


}

