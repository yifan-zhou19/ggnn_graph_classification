package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m;
		int f = 0;
		char[][] a = new char[200][50];
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
			m = String.valueOf(a[i]).length();
			for (j = 0;j < m;j++)
			{
				if (a[i][0] > 47 && a[i][0] < 58)
				{
				System.out.print("no\n");
				f = 1;
				break;
				}
				 else if (a[i][j] > 47 && a[i][j] < 58)
				 {
				 }
				else if (a[i][j] > 64 && a[i][j] < 91)
				{
				}
				else if (a[i][j] > 96 && a[i][j] < 123)
				{
				}
				else if (a[i][j] == '_')
				{
				}
				else
				{
					System.out.print("no\n");

				f = 1;
				break;

				}
			}
				if (f == 0)
				{
					System.out.print("yes\n");
				}
				else
				{
					f = 0;
				}





		}
	}
}

