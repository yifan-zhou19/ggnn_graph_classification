import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			 char[][] c = new char[110][110]; //????????110*110?????????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			 memset(c, 0, (Character.SIZE / Byte.SIZE)); //?????c
			 int n; //n?n*n????day??day?,sum???????
			 int day;
			 int sum = 0;
			 int k = 0; //k???????
			 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 System.in.read(); //???????
			 for (int i = 1; i <= n; i++)
			 {
				 c[i] + 1 = new Scanner(System.in).nextLine(); //?i???1?????n??????'\0',???h+1
			 }
			 day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 while (k < day)
			 {
				 sum = 0;
				 for (int i = 1; i <= n; i++)
				 {
						 for (int j = 1; j <= n; j++)
						 {
								 if (c[i][j] == '@')
								 {
							sum++;
								 }
								 if (c[i][j] == '.' && (c[i][j + 1] == '@' || c[i][j - 1] == '@' || c[i + 1][j] == '@' || c[i - 1][j] == '@'))
								 {
									 c[i][j] = 'N'; //??????????????????????
								 }
						 }
				 }
				 for (int i = 1; i <= n; i++)
				 {
					 for (int j = 1; j <= n; j++)
					 {
						 if (c[i][j] == 'N')
						 {
							 c[i][j] = '@';
						 }
					 }
				 }
				 k++;
			 }
			 System.out.print(sum);
			 System.out.print("\n");
			 return 0;
	}
}

