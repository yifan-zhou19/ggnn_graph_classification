package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] a = new char[100][100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(a,'.',(Character.SIZE / Byte.SIZE));
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < n;i++)
	{
	for (int j = 0;j < n;j++)
	{
	a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
	}
	}
	int day;
	day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (day > 1)
	{
		day = day - 1;
	for (int i = 0;i < n;i++)
	{
	for (int j = 0;j < n;j++)
	{
		   if (a[i][j] == '.')
		   {
						   if ((i - 1 >= 0 && a[i - 1][j] == '@') || (i + 1 < n && a[i + 1][j] == '@') || (j - 1 >= 0 && a[i][j - 1] == '@') || (j + 1 < n && a[i][j + 1] == '@'))
						   {
							   a[i][j] = '!';
						   }
		   }
	}
	}
	for (int i = 0;i < n;i++)
	{
	for (int j = 0;j < n;j++)
	{
		if (a[i][j] == '!')
		{
			a[i][j] = '@';
		}
	}
	}

	}
	int sum = 0;
	for (int i = 0;i < n;i++)
	{
	for (int j = 0;j < n;j++)
	{
		if (a[i][j] == '@')
		{
			sum += 1;
		}
	}
	}
	System.out.print(sum);

		return 0;
	}

}

