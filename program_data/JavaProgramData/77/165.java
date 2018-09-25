package <missing>;

public class GlobalMembers
{
	public static int sum(int[] line2, int a, int b)
	{
		int i;
		int c = 0;
		for (i = a;i <= b;i++)
		{
			c += line2[i];
		}
		return (c);
	}


	public static int Main()
	{
		String line = new String(new char[100]);
		int[] line1 = new int[100];
		int i;
		int j;
		int k;
		int[][] line3 = new int[50][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			line = tempVar.charAt(0);
		}
		k = line.length() / 2 - 1;
		for (i = 0;i < line.length();i++)
		{
			if (line.charAt(i) == line.charAt(0))
			{
				line1[i] = 1;
			}
			if (line.charAt(i) == line.charAt(line.length() - 1))
			{
				line1[i] = -1;
			}
		}
		for (i = line.length() - 1;i >= 0;i--)
		{
			if (line1[i] == -1)
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (sum(line1, j, i) == 0)
					{
						line3[k][0] = j;
						line3[k][1] = i;
						k--;
						break;
					}
				}
			}
		}
		for (i = 0;i < line.length() / 2;i++)
		{
			System.out.printf("%d %d\n",line3[i][0],line3[i][1]);
		}
		return 0;
	}


}

