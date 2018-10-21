package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String str = "";
		String p = new String(new char[50]);
		int i = 0;
		int j;
		while (scanf("%s",str.charAt(i)) != EOF)
		{
			i++;
		}
		p = str;
		for (j = i - 1;j >= 1;j--)
		{
			System.out.printf("%s ",p.charAt(j));
		}
		System.out.printf("%s",p.charAt(0));
	}


}
