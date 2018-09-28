import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		char[][] word = new char[500][40];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();

		if (n > 1)
		{
			for (i = 0; i < n - 1; i++)
			{
				cin.getline(word[i], 40, ' ');
			}
		}

		word[n - 1] = new Scanner(System.in).nextLine();

		String p = word;
		int len = String.valueOfp.length();

		System.out.print(p++);

		for (i = 1; i < n; i++)
		{
			len += String.valueOfp.length() + 1;

			if (len > 80)
			{
				System.out.print("\n");
				System.out.print(p);
				len = String.valueOfp.length();
			}
			else
			{
				System.out.print(" ");
				System.out.print(p);
			}

			p = p.Substring(1);
		}

		return 0;
	}





}

