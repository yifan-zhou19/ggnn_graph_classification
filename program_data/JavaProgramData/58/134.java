import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String input = new String(new char[82]);
		int n;
		int len;
		int flag;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int i = 1 ; i <= n ; i++)
		{
			flag = 1;
			input = new Scanner(System.in).nextLine();
			len = input.length();
			if (((input.charAt(0) >= 'a') && (input.charAt(0) <= 'z')) || ((input.charAt(0) >= 'A') && (input.charAt(0) <= 'Z')) || (input.charAt(0) == '_'))
			{
				for (int j = 1 ;j < len ; j++)
				{
				if (((input.charAt(j) >= 'a') && (input.charAt(j) <= 'z')) || ((input.charAt(j) >= 'A') && (input.charAt(j) <= 'Z')) || ((input.charAt(j) >= '0') && (input.charAt(j) <= '9')) || (input.charAt(j) == '_'))
				{
					continue;
				}
				else
				{
					flag = 0;
				}
				}
			}
			else
			{
				flag = 0;
			}
			System.out.print(flag);
			System.out.print("\n");
		}
		return 0;
	}






}

