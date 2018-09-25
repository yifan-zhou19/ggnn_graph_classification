import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String ch = "";
		int num = 0;
		int length = 0;
		int i;
		int k = 0;
		char result;
		ch = new Scanner(System.in).nextLine(); //?????
		for (i = 0;i < 1000;i++)
		{
			if (ch.charAt(i) != '\0')
			{
				num++; //?????
			}
		}
		if (num == 1)
		{
			if ((ch.charAt(0) >= 'A') && (ch.charAt(0) <= 'Z'))
			{
				k = ch.charAt(0) - 'A';
			}
			else
			{
				k = ch.charAt(0) - 'a';
			}
			result = 'A' + k;
			System.out.print("(");
			System.out.print(result);
			System.out.print(",");
			System.out.print("1");
			System.out.print(")");
		}
		else
		{
			for (i = 0;i < num - 2;i++)
			{
				if ((ch.charAt(i) == ch.charAt(i + 1)) || (ch.charAt(i + 1) - ch.charAt(i) == 32) || (ch.charAt(i) - ch.charAt(i + 1) == 32)) //????????????????????
				{
					length++;
				}
				else //????????????
				{
					length++;
					if ((ch.charAt(i) >= 'A') && (ch.charAt(i) <= 'Z'))
					{
						k = ch.charAt(i) - 'A';
					}
					else
					{
						k = ch.charAt(i) - 'a';
					}
					result = 'A' + k;
					System.out.print("(");
					System.out.print(result);
					System.out.print(",");
					System.out.print(length);
					System.out.print(")");
					length = 0;
					k = 0;
					result = '\0';
				}
			}
			if ((ch.charAt(num - 2) == ch.charAt(num - 1)) || (ch.charAt(num - 2) - ch.charAt(num - 1) == 32) || (ch.charAt(num - 1) - ch.charAt(num - 2) == 32))
			{
				length = length + 2;
				if ((ch.charAt(num - 1) >= 'A') && (ch.charAt(num - 1) <= 'Z'))
				{
					k = ch.charAt(num - 1) - 'A';
				}
				else
				{
					k = ch.charAt(num - 1) - 'a';
				}
				result = 'A' + k;
				System.out.print("(");
				System.out.print(result);
				System.out.print(",");
				System.out.print(length);
				System.out.print(")");
			}
			else
			{
				length++;
				if ((ch.charAt(num - 2) >= 'A') && (ch.charAt(num - 2) <= 'Z'))
				{
					k = ch.charAt(num - 2) - 'A';
				}
				else
				{
					k = ch.charAt(num - 2) - 'a';
				}
				result = 'A' + k;
				System.out.print("(");
				System.out.print(result);
				System.out.print(",");
				System.out.print(length);
				System.out.print(")");
				if ((ch.charAt(num - 1) >= 'A') && (ch.charAt(num - 1) <= 'Z'))
				{
					k = ch.charAt(num - 1) - 'A';
				}
				else
				{
					k = ch.charAt(num - 1) - 'a';
				}
				result = 'A' + k;
				System.out.print("(");
				System.out.print(result);
				System.out.print(",");
				System.out.print("1");
				System.out.print(")");
			}
		}
		return 0;
	}
}
