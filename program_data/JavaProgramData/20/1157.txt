package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 0;
		int i;
		int j;
		int k;
		int b;
		int a;
		char max;
	   char[][] str = new char[100][10];
	   char[][] substr = new char[100][3];
		while ((scanf("%s %s",str[n],substr[n])) != EOF)
		{
			  n++;
		}
		for (i = 0;i < n;i++)
		{
				  k = String.valueOf(str[i]).length();
			   max = str[i][0];
			   for (j = 1;j < k;j++)
			   {
					  if (str[i][j] > max)
					  {
						  max = str[i][j];
						  b = j;
					  }
			   }
			for (a = 0;a <= b;a++)
			{
				   System.out.printf("%c",str[i][a]);
			}
			  for (a = 0;a < 3;a++)
			  {
				  System.out.printf("%c",substr[i][a]);
			  }
			for (a = b + 1;a < k;a++)
			{
				   System.out.printf("%c",str[i][a]);
			}
			System.out.print("\n");
		}
	}




}
