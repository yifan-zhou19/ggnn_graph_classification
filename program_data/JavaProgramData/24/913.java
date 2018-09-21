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
		String max = new String(new char[100]);
		String min = new String(new char[100]);

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

		max = word[0];
		min = word[0];

		for (i = 0;i <= k;i++)
		{
			if ((int)max.length() < (int)String.valueOf(word[i]).length())
			{
				max = word[i];
			}
			if ((int)min.length() > (int)String.valueOf(word[i]).length())
			{
				min = word[i];
			}
		}

		System.out.printf("%s\n",max);
		System.out.printf("%s\n",min);

		return 0;
	}
}
