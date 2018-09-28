import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n; //????n,????i,j,??p[100]
	  int i;
	  int j;
	  int[] p = new int[100];
	  char[][] a = new char[100][81]; //??????a[100][80]
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  System.in.read();
	  for (i = 0;i < n;i++)
	  {
		  a[i] = new Scanner(System.in).nextLine();
	  }
	  for (i = 0;i < n;i++) //?????p[i]=1,??p[i]=0
	  {
		 if ((a[i][0] >= 'a' && a[i][0] <= 'z') || (a[i][0] >= 'A' && a[i][0] <= 'Z') || (a[i][0] == '_'))
		 {
			 p[i] = 1;
			 for (j = 0;a[i][j] != '\0';j++)
			 {
				 if ((a[i][j] >= 'a' && a[i][j] <= 'z') || (a[i][j] >= 'A' && a[i][j] <= 'Z') || (a[i][j] == '_') || (a[i][j] >= '0' && a[i][j] <= '9'))
				 {
					p[i] = 1;
				 }
				else
				{
					p[i] = 0;
					break;
				}
			 }
		 }
		 else
		 {
			 p[i] = 0;
		 }
	  }
	  for (i = 0;i < n;i++) //??p[i]
	  {
		  System.out.print(p[i]);
		  System.out.print("\n");
	  }
	  return 0; //?????
	}
}

