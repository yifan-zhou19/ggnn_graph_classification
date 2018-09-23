import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k = 0;
		int m = 0;
		String s = new String(new char[1000]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		char[][] word = new char[30][101];
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0; s.charAt(i) != '\0'; i++)
		{
			if (s.charAt(i) != ' ')
			{
				word[k][m] = s.charAt(i);
				m++;
			}
			else
			{
				word[k][m] = '\0';
				k++;
				m = 0;
			}
		}
		for (i = 0; i <= k; i++)
		{
			if (strcmp(word[i], a) == 0)
			{
				word[i] = b;
			}
		}
		for (i = 0; i < k; i++)
		{
			System.out.print(word[i]);
			System.out.print(' ');
		}
		System.out.print(word[k]);
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}
}

