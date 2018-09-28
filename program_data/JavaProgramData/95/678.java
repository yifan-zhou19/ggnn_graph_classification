import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  char[][] s = new char[2][80];
		  for (int i = 0;i < 2;i++)
		  {
			s[i] = new Scanner(System.in).nextLine();
		  }
		  for (int j = 0;j < 2;j++)
		  {
				 int i = 0;
			while (s[j][i] != '\0')
			{
				if ((s[j][i] >= 'A') && (s[j][i] <= 'Z'))
				{
									s[j][i] = s[j][i] + 32;
				}
								   i++;
			}
		  }
		  int k = 0;
		  k = strcmp(s[0],s[1]);
		  if (k > 0)
		  {
			  System.out.print(">");
			  System.out.print("\n");
		  }
		  else if (k == 0)
		  {
			  System.out.print("=");
			  System.out.print("\n");
		  }
		  else
		  {
			  System.out.print("<");
			  System.out.print("\n");
		  }
		  return 0;


	}








}
