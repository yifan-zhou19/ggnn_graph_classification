package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] l = new int[50];
		char[][] a = new char[50][20];

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
			l[i] = String.valueOf(a[i]).length();
		}

		for (i = 0;i < n;i++)
		{
			if (a[i][l[i] - 3] == 'i' && a[i][l[i] - 2] == 'n' && a[i][l[i] - 1] == 'g')
			{
				for (j = 0;j < l[i] - 4;j++)
				{
					System.out.printf("%c",a[i][j]);
				}
				System.out.printf("%c\n",a[i][l[i] - 4]);
			}
			else if (a[i][l[i] - 2] == 'e' && a[i][l[i] - 1] == 'r')
			{
				for (j = 0;j < l[i] - 3;j++)
				{
					System.out.printf("%c",a[i][j]);
				}
				System.out.printf("%c\n",a[i][l[i] - 3]);
			}
			else if (a[i][l[i] - 2] == 'l' && a[i][l[i] - 1] == 'y')
			{

				for (j = 0;j < l[i] - 3;j++)
				{
					System.out.printf("%c",a[i][j]);
				}
				System.out.printf("%c\n",a[i][l[i] - 3]);
			}
			else
			{
				for (j = 0;j < l[i] - 1;j++)
				{
					System.out.printf("%c",a[i][j]);
				}
				System.out.printf("%c\n",a[i][l[i] - 1]);
			}
		}
	}







}

