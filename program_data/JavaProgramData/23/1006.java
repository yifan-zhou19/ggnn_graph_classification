package <missing>;

public class GlobalMembers
{
	public static int danci(String a, String[] word)
	{
		int blank;
		int i = 0;
		int j = 0;
		int n = 0;
		while (!a[i].equals('\0'))
		{
						 if (!a[i].equals(' '))
						 {
							 word[n][j] = a[i];
							 j = j + 1;
						 }
						 else if (!a[i + 1].equals(' ') && !a[i + 1].equals('\0'))
						 {
							 n = n + 1;
							 j = 0;
						 }
						 i = i + 1;
		}
		return (n + 1);
	}
	public static int Main()
	{
		String a = new String(new char[100]);
		char[][] word =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int n;
		int i;
		a = new Scanner(System.in).nextLine();
		n = danci(a, word);
		for (i = n - 1;i > 0;i--)
		{
			System.out.printf("%s ",word[i]);
		}
		System.out.printf("%s",word[0]);
	}

}
