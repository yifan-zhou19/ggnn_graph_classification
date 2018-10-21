import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void check_palin(String str, int begin, int end)
	{
		int i;
		int palin = 1;
		for (i = begin; i <= end; i++)
		{
			if (!str[i].equals(str[begin + end - i]))
			{
				palin = 0;
			}
		}

		if (palin != 0)
		{
			for (i = begin; i <= end; i++)
			{
				System.out.print(str[i]);
			}
			System.out.print("\n");
		}
	}

	public static int Main()
	{
		String str = new String(new char[500 + 10]);
		int i;
		int j;
		int k;
		str = new Scanner(System.in).nextLine();
		for (j = 2; j <= str.length(); j++)
		{
			for (i = 0; i < str.length(); i++)
			{
				check_palin(str, i, i + j - 1);
			}
		}
		return 0;
	}
}
