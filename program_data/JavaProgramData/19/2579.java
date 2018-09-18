package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[5000]);
		char[][] w = new char[1000][1000];
		String w1 = new String(new char[1000]);
		String w2 = new String(new char[1000]);
		word = new Scanner(System.in).nextLine();
		w1 = new Scanner(System.in).nextLine();
		w2 = new Scanner(System.in).nextLine();
		int n;
		int i;
		int j = 0;
		int k = 0;
		int A;
		n = word.length();
		for (i = 0;i < n;i++)
		{
			if (word.charAt(i) != ' ')
			{
			 w[k][j] = word.charAt(i);
			 j++;
			 A = 1;
			}
			if (word.charAt(i) == ' ' && A == 1)
			{
				w[k][j] = '\0';
				j = 0;
				k++;
				A = 0;
			}
		}
		for (i = 0;i <= k;i++)
		{
			if (strcmp(w1,w[i]) == 0)
			{
			w[i] = w2;
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s ",w[i]);
		}
		System.out.printf("%s",w[i]);
		return 0;
	}
}
