package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[1000][40];
		int n;
		int i;
		int j;
		int[] a = new int[1000];
		int line = 0;
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
				str[i] = tempVar2.charAt(0);
			}
			for (j = 0;str[i][j] != '\0';j++)
			{
				a[i] = a[i] + 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			line = line + a[i];
			if (line > 80)
			{
				System.out.print("\n");
				if (i == n - 1)
				{
					System.out.printf("%s",str[i]);
				}
				else
				{
					System.out.printf("%s ",str[i]);
				}
				line = a[i] + 1;
			}
			else
			{
				if (i == n - 1)
				{
					System.out.printf("%s",str[i]);
				}
				else
				{
					if (line + a[i + 1] + 1 > 80)
					{
						System.out.printf("%s",str[i]);
					}
					else
					{
						System.out.printf("%s ",str[i]);
					}
				}
				line = line+1;
			}
		}
		return 0;
	}
}

