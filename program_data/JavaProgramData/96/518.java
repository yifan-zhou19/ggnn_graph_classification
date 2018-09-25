import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int len;
		int i;
		int[] b = new int[1000];
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0; i < len; i++)
		{
			b[i] = a.charAt(i) - '0'; //????????????
		}
		for (i = 0; i < len; i++)
		{
			b[i + 1] = b[i] % 13 * 10 + b[i + 1];
			b[i] = b[i] / 13;
		}
		i = 0;
		while (true)
		{
			if (b[i] != 0)
			{
				break;
			}
			i++;
		}
		if (i == len) //????0?
		{
			System.out.print('0');
			System.out.print("\n");
		}
		else
		{
		for (; i < len; i++)
		{
			System.out.print(b[i]);
		}
			System.out.print("\n");
		}
		System.out.print(b[i] / 10);
		return 0;
	}
}
