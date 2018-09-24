import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		int i;
		int j;
		int[] a = new int[555];
		int max = -1;
		String ch = new String(new char[555]);
		char[][] ch1 = new char[555][5];
		for (i = 0; i < 555; i++)
		{
			a[i] = 1;
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		ch = new Scanner(System.in).nextLine();
		len = ch.length();
		for (i = 0; i < 555; i++)
		{
			for (j = 0; j < 4; j++)
			{
				ch1[i][j] = '#';
			}
			ch1[i][4] = 0;
		}
		for (i = 0; i < len - n + 1; i++)
		{
			for (j = i; j < i + n; j++)
			{
				ch1[i][j - i] = ch.charAt(j);
			}
		}
		for (i = 0; i < len - n + 1; i++)
		{
			for (j = i + 1; j < len - n + 1; j++)
			{
				if (strcmp(ch1[i], ch1[j]) == 0)
				{
					a[i]++;
				}
			}
		}
		for (i = 0; i < len - n + 1; i++)
		{
			if (max < a[i])
			{
				max = a[i];
			}
		}
		for (i = 0; i < len - n + 1; i++)
		{
			if (max < a[i])
			{
				max = a[i];
			}
		}
		if (max > 1)
		{
			System.out.print(max);
			System.out.print("\n");
			for (i = 0; i < len - n + 1; i++)
			{
				if (a[i] == max)
				{
					for (j = 0; j < n - 1; j++)
					{
						System.out.print(ch1[i][j]);
					}
					if (j == n - 1)
					{
						System.out.print(ch1[i][j]);
						System.out.print("\n");
					}
				}

			}
		}
		else
		{
			System.out.print("NO");
		}

		return 0;
	}
}

