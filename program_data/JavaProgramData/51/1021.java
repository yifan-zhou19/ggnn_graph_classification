import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static final int len = 201;
	public static int Main()
	{
		int len;
		int i;
		int j;
		int n = 0;
		int[] num = new int[10000];
		int max = 0;
		char[][] c = new char[10000][6];
		String input = new String(new char[600]);
		len = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		input = new Scanner(System.in).nextLine();
		for (i = 0;i <= input.length() - len;i++)
		{
			String temp = new String(new char[6]);
				for (j = 0;j < len;j++)
				{
				c[n][j] = input.charAt(i + j);
				}
			c[n][len] = '\0';
			n++;
		}
		for (i = 0;i < n;i++)
		{
			num[i] = 1;
		}
		for (i = 0;i < n;i++)
		{
			for (j = i;j < n;j++)
			{
				if (strcmp(c[i],c[j]) == 0 && num[i] > 0)
				{
					num[i]++;
					num[j]--;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (num[i] > max)
			{
				max = num[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			System.out.print(max);
			System.out.print("\n");
			for (i = 0;i < n;i++)
			{
				if (num[i] == max)
				{
					System.out.print(c[i]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

