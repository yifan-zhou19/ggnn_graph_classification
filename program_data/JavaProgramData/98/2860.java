import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100000]);
		int n;
		int i;
		int j;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) != ' ')
			{
				System.out.print(a.charAt(i));
				count++;
			}
			if (a.charAt(i) == ' ')
			{
				for (j = i + 1;a.charAt(j) != '\0';j++)
				{
					if (a.charAt(j) == ' ')
					{
						break;
					}
				}
				if ((count - 1) / 80 == (count + j - i - 1) / 80)
				{
					System.out.print(a.charAt(i));
					count++;
				}
				else
				{
					System.out.print("\n");
					count = 0;
				}
			}
		}
		return 0;
	}
}

