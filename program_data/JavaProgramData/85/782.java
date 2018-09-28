package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int b;
		int j;
		int d = 1;
		int[] l = new int[100];
		char[][] a = new char[100][20];
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
			l[i] = String.valueOf(a[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			b = (int)a[i][0];
			if (a[i][0] == '_' || (b >= 65 && b <= 90) || (b >= 97 && b <= 122))
			{
				for (j = 1;j < l[i];j++)
				{
					b = (int)a[i][j];
					if (a[i][j] == '_' || (b >= 65 && b <= 90) || (b >= 97 && b <= 122) || (b >= 48 && b <= 57))
					{
						d = d + 1;
					}
					else
					{
						System.out.print("no\n");
						d = d - 1;
						break;
					}
				}
				if (d == l[i])
				{
					System.out.print("yes\n");
				}
			}
			else
			{
				System.out.print("no\n");
			}
			d = 1;
		}
		return 0;
	}

}

