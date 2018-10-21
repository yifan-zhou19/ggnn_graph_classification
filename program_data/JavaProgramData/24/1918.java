package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int flu;
		int max_len = 0;
		int min_len = 100;
		int max_num;
		int min_num;
		String ch = new String(new char[20000]);
		char[][] str = new char[200][100];
		ch = new Scanner(System.in).nextLine();
		for (i = j = k = flu = 0;i < ch.length();i++)
		{
			if (ch.charAt(i) != ' ' && ch.charAt(i) != ',')
			{
				flu = 1;
				str[k][j++] = ch.charAt(i);
			}
			else if (flu == 1)
			{
				str[k++][j] = '\0';
				j = flu = 0;
			}
		}
		if (flu == 1)
		{
			str[k++][j] = '\0';
		}
		for (i = 0;i < k;i++)
		{
			if (max_len < String.valueOf(str[i]).length())
			{
				max_len = String.valueOf(str[i]).length();
				max_num = i;
			}
			if (min_len > String.valueOf(str[i]).length())
			{
				min_len = String.valueOf(str[i]).length();
				min_num = i;
			}
		}
		System.out.printf("%s\n",str[max_num]);
		System.out.printf("%s\n",str[min_num]);
	}
}
