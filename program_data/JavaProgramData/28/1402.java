package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sent = new String(new char[5000]);
		sent = new Scanner(System.in).nextLine();

		char[][] word = new char[601][15];

		int lsent = sent.length();
		int i = 0;
		int t = 0;
		int k;
		int l;
		while (i <= lsent)
		{
			if (sent.charAt(i) == '\0')
			{
					break;
			}
			for (k = 0;k + i <= lsent;k++)
			{

				 if (sent.charAt(i + k) != ' ' && sent.charAt(i + k) != '\0')
				 {
					   word[t][k] = sent.charAt(i + k);
				 }
				 else
				 {
					   word[t][k] = '\0';
					   i += String.valueOf(word[t]).length();
					   t++;

						  break;
				 }
			}
			i++;

		}
		int e;
		for (l = 0;l < t;l++)
		{
			e = String.valueOf(word[l]).length();
			if (l == 0)
			{
				if (e != 0)
				{
				System.out.printf("%d",e);
				}
			}
			else
			{
				if (e != 0)
				{
				System.out.printf(",%d",e);
				}
			}
		}
		return 0;
	}
}
