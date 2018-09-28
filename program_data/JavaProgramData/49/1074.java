package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l;
		int k;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 2;i <= l;i++)
		{
			for (j = 0;j <= l - i;j++)
			{
				b = a;
				for (k = j;k <= j + i - 1;k++)
				{
					b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(2 * j + i - 1 - k));
				}
				if (strcmp(a,b) == 0)
				{
					for (k = j;k <= j + i - 1;k++)
					{
						System.out.printf("%c",a.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
	}
}

