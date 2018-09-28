import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[15000]);
		char[][] word = new char[300][50];
		s = new Scanner(System.in).nextLine();

		int i = 0;
		int j = 0;
		int k = 0;
		int num = 0;

		int len = s.length();
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) == ' ')
			{
				num++;
			}
		}

		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) != ' ')
			{
				word[j][k] = s.charAt(i);
				k++;
			}
			else if (s.charAt(i) == ' ')
			{
				j++;
				k = 0;
			}
		}
		System.out.print(word[num]);
		for (i = num - 1;i >= 0;i--)
		{
			System.out.print(" ");
			System.out.print(word[i]);
		}
	}


}
