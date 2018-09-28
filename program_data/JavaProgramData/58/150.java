import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[81]);
		int n = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int flags = 0;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			flags = 1;
			str = new Scanner(System.in).nextLine();
			k = str.length();
			for (j = 0;j < k;j++)
			{
				if (((int)str.charAt(j) > 'z' || (int)str.charAt(j) < 'a') && ((int)str.charAt(j)>'9' || (int)str.charAt(j) < '0') && ((int)str.charAt(j)>'Z' || (int)str.charAt(j) < 'A') && str.charAt(j) != '_')
				{
					flags = 0;
					break;
				}
			}
			if (flags == 0)
			{
				System.out.print(0);
				System.out.print("\n");
			}
			else if (str.charAt(0) == '0' || str.charAt(0) == '1' || str.charAt(0) == '2' || str.charAt(0) == '3' || str.charAt(0) == '4' || str.charAt(0) == '5' || str.charAt(0) == '6' || str.charAt(0) == '7' || str.charAt(0) == '8' || str.charAt(0) == '9')
			{
				System.out.print(0);
				System.out.print("\n");
			}
			else
			{
				System.out.print(1);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

