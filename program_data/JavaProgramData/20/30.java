package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int max;
		int maxi;
		String str = new String(new char[10]);
		String substr = new String(new char[4]);
		while (scanf("%s %s",str,substr) != EOF)
		{
			max = maxi = 0;
			for (i = 0;str.charAt(i) != 0;i++)
			{
				if (str.charAt(i) > max)
				{
					max = str.charAt(i);
					maxi = i;
				}
			}
			for (i = 0;i <= maxi;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.printf("%s",substr);
			for (;str.charAt(i) != 0;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}

}
