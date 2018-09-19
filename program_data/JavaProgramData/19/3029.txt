import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String A = new String(new char[100]); //??????A?????`B???????`T???????,C??A????
		String B = new String(new char[100]);
		String T = new String(new char[100]);
		char[][] C = new char[100][100];
		int i; //??????i`j,????a`l
		int j = 0;
		int a = 0;
		A = new Scanner(System.in).nextLine(); //?????????????
		B = new Scanner(System.in).nextLine();
		T = new Scanner(System.in).nextLine();
		for (i = 0;i < A.length();i++)
		{
			if (A.charAt(i) != ' ')
			{
			   C[j][a] = A.charAt(i);
			   a = a + 1;
			}
			else
			{
			   a = 0;
			   j = j + 1;
			}
		}
		for (i = 0;i <= j;i++)
		{
			if (strcmp(C[i],B) == 0) //?????????A????
			{
			   C[i] = T; //??
			}
		}
		for (i = 0;i < j;i++) //?????
		{
			System.out.print(C[i]);
			System.out.print(" ");
		}
		System.out.print(C[j]);
		return 0;
	}
}
