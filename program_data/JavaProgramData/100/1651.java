package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int i;
		int j;
		int p = 0;
		int[][] count = new int[2][26];
		String zf = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zf = tempVar.charAt(0);
		}
		len = zf.length();
		for (i = 0;i < len;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (zf.charAt(i) == 'A' + j)
				{
					count[0][j]++;
					p = 1;
				}
				if (zf.charAt(i) == 'a' + j)
				{
					count[1][j]++;
					p = 1;
				}
			}
		}
		if (p == 0)
		{
			System.out.print("No");
		}
		else
		{

			for (j = 0;j < 26;j++)
			{
				if (count[0][j] != 0)
				{
				System.out.printf("%c=%d\n",'A' + j,count[0][j]);
				}
			}
			for (j = 0;j < 26;j++)
			{
				if (count[1][j] != 0)
				{
					System.out.printf("%c=%d\n",'a' + j,count[1][j]);
				}
			}
		}
		return 0;
	}


}

