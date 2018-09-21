import java.util.*;

package <missing>;

public class GlobalMembers
{
	//dancidaopai
	public static int Main()
	{
		String shuru = new String(new char[400]);
		char[][] word = new char[20][20];
		shuru = new Scanner(System.in).nextLine();
			  int i = 0;
			  int j = 0;
			  int k = 0;
			  int flag = 0;
			  for (i = 0;shuru.charAt(i) != '\0';i++)
			  {
				  if (shuru.charAt(i) != ' ')
				  {
					  word[j][k] = shuru.charAt(i);
					  k = k + 1;
					  flag = 0;
				  }
				  else if ((shuru.charAt(i) == ' ') && (flag == 0))
				  {
					   word[j][k] = 0;
					   k = 0;
					   j = j + 1;
					   flag = flag + 1;
				  }
				  else
				  {
						flag = flag + 1;
				  }
			  }
			  word[j][k] = 0;
			  for (k = j;k > 0;k--)
			  {
							  if (word[k] != '\0')
							  {
							  System.out.print(word[k]);
							  System.out.print(" ");
							  }
			  }
			  System.out.print(word[0]);
			  return 0;
	}

}
