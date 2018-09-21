package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] len = new int[200];
		char[][] c = new char[200][200];
		int i;
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
				c[i] = tempVar2.charAt(0);
			}
			len[i] = String.valueOf(c[i]).length();
		}
		int max = len[0];
		int min = len[0];
		for (i = 1;i < n;i++)
		{
			if (max < len[i])
			{
				max = len[i];
			}
			if (min > len[i])
			{
				min = len[i];
			}
		}
		if (max == min)
		{
			System.out.printf("%s\n%s\n", c[0], c[0]);
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				if (max == len[i])
				{
					System.out.printf("%s\n", c[i]);
					break;
				}
			}
			for (i = 0;i < n;i++)
			{
				if (min == len[i])
				{
					System.out.printf("%s\n", c[i]);
					break;
				}
			}
		}
		return 0;
	}





}

