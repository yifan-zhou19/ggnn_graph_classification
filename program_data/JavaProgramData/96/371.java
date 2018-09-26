import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	?????13
	?????? 1100012895
	???2011-11-2
	**/


	public static int Main()
	{
		String num = new String(new char[100]); // ???????????
		int[] result = new int[100]; // ????????

		// ???????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,'0',100);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(result,0,100);

		int yushu = 0; // yushu??????????,len???????,i?j?????
		int len;
		int i = 0;
		int j = 0;

		num = new Scanner(System.in).nextLine();
		len = num.length();

		// ?????????,?????,?????????
		if (len == 1)
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(num.charAt(0));
			System.out.print("\n");
		}

		else
		{

			yushu = num.charAt(0) - '0';

			for (i = 0; i <= len - 2; i++)
			{
				result[i] = (yushu * 10 + num.charAt(i + 1) - '0') / 13;
				yushu = (yushu * 10 + num.charAt(i + 1) - '0') % 13;
			}

			if ((result[0] == 0) && len > 2)
			{
				j = 1;
			}

			for (j; j < i; j++)
			{
				System.out.print(result[j]);
			}
			System.out.print("\n");
			System.out.print(yushu);
			System.out.print("\n");
		}

		return 0;
	}
}
