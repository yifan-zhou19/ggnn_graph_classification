package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[14]);
		String substr = new String(new char[4]);
		int i;
		int j;
		int n;
		int a;
		char max;
		while (scanf("%s %s",str,substr) != EOF)
		{
			max = str.charAt(0);
			n = str.length();
			for (i = 1;i < n;i++)
			{
				if (str.charAt(i) > max)
				{
					max = str.charAt(i);
					a = i;
				}
			}
			for (j = 0;j < a + 1;j++)
			{
				System.out.printf("%c",str.charAt(j));
			}
			for (j = 0;j < 3;j++)
			{
				System.out.printf("%c",substr.charAt(j));
			}
			for (j = a + 1;j < n;j++)
			{
				System.out.printf("%c",str.charAt(j));
			}
			System.out.print("\n");
		}
		return 0;
	}
}
