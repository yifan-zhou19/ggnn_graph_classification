package <missing>;

public class GlobalMembers
{
	public static char[][] a = new char[100][100];
	public static int Main()
	{
		int k = 1;
		while (true)
		{
			a[k] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			System.out.print(a[k]);
			System.out.print("\n");
			for (int i = 0;i < String.valueOf(a[k]).length();i++)
			{
				if (a[k][i] != '(' && a[k][i] != ')')
				{
					a[k][i] = ' ';
				}
			}
			for (int i = 0;i < String.valueOf(a[k]).length() - 1;i++)
			{
				int sum = 1;
				if (a[k][i] == '(')
				{
				for (int j = i + 1;j < String.valueOf(a[k]).length();j++)
				{
				   if (a[k][j] == '(')
				   {
					   sum++;
				   }
				   if (a[k][j] == ')')
				   {
					   sum--;
				   }
				   if (sum == 0)
				   {
					   a[k][i] = ' ';
					   a[k][j] = ' ';
					   break;
				   }
				}
				}
			}
			 for (int i = 0;i < String.valueOf(a[k]).length();i++)
			 {
				 if (a[k][i] == '(')
				 {
					 a[k][i] = '$';
				 }
				 if (a[k][i] == ')')
				 {
					 a[k][i] = '?';
				 }
				 System.out.print(a[k][i]);
			 }
			 System.out.print("\n");
			k++;
		}
		return 0;
	}


}

