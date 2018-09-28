import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[81]);
		int i;
		int n;
		int flag;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1; i <= n; i++)
		{
			flag = 0;
			str = new Scanner(System.in).nextLine();
			if ((str.charAt(0) >= 'a' && str.charAt(0) <= 'z') || (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') || str.charAt(0) == '_')
			{
				flag = 1;
			}
			for (j = 1; str.charAt(j) != '\0'; j++)
			{
				if (!((str.charAt(j) >= 'a' && str.charAt(j) <= 'z') || (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') || str.charAt(j) == '_' || (str.charAt(j) >= '0' && str.charAt(j) <= '9')))
				{
					flag = 0;
				}
			}
			System.out.print(flag);
			System.out.print("\n");
		}
		return 0;
	}



}

