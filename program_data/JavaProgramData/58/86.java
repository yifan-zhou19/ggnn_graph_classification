import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		while (n - .0.getValue() != 0)
		{
			String str = new String(new char[100]);
			int i = 0;
			int sum = 0;
			int h;
			str = new Scanner(System.in).nextLine();
			h = str.length();
			for (i = 1;i < h;i++)
			{
				if (((str.charAt(i) >= '0') && (str.charAt(i) <= '9')) || ((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z')) || ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z')) || (str.charAt(i) == '_'))
				{
					sum = sum + 1;
				}
			}
			if (((str.charAt(0) >= 'A') && (str.charAt(0) <= 'Z')) || ((str.charAt(0) >= 'a') && (str.charAt(0) <= 'z')) || (str.charAt(0) == '_'))
			{
				sum = sum + 1;
			}
			if (sum == h)
			{
				System.out.print("1");
				System.out.print("\n");
			}
			if (sum != h)
			{
				System.out.print("0");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

