package <missing>;

public class GlobalMembers
{
	public static String word = new String(new char[200]);

	public static void Main(String[] args)
	{
		int i;
		int j;
		int n;
		int[] e = new int[50];
		int[] len = new int[50];
		int l;
		int a;
		int b;
		String word = new String(new char[300]);
		word = new Scanner(System.in).nextLine();
		n = (int)word.length();
		word = tangible.StringFunctions.changeCharacter(word, n, ' ');
		e[0] = -1;
		j = 0;
		for (i = 0;i <= n;i++)
		{
			if (word.charAt(i) == ' ')
			{
				j++;
				e[j] = i;
				len[j] = e[j] - e[j - 1] - 1;
			}
		}
		l = j;
		for (j = 1;j < l;j++)
		{
			for (i = j + 1;i <= l;i++)
			{
				if (len[i] > len[j])
				{
					a = len[j];
					len[j] = len[i];
					len[i] = a;
					b = e[j];
					e[j] = e[i];
					e[i] = b;
				}
			}
		}
		for (i = (e[1] - len[1]);i < e[1];i++)
		{
			System.out.printf("%c",word.charAt(i));
		}
		System.out.print("\n");
		for (j = 1;j < l;j++)
		{
			for (i = j + 1;i <= l;i++)
			{
				if (len[i] < len[j])
				{
					a = len[j];
					len[j] = len[i];
					len[i] = a;
					b = e[j];
					e[j] = e[i];
					e[i] = b;
				}
			}
		}
		for (i = (e[1] - len[1]);i < e[1];i++)
		{
			System.out.printf("%c",word.charAt(i));
		}
		System.out.print("\n");
	}


}

