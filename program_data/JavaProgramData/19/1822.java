import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]); //????????
		int i = 0;
		int count = 0;
		int j = 0;
		char[][] str = new char[100][100]; //???????????????
		String word1 = new String(new char[100]); //?????????????
		String word2 = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < 100;i++) //???????????????????
		{
			if (s.charAt(i) != ' ')
			{
				str[count][j] = s.charAt(i);
				j++;
			}
			else if (s.charAt(i) == ' ')
			{
				str[count][j + 1] = '\0';
				count++;
				j = 0;
				continue;
			}
			else if (s.charAt(i) == '\0')
			{
				break;
			}
		}
		word1 = new Scanner(System.in).nextLine();
		word2 = new Scanner(System.in).nextLine();
		for (i = 0;i <= count;i++) //????????????????????????
		{
			if (strcmp(str[i],word1) == 0)
			{
				str[i] = word2;
			}
		}
		System.out.print(str[0]);
		for (i = 1;i <= count;i++)
		{
			System.out.print(' ');
			System.out.print(str[i]);
		}
		return 0;
	}
}
