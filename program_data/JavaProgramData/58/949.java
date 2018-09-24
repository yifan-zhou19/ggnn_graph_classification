import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int f(String word)
	{
		int i;
		int signal = 1;

			for (i = 0;word[i] != null;i++)
			{
				if ((word[i].equals('_')) || (word[i].compareTo('Z') <= 0 && word[i].compareTo('A') >= 0) || (word[i].compareTo('a') >= 0 && word[i].compareTo('z') <= 0) || (word[i].compareTo('0') >= 0 && word[i].compareTo('9') <= 0 && i>0))
				{
					continue;
				}
				else
				{
					signal = 0;
					break;
				}
			}
			if (signal == 1)
			{
				return 1;
			}
			else
			{
				return 0;
			}

	}

	public static int Main()
	{
		String word = new String(new char[81]);
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n + 1;i++)
		{
			word = new Scanner(System.in).nextLine();
			if (i != 0)
			{
				System.out.print(f(word));
				System.out.print("\n");
			}
		}
		return 0;
	}
}

