package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[256]);
		String substring = new String(new char[256]);
		String replacement = new String(new char[256]);
		int i;
		int j;
		int len1;
		int len2;
		int ex = 0;
		int a = 0;
		int shit = 0;
		String = new Scanner(System.in).nextLine();
		substring = new Scanner(System.in).nextLine();
		replacement = new Scanner(System.in).nextLine();
		len1 = String.length();
		len2 = substring.length();
		for (i = 0;i < len1;i++)
		{
			for (j = 0;j < len2;j++)
			{
				if (String[i + j] == substring.charAt(j))
				{
					ex++;
				}
				if (ex == len2 && shit == 0)
				{
					shit = 1;
					for (j = a;j < i;j++)
					{
						System.out.printf("%c",string.charAt(j));
					}
					System.out.printf("%s",replacement);
					a = i + len2;

				}
			}
			ex = 0;
		}
		for (j = a;j < len1;j++)
		{
			System.out.printf("%c",string.charAt(j));
		}
		return 0;
	}


}
