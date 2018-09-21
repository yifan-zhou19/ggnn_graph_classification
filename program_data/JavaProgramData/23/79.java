package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String string = new String(new char[100]);
		char[][] ch = new char[100][100];
		int[] length = new int[100];
		String = new Scanner(System.in).nextLine();
		int L = String.length();
		int i;
		int j = 0;
		int k = 0;
		int sum;
		for (i = 0;i < L;i++)
		{
				if (String[i] == ' ')
				{
					j++;
					length[j]++;
					k = 0;
					ch[j][k] = ' ';
					k++;

				}

				if (String[i] != ' ')
				{
					length[j]++;
					ch[j][k] = string.charAt(i);
					k++;

				}

		}
		sum = j;
		if (sum != 0)
		{
		for (k = 1;k < length[sum];k++)
		{
			System.out.printf("%c",ch[sum][k]);
		}
		}

		for (j = sum - 1;j >= 1;j--)
		{
			for (k = 0;k < length[j];k++)
			{
				System.out.printf("%c",ch[j][k]);
			}
		}
		if (sum != 0)
		{
		System.out.print(" ");
		}
		for (k = 0;k < length[0];k++)
		{
			System.out.printf("%c",ch[0][k]);
		}


	}




}
