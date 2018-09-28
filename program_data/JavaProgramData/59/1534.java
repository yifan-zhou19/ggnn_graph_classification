import java.util.*;

package <missing>;

public class GlobalMembers
{
	//******************************
	//* ????????          ** 
	//* ?????? 1300012948   ** 
	//* ???2013.11.2           ** 
	//******************************
	public static int Main()
	{
		 char[][] str =
		 {
			 {'#', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		 };
		 int n;
		 int m;
		 int count = 0;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 System.in.read(); // ????
		 for (int i = 1; i <= n; i++) // ????????????
		 {
				 str[i] = new Scanner(System.in).nextLine();
		 }
		 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 if (m == 1) // ???????????????????
		 {
			  for (int i = 1; i <= n; i++)
			  {
					  for (int k = 0; k <= n - 1; k++)
					  {
							  if (str[i][k] == '@')
							  {
							  count++;
							  }
					  }
			  }
			  System.out.print(count);
			  System.out.print("\n");
		 }
		 else // ???????????????????????
		 {
			 for (int j = 1; j < m; j++) // ?m????????m - 1?
			 {
					 for (int i = 1; i <= n; i++) // ??n??n?????^???j??????
					 {
							 for (int k = 0; k <= n - 1; k++)
							 {
									 if (str[i][k] == '@')
									 {
											  if (str[i - 1][k] == '.')
											  {
											  str[i - 1][k] = '^';
											  }
											  if (str[i + 1][k] == '.')
											  {
											  str[i + 1][k] = '^';
											  }
											  if (str[i][k + 1] == '.')
											  {
											  str[i][k + 1] = '^';
											  }
											  if (str[i][k - 1] == '.')
											  {
											  str[i][k - 1] = '^';
											  }
									 }
							 }
					 }
					 for (int i = 1; i <= n; i++) // ??n??n?????@???j?????
					 {
							 for (int k = 0; k <= n - 1; k++)
							 {
									 if (str[i][k] == '^')
									 {
									 str[i][k] = '@';
									 }
							 }
					 }
			 }
			 for (int i = 1; i <= n; i++) // ??????????m??????
			 {
					 for (int k = 0; k <= n - 1; k++)
					 {
							 if (str[i][k] == '@')
							 {
							 count++;
							 }
					 }
			 }
			 System.out.print(count);
			 System.out.print("\n");
		 }
		 return 0;
	}
}

