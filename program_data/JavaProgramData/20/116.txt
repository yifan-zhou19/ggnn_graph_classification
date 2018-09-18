package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		  int i = 0;
		  int[] k = new int[100];
		  int j;
		  int[] a = new int[100];
		  char[][] str = new char[100][50];
		  char max;
		  do
		  {
			  str[i] = new Scanner(System.in).nextLine();
			  a[i] = String.valueOf(str[i]).length();
			  i++;
		  } while (str[i - 1][0] != '\0');

		  for (i = 0;str[i][0] != '\0';i++)
		  {
			  max = str[i][0];
			  for (j = 0;j < a[i] - 4;j++)
			  {
				  if (str[i][j] > max)
				  {
					  max = str[i][j];
				  k[i] = j;
				  }
			  }
		  }
		  for (i = 0;str[i][0] != '\0';i++)

		  {
			  for (j = 0;j <= k[i];j++)
			  {
				  System.out.printf("%c",str[i][j]);
			  }
			  for (j = a[i] - 3;j < a[i];j++)
			  {
				  System.out.printf("%c",str[i][j]);
			  }
			  for (j = k[i] + 1;j < a[i] - 4;j++)
			  {
				  System.out.printf("%c",str[i][j]);
			  }
			  System.out.print("\n");
		  }
	}
}
