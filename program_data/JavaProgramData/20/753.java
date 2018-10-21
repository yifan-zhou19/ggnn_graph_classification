package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  char[][] str = new char[100][11];
	  char[][] substr = new char[100][4];
	  int k;
	  int i = 0;
	  int j;
	  int m;
	  while (scanf("%s%s",str[i],substr[i]) != EOF)
	  {
		k = 0;
		m = str[i][0];
		for (j = 1;str[i][j];j++)
		{
		  if (str[i][j] > m)
		  {
			  m = str[i][j];
		   k = j;
		  }
		}
		for (j = 0;j <= k;j++)
		{
		 System.out.printf("%c",str[i][j]);
		}
		System.out.printf("%s",substr[i]);
		for (;str[i][j];j++)
		{
		 System.out.printf("%c",str[i][j]);
		}
		System.out.print("\n");
		i++;
	  }
	}


}
