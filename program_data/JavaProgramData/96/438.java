import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[101]);
		String result = new String(new char[100]);
		int r = 0;
		int i;
		int len;
		int j;
		int temp;
		num = new Scanner(System.in).nextLine();
		len = num.length();
		for (i = 0; i < len; i++)
		{
			temp = (int)num.charAt(i) - 48;
			result = tangible.StringFunctions.changeCharacter(result, i, ((r * 10 + temp) / 13) + 48);
			r = (r * 10 + temp) % 13;
		}
		for (j = 0; j < len; j++)
		{
			if (result.charAt(j) != '0')
			{
				break;
			}
		}
		if (j == len)
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(r);
		}
		else
		{
			for (j; j < len; j++)
			{
				System.out.print(result.charAt(j));
			}
			System.out.print("\n");
			System.out.print(r);
		}
		return 0;
	}
}

