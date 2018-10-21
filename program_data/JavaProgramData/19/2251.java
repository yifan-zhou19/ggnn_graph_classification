package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[100]);
		char[][] zsz = new char[100][100];
		String word_a = new String(new char[100]);
		String word_b = new String(new char[100]);

		zfc = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			word_a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			word_b = tempVar2.charAt(0);
		}

		int word_i = 0;
		int word_j = 0;
		int i;
		int n;
		n = zfc.length();
		for (i = 0;i < n;i++)
		{
			if (zfc.charAt(i) == ' ' || zfc.charAt(i) == ',')
			{

				zsz[word_i][word_j] = '\0';
				word_i++;
				word_j = 0;

			}
			else
			{
				zsz[word_i][word_j] = zfc.charAt(i);
				word_j++;

				if (i == n - 1)
				{
					zsz[word_i][word_j] = '\0';
					word_i++;
				}
			}
		}
		int j;
		int[] a = new int[10];
		int m = 0;
		int k;
		for (j = 0;j < i;j++)
		{
			if (strcmp(zsz[j],word_a) == 0)
			{
				a[m] = j;
				m++;
			}
		}
		for (k = 0;k < m;k++)
		{
			zsz[a[k]] = word_b;
		}
		for (j = 0;j < word_i;j++)
		{
			if (j != word_i - 1)
			{
				System.out.printf("%s ",zsz[j]);
			}
			else
			{
				System.out.printf("%s",zsz[j]);
			}
		}

		return 0;
	}
}

