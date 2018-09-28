package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sen = new String(new char[1000]);
		sen = new Scanner(System.in).nextLine();
		char[][] danci = new char[50][100];
		int i;
		int k;
		int n;
		int len;
		k = 0;
		n = 0;
		len = sen.length();
		for (i = 0;i < len;i++)
		{
			if (sen.charAt(i) != ' ')
			{
				danci[n][k] = sen.charAt(i);
				k++;
			}
			else
			{
				danci[n][k] = '\0';
				n++;
				k = 0;
			}
		}
		danci[n][k] = '\0';
		int max = 0;
		int min = 0;
	for (i = 1; i < n + 1; i++)
	{
	if (String.valueOf(danci[i]).length() < String.valueOf(danci[min]).length())
	{
	min = i;
	}
	if (String.valueOf(danci[i]).length() > String.valueOf(danci[max]).length())
	{
	max = i;
	}
	}
	/* ??????? */
	System.out.println(danci[max]);
	System.out.println(danci[min]);
	return 0;
	}
}
