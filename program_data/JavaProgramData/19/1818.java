import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int lenth1;
		int lenthw1;
		int lenthw2;
		int i;
		int j;
		int num = 0;
		int row = 0;
		int flag;
		int[] a = new int[101];
		String s1 = new String(new char[101]);
		String word = new String(new char[101]);
		String wordnew = new String(new char[101]);
		char[][] olds1 = new char[101][101];
		s1 = new Scanner(System.in).nextLine();
		word = ConsoleInput.readToWhiteSpace(true).charAt(0);
		wordnew = ConsoleInput.readToWhiteSpace(true).charAt(0);
		lenth1 = s1.length();
		lenthw1 = word.length();
		lenthw2 = wordnew.length();
		for (i = 0;i < lenth1;i++)
		{
			if (s1.charAt(i) == ' ')
			{
					num++;
				 row = 0;
			}
			 else
			 {
				  olds1[num][row] = s1.charAt(i);
			   a[num] = row;
			   row++;
			 }
		}
		for (i = 0;i <= num;i++)
		{
			   flag = 1;
			 for (j = 0;j < lenthw1;j++)
			 {
				 if (olds1[i][j] != word.charAt(j))
				 {
					 flag = 0;
				 }
			 }
			 if (flag == 1)
			 {
				   a[i] = lenthw2 - 1;
				 for (j = 0;j < lenthw2;j++)
				 {
					 olds1[i][j] = wordnew.charAt(j);
				 }
			 }
		}
		for (i = 0;i < num;i++)
		{
			 for (j = 0;j <= a[i];j++)
			 {
		  System.out.print(olds1[i][j]);
			 }
			 System.out.print(" ");
		}
		for (j = 0;j <= a[num];j++)
		{
		 System.out.print(olds1[num][j]);
		}
		 return 0;
	}
}

