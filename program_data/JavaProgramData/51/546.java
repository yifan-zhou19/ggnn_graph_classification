import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sen = new String(new char[501]);
		char[][] gram = new char[500][6];
		int n;
		int[] temp = new int[500];
		int max = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		sen = new Scanner(System.in).nextLine();
		int l = sen.length();
		for (int i = 0; i <= l - n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				gram[i][j] = sen.charAt(i + j);
			}
			gram[i][n] = '\0';
		}
		for (int i = 0; i < l - n; i++)
		{
			if (temp[i] != 0)
			{
				continue;
			}
			temp[i]++;
			for (int j = i + 1; j <= l - n; j++)
			{
				if (temp[j] != 0)
				{
					continue;
				}
				if (strcmp(gram[i], gram[j]))
				{
					continue;
				}
				temp[i]++;
				temp[j]++;
			}
			if (temp[i] > max)
			{
				max = temp[i];
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
			for (int i = 0; i <= l - n; i++)
			{
				if (temp[i] == max)
				{
					System.out.print(gram[i]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

