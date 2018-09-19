package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		String substr = new String(new char[1000]);
		while (scanf("%s %s",str,substr) != EOF)
		{
			int len1 = str.length();
			int i;
			int j;
			int k;
			int max;
			int temp;
			max = str.charAt(len1 - 1);
			for (i = len1 - 1;i >= 0;i--)
			{
				if (str.charAt(i) >= max)
				{
					max = str.charAt(i);
					temp = i;
				}
			}
			for (i = 0;i < len1;i++)
			{
				if (i == temp)
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
