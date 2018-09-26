package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 char[][] a = new char[200][200];
		 int f;
		 int i;
		 int j;
		 int t;
		 int q;
		 int sum = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 f = Integer.parseInt(tempVar);
		 }
		 for (i = 1;i <= f;i++)
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
			 t = Integer.parseInt(tempVar3);
		 }
		 for (q = 1;q < t;q++)
		 {
			 for (i = 1;i <= f;i++)
			 {
				for (j = 0;j < f;j++)
				{
					if (a[i][j] == '@')
					{
				   if (a[i - 1][j] != '#' && a[i - 1][j] != '@')
				   {
					   a[i - 1][j] = '!';
				   }
				   if (a[i + 1][j] != '#' && a[i + 1][j] != '@')
				   {
					   a[i + 1][j] = '!';
				   }
				   if (a[i][j + 1] != '#' && a[i][j + 1] != '@')
				   {
					   a[i][j + 1] = '!';
				   }
				   if (j - 1 >= 0)
				   {
				   if (a[i][j - 1] != '#' && a[i][j - 1] != '@')
				   {
					   a[i][j - 1] = '!';
				   }
				   }
					}
				}
			 }
			 for (i = 1;i <= f;i++)
			 {
				for (j = 0;j < f;j++)
				{
					if (a[i][j] == '!')
					{
						a[i][j] = '@';
					}
				}
			 }
		 }
		 for (i = 1;i <= f;i++)
		 {
			 for (j = 0;j < f;j++)
			 {
				 if (a[i][j] == '@')
				 {
					 sum++;
				 }
			 }
		 }
		 System.out.printf("%d",sum);
		return 0;
	}
}

