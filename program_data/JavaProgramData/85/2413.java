import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int i = 0;i < n;i++)
		{
			String str = new String(new char[80]);
			str = new Scanner(System.in).nextLine();
			int j = 0;
				if (!((str.charAt(0) >= 'a' && str.charAt(0) <= 'z') || (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') || str.charAt(0) == '_'))
				{
				System.out.print("no");
				System.out.print("\n");
				}
				else
				{
			for (j = 1;str.charAt(j) != '\0';j++)
			{
				if (!((str.charAt(j) >= 'a' && str.charAt(j) <= 'z') || (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') || (str.charAt(j) >= '0' && str.charAt(j) <= '9') || str.charAt(j) == '_'))
				{
				System.out.print("no");
				System.out.print("\n");
				break;
				}
			}
			if (str.charAt(j) == '\0')
			{
			System.out.print("yes");
			System.out.print("\n");
			}
				}
		}

		return 0;
	}



}

