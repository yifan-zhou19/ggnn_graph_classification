package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[50 * 100]);
		char[][] word = new char[50][100];
		int i;
		int j;
		int k;
		int max;
		int min;
		int max1 = 0;
		int min1 = 0;

		str = new Scanner(System.in).nextLine();

		for (i = 0,k = 0,j = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) == ' ')
			{
				word[k][j] = '\0';
				k++;
				j = 0;
				continue;
			}
			word[k][j] = str.charAt(i);
			j++;
		}
		word[k][j] = '\0';

		max = (int)String.valueOf(word[0]).length();
		min = (int)String.valueOf(word[0]).length();

		for (i = 0;i <= k;i++)
		{
			if (max < (int)String.valueOf(word[i]).length())
			{
				max = (int)String.valueOf(word[i]).length();
				max1 = i;
			}
			if (min > (int)String.valueOf(word[i]).length())
			{
				min = (int)String.valueOf(word[i]).length();
				min1 = i;
			}
		}

		System.out.printf("%s\n",word[max1]);
		System.out.printf("%s\n",word[min1]);

		return 0;
	}

}
