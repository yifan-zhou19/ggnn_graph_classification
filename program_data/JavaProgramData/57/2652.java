package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] an = new char[50][33];
		int n;
		int i;
		int[] bn = new int[50];
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
				an[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			bn[i] = String.valueOf(an[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			if ((an[i][bn[i] - 2] == 'e' && an[i][bn[i] - 1] == 'r') || (an[i][bn[i] - 2] == 'l' && an[i][bn[i] - 1] == 'y'))
			{
				an[i][bn[i] - 2] = '\0';
			}
			if (an[i][bn[i] - 3] == 'i' && an[i][bn[i] - 2] == 'n' && an[i][bn[i] - 1] == 'g')
			{
				an[i][bn[i] - 3] = '\0';
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",an[i]);
		}
		return 0;
	}
}

