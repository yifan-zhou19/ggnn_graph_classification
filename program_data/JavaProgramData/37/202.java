import java.util.*;

package <missing>;

public class GlobalMembers
{
	// ??????.cpp : Defines the entry point for the console application.
	//


	public static int Main()
	{

		int i = 0;
		int t = 0;
		int m = 0;
		int len = 0;

		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cin.ignore();

		for (;t > 0;t--)
		{
			int[] num = new int[26];
			String zifu = new String(new char[100001]);
			int sum = 0;
			zifu = new Scanner(System.in).nextLine();

			len = zifu.length();

			for (i = 0;i <= len - 1;i++)
			{
				num[zifu.charAt(i) - 'a']++;
			}

			for (i = 0;i <= len - 1;i++)
			{
				if (num[zifu.charAt(i) - 'a'] == 1)
				{
					sum = 1;
					break;
				}
			}

			if (sum == 1)
			{
				System.out.print(zifu.charAt(i));
				System.out.print("\n");
			}
			else
			{
				System.out.print("no");
				System.out.print("\n");
			}

		}

		return 0;
	}

}

