package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		char[][] word =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int k = 0;
		int k1 = 0;
		int k2 = 0;
		int sl;
		str = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		sl = str.length();
		for (i = 0;i < sl;i++)
		{
			if (str.charAt(i) == ' ' || i == sl - 1)
			{
				for (j = k;j < i;j++,k2++)
				{
					word[k1][k2] = str.charAt(j);
				}
				if (i == sl - 1)
				{
					word[k1][k2] = str.charAt(i);
				}
				k1++;
				k2 = 0;
				k = i + 1;
			}
		}
		for (i = 0;i < k1;i++)
		{
			if (strcmp(word[i], a) == 0)
			{
				word[i] = b;
			}
		}
		for (i = 0;i < k1;i++)
		{
			if (i != 0)
			{
				System.out.print(" ");
			}
			System.out.printf("%s", word[i]);
		}
		return 0;
	}
}
