import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String str1 = new String(new char[200]);
	   char[][] str2 = new char[100][20];
	   str1 = new Scanner(System.in).nextLine();
	   int le;
	   int i;
	   int j;
	   int k = 0;
	   le = str1.length();
	   for (i = 0;i <= le-1;i++)
	   {
		   if (i == 0 || (str1.charAt(i - 1) == ' ' && str1.charAt(i) != ' '))
		   {
					 for (j = 0;j <= 19;j++)
					 {
						 if (str1.charAt(i + j) != ' ' && str1.charAt(i + j) != '\0')
						 {
							 str2[k][j] = str1.charAt(i + j);
						 }
						 else
						 {
							 str2[k][j] = '\0';
							 k = k + 1;
							 break;
						 }

					 }
		   }
	   }
	   System.out.print(str2[0]);
	   for (i = 1;i <= k - 1;i++)
	   {
		   System.out.print(" ");
		   System.out.print(str2[i]);
	   }
	   return 0;
	}

}
