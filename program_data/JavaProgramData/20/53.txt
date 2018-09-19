package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int max;
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		while (scanf("%s %s",str,substr) != EOF)
		{
			max = 0;
			for (i = 1;i < str.length();i++)
			{
				if (str.charAt(i) > str.charAt(max))
				{
					max = i;
				}
			}
			for (j = 0;j < max + 1;j++)
			{
				System.out.printf("%c",str.charAt(j));
			}
			for (k = 0;k < 3;k++)
			{
				System.out.printf("%c",substr.charAt(k));
			}
			for (j = max + 1;j < str.length();j++)
			{
				System.out.printf("%c",str.charAt(j));
			}
			System.out.print("\n");
		}
	}




}
