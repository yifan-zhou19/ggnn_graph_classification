package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100];
		char[][] str = new char[100][50];
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
			a[i] = String.valueOf(str[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			if (str[i][a[i] - 2] == 'e' && str[i][a[i] - 1] == 'r')
			{
				for (j = 0;j < a[i] - 2;j++)
				{
					System.out.printf("%c",str[i][j]);
				}
			}
				System.out.print("\n");

			if (str[i][a[i] - 2] == 'l' && str[i][a[i] - 1] == 'y')
			{
				for (j = 0;j < a[i] - 2;j++)
				{
					System.out.printf("%c",str[i][j]);
				}
				System.out.print("\n");
			}
			if (str[i][a[i] - 3] == 'i' && str[i][a[i] - 2] == 'n' && str[i][a[i] - 1] == 'g')
			{
				for (j = 0;j < a[i] - 3;j++)
				{
					System.out.printf("%c",str[i][j]);
				}
				System.out.print("\n");
			}
		}
	}

}

