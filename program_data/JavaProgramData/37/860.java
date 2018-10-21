import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int b;
		int min;
		char c;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < t;i++)
		{
			int[] a = new int[26];
			int[] d = new int[26];
			final String ch = "";
			ch = new Scanner(System.in).nextLine();
			j = 0;
			while (ch.charAt(j) != '\0')
			{
				c = ch.charAt(j) - 'a';
				b = c;
				a[b]++;
				if (a[b] == 1)
				{
					d[b] = j;
				}
				j++;
			}
			min = 100000;
			for (j = 0;j < 26;j++)
			{
				if (a[j] == 1 && min > d[j])
				{
					min = d[j];
				}
			}
			if (min != 100000)
			{
				System.out.print(ch.charAt(min));
			}
			else
			{
				System.out.print("no");
			}
			System.out.print("\n");
		}
		return 0;
	}
}

