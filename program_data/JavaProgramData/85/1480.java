package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] name = new char[30][25];
		int i;
		int j;
		int n;
		int[] t = new int[30];
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
			name[i] = tempVar2.charAt(0);
		}
		t[i] = 0;
		}
		for (j = 0;j < n;j++)
		{
			i = 0;
			if (i == 0)
			{
				if ((name[j][i] >= 30 && name[j][i] <= 64) || (name[j][i] >= 91 && name[j][i] <= 94) || name[j][i] == 96 || name[j][i] >= 123)
				{
				   t[j] = 1;
				}
			}
			for (i = 1;name[j][i] != '\0';i++)
			{
				if ((name[j][i] >= 30 && name[j][i] <= 47) || (name[j][i] >= 58 && name[j][i] <= 64) || (name[j][i] >= 91 && name[j][i] <= 94) || name[j][i] == 96 || name[j][i] >= 123)
				{
				t[j] = 1;
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			if (t[j] == 1)
			{
			System.out.print("no\n");
			}
			else
			{
			System.out.print("yes\n");
			}
		}
	return 0;
	}
}

