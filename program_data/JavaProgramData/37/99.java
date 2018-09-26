import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int p = 1;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		String ch = new String(new char[100000]);
		while (p <= t)
		{
			ch = new Scanner(System.in).nextLine();
			int i = 0;
			int flag = 0;
			while (ch.charAt(i) != '\0')
			{
				while (ch.charAt(i) == '0')
				{
					i++;
				}
				int count = 0;
				for (int j = i + 1; ch.charAt(j) != '\0'; j++)
				{

					if (ch.charAt(i) == ch.charAt(j))
					{
						ch = tangible.StringFunctions.changeCharacter(ch, j, '0');
						count++;
					}
				}
					if (count == 0 && ch.charAt(i) >= 'a' && ch.charAt(i) <= 'z')
					{
						System.out.print(ch.charAt(i));
						System.out.print("\n");
						flag = 1;
						break;
					}
				   i++;
				if (flag == 1)
				{
					break;
				}
			}
			if (flag == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
			p++;
		}
		return 0;
	}


}

