package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sent = new String(new char[1000]);
		char[][] zfc = new char[300][200];
		int n;
		int i = 0;
		int j = 0;
		int k = 0;
		sent = new Scanner(System.in).nextLine();
		n = sent.length();

		for (i = 0;i < n;i++)
		{
			if ((sent.charAt(i) == ' ' && sent.charAt(i + 1) != ' ') || sent.charAt(i) == '\0')
			{
				zfc[j][k] = '\0';
				k = 0;
				j++;
			}
			else if (sent.charAt(i) != ' ')
			{
				zfc[j][k] = sent.charAt(i);
				k++;
			}
		}
		zfc[j][k] = '\0';
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d,",String.valueOf(zfc[i]).length());
		}
		System.out.printf("%d",String.valueOf(zfc[j]).length());
		return 0;
	}

}
