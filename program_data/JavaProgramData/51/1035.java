package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] count = new int[250];
		int num = 0;
		String line = new String(new char[501]);
		char[][] n_gram = new char[250][5];
		String temp = new String(new char[5]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		line = ConsoleInput.readToWhiteSpace(true).charAt(0);
		count[0] = 1;
		for (i = 0;i < n;i++)
		{
			n_gram[0][i] = line.charAt(i);
		}
		n_gram[0][n] = '\0'; //???????
		for (i = 1;i < line.length() - n + 1;i++)
		{
			for (j = i;j < i + n;j++)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, j - i, line.charAt(j));
			}
			temp = tangible.StringFunctions.changeCharacter(temp, n, '\0'); //?temp??????
			for (j = 0;j <= num;j++)
			{
				if (strcmp(temp,n_gram[j]) == 0)
				{
					count[j]++;
					break;
				}
			} //??????????
			if (j == num + 1)
			{
				n_gram[num + 1] = temp;
				count[num + 1] = 1;
				num++;
			} //?????
		}
		int max = 0;
		for (i = 0;i <= num;i++)
		{
			if (max < count[i])
			{
				max = count[i];
			}
		} //????????
		if (max == 1)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			System.out.print(max);
			System.out.print("\n");
			for (i = 0;i <= num;i++)
			{
				if (count[i] == max)
				{
					System.out.print(n_gram[i]);
					System.out.print("\n");
				}
			}
		} //??1????????MAX???
		return 0;
	}
}

