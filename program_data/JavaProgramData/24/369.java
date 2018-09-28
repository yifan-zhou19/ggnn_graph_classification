package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int index;
		int max;
		int min;
		String juzi = new String(new char[2500]);
		char[][] word = new char[50][50];
		juzi = new Scanner(System.in).nextLine();
		index = 0;
		for (i = 0;;i++)
		{
			for (k = 0;;)
			{
				if (juzi.charAt(index) != ' ' && juzi.charAt(index) != '\0')
				{
					word[i][k] = juzi.charAt(index);
					index++;
					k++;
				}
				else
				{
					word[i][k] = '\0';
					index++;
					k++;
					break;
				}
			}
			if (juzi.charAt(index - 1) == 0)
			{
				break;
			}
		}
		max = 0;
		min = 0;
		for (k = 1;k <= i;k++)
		{
			if (String.valueOf(word[k]).length() > String.valueOf(word[max]).length())
			{
				max = k;
			}
			if (String.valueOf(word[k]).length() < String.valueOf(word[min]).length())
			{
				min = k;
			}
		}
		System.out.printf("%s\n%s",word[max],word[min]);
		return 0;
	}
}
