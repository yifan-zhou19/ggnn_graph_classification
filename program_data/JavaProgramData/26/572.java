package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] danci = new char[50][100];
		String sentence = new String(new char[101]);
		int i;
		int k;
		int n;
		int len;
		k = 0;
		n = 0;
		sentence = new Scanner(System.in).nextLine();
		len = sentence.length();
		for (i = 0; i < len; i++)
		{
			if (sentence.charAt(i) != ' ')
			{
			   danci[n][k] = sentence.charAt(i);
			   k++;
			}
			else if (sentence.charAt(i) == ' ' && sentence.charAt(i - 1) == ' ')
			{
				n = n;
				k = 0;
			}
			else if (sentence.charAt(i) == ' ' && sentence.charAt(i - 1) != ' ')
			{
			  danci[n][k] = '\0';
			  n++;
			  k = 0;
			}
		}
	danci[n][k] = '\0';
	for (i = 0;i < n;i++)
	{
		System.out.printf("%s ",danci[i]);
	}
	System.out.printf("%s",danci[i]);

		return 0;
	}
}
