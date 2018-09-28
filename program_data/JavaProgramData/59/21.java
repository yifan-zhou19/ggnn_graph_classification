package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int day;
		int k = 1;
		int num = 0;
		char[][] a = new char[101][101];
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
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	again:
	;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					if (a[i + 1][j] == '.')
					{
						a[i + 1][j] = '%';
					}
					if (a[i - 1][j] == '.')
					{
						a[i - 1][j] = '%';
					}
					if (a[i][j + 1] == '.')
					{
						a[i][j + 1] = '%';
					}
					if (a[i][j - 1] == '.')
					{
						a[i][j - 1] = '%';
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '%')
				{
					a[i][j] = '@';
				}
			}
		}
		k++;
		if (k < day)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto again;
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					num++;
				}
			}
		}
		System.out.printf("%d",num);
	}
}

