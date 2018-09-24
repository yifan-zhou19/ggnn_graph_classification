import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		String word = new String(new char[81]);
		int j;
		int i;
		for (i = 1;i <= n; i++)
		{
			word = new Scanner(System.in).nextLine();
			int flag = 0;
			if (word.charAt(0) != '_' && (word.charAt(0) < 'a' || word.charAt(0) > 'z') && (word.charAt(0) < 'A' || word.charAt(0) > 'Z'))
			{
				System.out.print(flag);
				System.out.print("\n");
			}
			else
			{
				for (j = 0; word.charAt(j) != '\0'; j++)
				{
					if (word.charAt(j) == '_' || (word.charAt(j) >= 'a' && word.charAt(j) <= 'z') || (word.charAt(j) >= 'A' && word.charAt(j) <= 'Z') || (word.charAt(j) >= '0' && word.charAt(j) <= '9'))
					{
						continue;
					}
					else
					{

						break;
					}
				}
				if (word.charAt(j) == '\0')
				{
					flag = 1;
				}
				System.out.print(flag);
				System.out.print("\n");
			}
			cin.clear();
		}
		return 0;
	}
}

