package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String data = new String(new char[505]);
		char[][] substr = new char[505][n + 1];
		data = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = data.length();
		for (i = 0; i <= len - n; i++)
		{
			for (j = 0; j < n; j++)
			{
				substr[k][j] = data.charAt(i + j);
			}
			substr[k][n] = '\0';
			k++;
		}

		int[] count = new int[len - n + 1];
		for (i = 0; i <= len - n; i++)
		{
			count[i] = 0;
		}

		for (i = 0; i <= len - n; i++)
		{
			for (j = i; j <= len - n; j++)
			{
				if (strcmp(substr[i],substr[j]) == 0)
				{
					count[i]++;
				}
			}
		}

		int max = count[0];
		for (i = 0; i <= len - n; i++)
		{
			if (count[i] > max)
			{
				max = count[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		}
		System.out.print(max);
		System.out.print("\n");
		for (i = 0; i <= len - n; i++)
		{
			if (count[i] == max)
			{
				System.out.print(substr[i]);
				System.out.print("\n");
			}
		}

		return 0;
	}

}

