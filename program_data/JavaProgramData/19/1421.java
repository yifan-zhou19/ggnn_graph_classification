package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sen = new String(new char[101]);
		String word1 = new String(new char[101]);
		String word2 = new String(new char[101]);
		char[][] danci = new char[50][101];
		int[] LEN = new int[50];
		int LEN1;
		int i;
		int k = 0;
		int j = 0;
		sen = new Scanner(System.in).nextLine();
		word1 = new Scanner(System.in).nextLine();
		word2 = new Scanner(System.in).nextLine();
		LEN1 = sen.length();
		for (i = 0;i < LEN1;i++)
		{
			if (sen.charAt(i) != ' ')
			{
				danci[j][k] = sen.charAt(i);
				k++;
			}
			else
			{
				danci[j][k] = '\0';
				j++;
				k = 0;
			}
		}
		danci[j][k] = '\0';
		for (i = 0;i < j;i++)
		{
			LEN[i] = String.valueOf(danci[i]).length();
		}
		for (i = 0;i <= j;i++)
		{
			if (strcmp(danci[i],word1) == 0)
			{
				danci[i] = word2;
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s ",danci[i]);
		}
		System.out.printf("%s\n",danci[j]);
		return 0;
	}
}
