import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		String word = new String(new char[100]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i <= n ; i++)
		{
			word = new Scanner(System.in).nextLine();
			len = word.length();
			for (int j = 0 ; j <= len - 1 ; j++)
			{
				if ((word.charAt(j) != '_') && (word.charAt(j) < 65 || word.charAt(j) > 122 || (word.charAt(j) > 90 && word.charAt(j) < 97)) && (word.charAt(j) < '0' || word.charAt(j) > '9'))
				{
					System.out.print(0);
					System.out.print("\n");
					break;
				}
				if (word.charAt(0) != '_' && (word.charAt(0) < 65 || word.charAt(0) > 122))
				{
					System.out.print(0);
					System.out.print("\n");
					break;
				}
				if (word.charAt(j) == ' ')
				{
					System.out.print(0);
					System.out.print("\n");
					break;
				}
				if (j == len - 1)
				{
					System.out.print(1);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

