import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   char[][] str = new char[1000][81];
	   int[] a = new int[1000];

	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   System.in.read();
	   for (i = 0;i < n;i++)
	   {
			  str[i] = new Scanner(System.in).nextLine();
			  if (((str[i][0] == '_') || (str[i][0] >= 65 && str[i][0] <= 90) || (str[i][0] >= 97 && str[i][0] <= 122)) == 1)
			  {
				  a[i] = 1;
			  }
			  else
			  {
				  a[i] = 0;
			  }

	   }

	   for (i = 0;i < n;i++)
	   {
			  for (j = 1;str[i][j] != '\0';j++)
			  {
				  if (((str[i][j] == '_') || (str[i][j] >= 65 && str[i][j] <= 90) || (str[i][j] >= 97 && str[i][j] <= 122) || (str[i][j] >= 48 && str[i][j] <= 57)) == 0)
				  {
					  a[i] = 0;
				  }

			  }
	   }
	   for (i = 0;i < n;i++)
	   {
		   System.out.print(a[i]);
		   System.out.print("\n");
	   }

	   return 0;


	}
}

