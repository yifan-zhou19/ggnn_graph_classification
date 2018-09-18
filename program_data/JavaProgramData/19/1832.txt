import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		char[][] word = new char[100][100];
		int len = s.length(); //???????
		int i;
		int j = 0;
		int n = 0;
		int flag = 0;
		for (i = 0;s.charAt(i) != '\0';i++) //?????s????????
		{
			if (s.charAt(i) == ' ')
			{
				flag = 0;
			}
			else if (flag == 0)
			{
				flag = 1;
				n++;
			}
		}
		int count = 0;
		int[] count1 = new int[100];
		for (i = 0;i < n;i++)
		{
			count1[i] = 0;
			do
			{
				word[i][j - count] = s.charAt(j);
			  count1[i]++;
			  j++;
			}while (s.charAt(j) != ' ' && s.charAt(j) != '\0');
			count1[i]++;
			word[i][j - count] = '\0';
			j++;
			count = count + count1[i];
		}
		for (i = 0;i < n;i++) //????
		{
			if (strcmp(word[i],a) == 0)
			{
				word[i] = b;
			}
		}
		for (i = 0;i < n - 1;i++) //?????????
		{
			System.out.print(word[i]);
			System.out.print(" ");
		}
		System.out.print(word[n - 1]);
		System.out.print("\n");
		return 0;
	}


}
