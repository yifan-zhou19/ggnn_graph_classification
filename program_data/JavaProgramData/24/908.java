package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[10000]);
		char[][] a = new char[50][100];
		s = new Scanner(System.in).nextLine();
		int slen;
		int i;
		int j = 0;
		int k = 0;
		int maxlen;
		int max = 0;
		int minlen;
		int min = 0;
		slen = s.length();
		for (i = 0;i < slen;i++)
		{
			if (s.charAt(i) != ' ')
			{
				a[j][k] = s.charAt(i);
				k++;
			}
			if (s.charAt(i) == ' ')
			{
				a[j][k] = '\0';
				j++;
				k = 0;
			}
			if (i == slen - 1)
			{
				a[j][k] = '\0';
			}
		}

		maxlen = String.valueOf(a[0]).length();

		minlen = String.valueOf(a[0]).length();

		for (i = 0;i <= j;i++)
		{
			if (maxlen < String.valueOf(a[i]).length())
			{
				maxlen = String.valueOf(a[i]).length();
				max = i;
			}
			if (minlen > String.valueOf(a[i]).length())
			{
				minlen = String.valueOf(a[i]).length();
				min = i;
			}
		}
		System.out.printf("%s\n%s",a[max],a[min]);
		return 0;
	}
}
