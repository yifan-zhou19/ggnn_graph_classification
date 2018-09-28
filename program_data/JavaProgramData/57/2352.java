package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		  char[][] str = new char[50][30];
		  int n;
		  int i;
		  int j;
		  int m;
		  int k;
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
			 k = String.valueOf(str[i]).length();
			 if (str[i][k - 1] == 'g')
			 {
				 for (j = 0;j < k - 3;j++)
				 {
					System.out.printf("%c",str[i][j]);
				 }
			 }
			if (str[i][k - 1] == 'y' || str[i][k - 1] == 'r')
			{
				for (j = 0;j < k - 2;j++)
				{
					System.out.printf("%c",str[i][j]);
				}
			}
			System.out.print("\n");
		  }
	}

}

