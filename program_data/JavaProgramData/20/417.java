package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char max;
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
	int l;
	int i;
	int j;
		while (scanf("%s%s",s1,s2) != EOF)
		{
		l = s1.length();
		max = '\0';
		for (i = 0;i <= l - 1;i++)
		{
			if (s1.charAt(i) > max)
			{
				j = i;
				max = s1.charAt(i);
			}
		}
		for (i = 0;i <= j;i++)
		{
			System.out.printf("%c",s1.charAt(i));
		}
		System.out.printf("%s",s2);
		for (i = j + 1;i <= l - 1;i++)
		{
			System.out.printf("%c",s1.charAt(i));
		}
	System.out.print('\n');
		}
	}



}
