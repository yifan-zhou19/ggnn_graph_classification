import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] res = new int[102];
		int[] chan = new int[102];
		int len;
		int i;
		int j;
		int n;
		int k;
		String c = new String(new char[102]);
		c = new Scanner(System.in).nextLine();
		len = c.length();
		for (i = 0;i < len;i++)
		{
			chan[i] = c.charAt(i) - '0';
		}
		for (i = 1;i < len;i++)
		{
			chan[i] += 10 * chan[i - 1];
			if (chan[i] >= 13)
			{
				res[i] = chan[i] / 13;
				chan[i] = chan[i] % 13;
			}
		}
		i = 0;
		while (res[i] == 0)
		{
			i++;
		}
			if (len - i >= 1)
			{
				for (;i < len;i++)
				{
			System.out.print(res[i]);
				}
			}
		else
		{
			System.out.print('0');
		}
		System.out.print("\n");
		System.out.print(chan[len - 1]);
		return 0;
	}
}
