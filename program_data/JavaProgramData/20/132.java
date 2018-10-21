package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int Asc;
		int point;
		String str = new String(new char[10]);
		String substr = new String(new char[3]);
		while (scanf("%s%s",str,substr) == 2)
		{
			point = 0;
			Asc = 0;
			for (i = 0;i <= str.length();i++)
			{
				if (str.charAt(i) > Asc)
				{
					Asc = str.charAt(i);
					point = i;
				}
			}
			for (i = 0;i <= point;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			for (j = 0;j < substr.length();j++)
			{
				System.out.printf("%c",substr.charAt(j));
			}
			for (i = point + 1;i < str.length();i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
					   System.out.print("\n");
		}
	}

}
