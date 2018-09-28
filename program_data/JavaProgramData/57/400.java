package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] a = new char[100][100];
	char[][] b = new char[100][100];
	int[] len = new int[100];
	int i;
	int j;
	int n;
	int num;
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
	for (i = 0;i < n;i++)
	{
			len[i] = String.valueOf(a[i]).length();

			if (a[i][len[i] - 1] == 'r' || a[i][len[i] - 1] == 'y')
			{
				a[i][len[i] - 2] = 0;
			}
			if (a[i][len[i] - 1] == 'g')
			{
			a[i][len[i] - 3] = 0;
			}
	}
	for (i = 0;i < n;i++)
	{
		System.out.printf("%s\n",a[i]);
	}
		return 0;
	}
}

