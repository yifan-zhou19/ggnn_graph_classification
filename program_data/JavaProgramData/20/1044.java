package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int a;
		int m;
		String str = new String(new char[11]);
		String substr = new String(new char[4]);

			while (scanf("%s%s",str,substr) != EOF)

			{
				n = str.length();
				m = 0;

				for (i = 0;i < n;i++)
				{
					if (str.charAt(i) > m)
					{
						m = str.charAt(i);
						a = i;
					}
				}


				for (i = 0;i < n;i++)
				{
					System.out.printf("%c",str.charAt(i));
					if (i == a)
					{
						System.out.printf("%s",substr);
					}
				}
				System.out.print("\n");
			}

	}
}
