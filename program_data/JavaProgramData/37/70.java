import java.util.*;

package <missing>;

public class GlobalMembers
{
	/**
	 * @file ?????????????
	 * @author ???
	 * @date 11-17
	 * @description ????????�??�
	 */
	public static int Main()
	{
		int n;
		int[] a = new int[27];
		int[] b = new int[27];
		int i;
		int j;
		int k;
		int len;
		int flag;
		int m;
		String ch = new String(new char[100001]);
		char c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1; i <= n; i++)
		{
			ch = new Scanner(System.in).nextLine();
			len = ch.length();
			k = 0;
			flag = 1;
			for (j = 0; j <= 26; j++)
			{
				a[j] = 0;
				b[j] = 0;
			}
			for (j = 0; j < len; j++)
			{
				m = ch.charAt(j) - 96;
				a[m]++;
				if (a[m] == 1)
				{
					k++;
					b[k] = m;
				}
			}
			for (j = 1; j <= k; j++)
			{
				if (a[b[j]] == 1)
				{
					c = 'a' + b[j] - 1;
					System.out.print(c);
					System.out.print("\n");
					flag = 0;
					break;
				}
			}
			if (flag == 1)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}




}

