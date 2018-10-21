package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[200][200];
		String s = new String(new char[4000]);
		int i = 0;
		int j = 0;
		int p = 0;
		int[] length = new int[200];
		int max;
		int min;

		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) == ' ')
			{
					str[j][i - p] = '\0';
					j++;
					p = i + 1;
			}
			else if (s.charAt(i) != ',')
			{
				str[j][i - p] = s.charAt(i);
			}
		}
		str[j][i - p] = '\0';


		for (i = 0;i <= j;i++)
		{
			length[i] = String.valueOf(str[i]).length();
		}
		j++;
		max = min = 0;
		for (i = 0;i < j;i++)
		{
			if (length[max] < length[i])
			{
				max = i;
			}
			if (length[min] > length[i])
			{
				min = i;
			}
		}
		System.out.printf("%s\n%s\n",str[max],str[min]);
		return 0;
	}

}
