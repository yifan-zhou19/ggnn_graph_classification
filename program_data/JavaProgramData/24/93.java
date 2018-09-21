package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] word = new char[50][20];
		int max;
		int min;
		int c;
		int total;
		int flag;
		int i;
		flag = 0;
		i = 0;
		while ((c = scanf("%s",word[i])) == 1)
		{
			i++; //recite the usage of "scanf", see book p.376
		}
		total = i;
		max = min = 0;
		for (i = 0;i <= total - 1;i++)
		{
			if (String.valueOf(word[i]).length() > String.valueOf(word[max]).length())
			{
				max = i;
			}
			if (String.valueOf(word[i]).length() < String.valueOf(word[min]).length())
			{
				min = i;
			}
		}
		System.out.printf("%s\n%s",word[max],word[min]);
	}
}
