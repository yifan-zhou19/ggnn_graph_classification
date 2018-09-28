import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[105]);
		int len;
		int[] answer = new int[105];
		int r = 0;

		num = new Scanner(System.in).nextLine();
		len = num.length();

		int i;

		for (i = 0;i < len;i++)
		{
			r = r * 10 + num.charAt(i) - '0';
			answer[i] = r / 13;
			r = r % 13;
		}

		i = 0;
		while (answer[i] == 0)
		{
			i++;
		}
		for (;i < len;i++)
		{
			System.out.print(answer[i]);
		}

		if (i > len + 1)
		{
			System.out.print('0');
		}

		System.out.print("\n");
		System.out.print(r);

		return 0;
	}
}
