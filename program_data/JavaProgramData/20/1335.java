package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		char max;
		int i;
		int k;
		int l;
		while (scanf("%s %s",str,substr) != EOF)
		{
			k = 0;
			l = str.length();
			max = str.charAt(0);
			for (i = 1;i < l;i++)
			{
				if (str.charAt(i) > max)
				{
					max = str.charAt(i);
					k = i;
				}
			}
			for (i = 0;i < l;i++)
			{
				if (i == k)
				{
					System.out.printf("%c",str.charAt(i));
					System.out.printf("%s",substr);
				}
				else
				{
					System.out.printf("%c",str.charAt(i));
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}
