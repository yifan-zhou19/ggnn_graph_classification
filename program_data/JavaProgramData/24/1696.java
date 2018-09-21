package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		char[][] b = new char[100][100];
		int i;
		int j = 0;
		int start = 0;
		int[] len = new int[100];
		int max = 0;
		int min = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == ' ')
			{
				b[j][i - start] = '\0';
				j++;
				start = i + 1;
			}
			else if (a.charAt(i) != ',')
			{
				b[j][i - start] = a.charAt(i);
			}
		}
		b[j][i - start] = '\0';
		j++;
		for (i = 0;i < j;i++)
		{
			len[i] = String.valueOf(b[i]).length();
		}
		for (i = 0;i < j;i++)
		{
			if (len[max] < len[i])
			{
				max = i;
			}
			if (len[min] > len[i])
			{
				min = i;
			}
		}
		System.out.printf("%s\n%s\n",b[max],b[min]);
		return 0;
	}

}
