import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		int count;
		String word = new String(new char[81]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0; i < n; i++)
		{
			word = new Scanner(System.in).nextLine();
			len = word.length();
			if (word.charAt(0) == '_' || (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') || (word.charAt(0) >= 'a' && word.charAt(0) <= 'z'))
			{
				count = 1;
				for (j = 1; j < len; j++)
				{

					if (word.charAt(j) == '_' || (word.charAt(j) >= 'A' && word.charAt(j) <= 'Z') || (word.charAt(j) >= 'a' && word.charAt(j) <= 'z') || (word.charAt(j) <= '9' && word.charAt(j) >= '0'))
					{
					count++;
					}
				}
				if (count == len)
				{
					System.out.print(1);
					System.out.print("\n");
				}
				else
				{
					System.out.print(0);
					System.out.print("\n");
				}
			}
			else
			{
				System.out.print(0);
				System.out.print("\n");
			}
			cin.clear();
		}
		return 0;
	}






}

