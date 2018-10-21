package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int i;
	  int j;
	  int m;
	  int n;
	  int t;
	  int max;
	  char[][] str1 = new char[100][50];
	  char[][] str2 = new char[100][3];
	  i = 0;
		while (scanf("%s%s",str1[i],str2[i]) != EOF)
		{
					 i++;
		}
		n = i;

	  for (i = 0;i < n;i++)
	  {

			 m = 0;
			 t = String.valueOf(str1[i]).length();
			 max = str1[i][0];
			 for (j = 1;j < t;j++)
			 {

					 if (max < str1[i][j])
					 {
							 m = j;
							 max = str1[i][j];
					 }

			 }
			 for (j = 0;j <= m;j++)
			 {
					 System.out.printf("%c",str1[i][j]);
			 }
			 for (j = 0;j < 3;j++)
			 {
					 System.out.printf("%c",str2[i][j]);
			 }
			 for (j = m + 1;j < t;j++)
			 {
					 System.out.printf("%c",str1[i][j]);
			 }
			 System.out.print("\n");
	  }
	}


}
