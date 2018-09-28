package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		char[][] words = new char[1000][1001];
		a = new Scanner(System.in).nextLine();
		int n;
		int k;
		int i;
		int[] len = new int[300];

		n = 0;
		k = 0;

	   for (i = 0; a.charAt(i) != 0; i++)
	   {
			if (a.charAt(i) == ' ')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '\0');
				words[n] = (a.Substring(k));
				n++;
				k = i + 1;
			}
	   }
		words[n] = (a.Substring(k));
		n++;

		for (i = 0;i < n - 1;i++)
		{
			len[i] = String.valueOf(words[i]).length();
			if (len[i] != 0)
			{
				System.out.printf("%d,",len[i]);
			}
		}
		len[n - 1] = String.valueOf(words[n - 1]).length();
		if (len[n - 1] != 0)
		{
			System.out.printf("%d",len[n - 1]);
		}
		return 0;
	}




}

