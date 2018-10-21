package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][20];
		int n;
		int i;
		int j;
		int[] len = new int[100];
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
				a[i] = tempVar2.charAt(0);
			}
			len[i] = String.valueOf(a[i]).length();
		}
		int w;
		for (i = 0;i < n;i++)
		{
			w = 0;
			for (j = 0;j < len[i];j++)
			{
				if (((a[i][j] >= 48) && (a[i][j] <= 57)) || ((a[i][j] >= 97) && (a[i][j] <= 122)) || ((a[i][j] >= 65) && (a[i][j] <= 90)) || (a[i][j] == 95))
				{
					w++;
				}
			}
			if (w == len[i])
			{
				if (((a[i][0] >= 48) && (a[i][0] <= 57)))
				{
					System.out.print("no\n");
				}
				else
				{
					System.out.print("yes\n");
				}
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}



}

