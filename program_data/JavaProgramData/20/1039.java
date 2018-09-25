package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		char t;
		while (scanf("%s%s",str,substr) != EOF)
		{
			t = str.charAt(0);
			k = 0;
			for (i = 1;str.charAt(i) != '\0';i++)
			{
				if ((str.charAt(i) - t) > 0)
				{
					t = str.charAt(i);
					k = i;
				}
			}
			for (i = 0;i <= k;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			for (i = 0;substr.charAt(i) != '\0';i++)
			{
				System.out.printf("%c",substr.charAt(i));
			}
			for (i = k + 1;str.charAt(i) != '\0';i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}


}
