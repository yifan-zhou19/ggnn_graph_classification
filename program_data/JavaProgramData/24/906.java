package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String letter = new String(new char[1000]);
		char[][] word = new char[50][20];
		letter = new Scanner(System.in).nextLine();
		int length;
		int i;
		int j = 0;
		int k = 0;
		int tmp1;
		int tmp2;
		int tmp;
		int maxlength = 0;
		int minlength = 0;
		length = letter.length();

		for (i = 0;i < length;i++)
		{
			if (letter.charAt(i) != ' ')
			{
				word[j][k] = letter.charAt(i);
				k++;
			}
			if (letter.charAt(i) == ' ')
			{
				word[j][k] = '\0';
				j++;
				k = 0;

			}
			if (i == length - 1)
			{
				word[j][k] = '\0';
			}

		}


		tmp1 = String.valueOf(word[0]).length();
		tmp2 = String.valueOf(word[0]).length();

		for (i = 1;i <= j;i++)
		{
			tmp = String.valueOf(word[i]).length();
			if (tmp1 < tmp)
			{
				tmp1 = tmp;
				maxlength = i;
			}
			if (tmp2 > tmp)
			{
				tmp2 = tmp;
				minlength = i;
			}


		}
		System.out.printf("%s\n",word[maxlength]);
		System.out.printf("%s\n",word[minlength]);



			return 0;
	}

}
