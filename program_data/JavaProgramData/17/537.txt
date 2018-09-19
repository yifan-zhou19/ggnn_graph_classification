import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String line = new String(new char[101]);
		int length;
		int i;
		int j;
		while (line = new Scanner(System.in).nextLine())
		{
			length = line.length();
			for (i = 0; i < length; i++)
			{
				System.out.print(line.charAt(i));
			}
			System.out.print("\n");
			for (i = 0; i < length; i++)
			{
				if (line.charAt(i) == ')')
				{
					for (j = i; j >= 0; j--)
					{
						if (line.charAt(j) == '(')
						{
							line = line.substring(0, i);
							line = line.substring(0, j);
							break;
						}
					}
				}
			}
			for (i = 0; i < length; i++)
			{
				if (line.charAt(i) == '(')
				{
					System.out.print("$");
				}
				if (line.charAt(i) != '(' && line.charAt(i) != ')')
				{
					System.out.print(" ");
				}
				if (line.charAt(i) == ')')
				{
					System.out.print("?");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}
