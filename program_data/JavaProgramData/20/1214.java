package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		int i;
		int j;
		int m;
		int n;
	   while (scanf("%s%s",str,substr) != EOF)
	   {

		m = str.length();
		j = 0;
		n = str.charAt(0);
		for (i = 1;i < m;i++)
		{
		if (str.charAt(i) > n)
		{
			j = i;
			n = str.charAt(i);
		}
		}
		for (i = 0;i <= j;i++)
		{
		System.out.printf("%c",str.charAt(i));
		}
		System.out.printf("%s",substr);
		for (i = j + 1;i < m;i++)
		{
		System.out.printf("%c",str.charAt(i));
		}
		System.out.print("\n");
	   }
	   return 0;

	}

}
