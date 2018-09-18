package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[100][10];
		char[][] substr = new char[100][3];
	  int m;
	  int k;
	  int n = 0;
	  int i;
	  int j;
	  char max;

	  while (scanf("%s %s",str[n],substr[n]) != EOF)
	  {
			 n++;
	  }
	  for (i = 0;i < n;i++)
	  {
			  m = String.valueOf(str[i]).length();
			 j = 0;
			 max = str[i][j];
			 for (j = 1;j < m;j++)
			 {
				   if (str[i][j] > max)
				   {
					   max = str[i][j];
					   k = j;
				   }
			 }

			for (j = 0;j <= k;j++)
			{
					System.out.printf("%c",str[i][j]);
			}
			for (j = 0;j < 3;j++)
			{
				   System.out.printf("%c",substr[i][j]);
			}
			for (j = k + 1;j < m;j++)
			{
				  System.out.printf("%c",str[i][j]);
			}
			  System.out.print("\n");
	  }
	}
}
