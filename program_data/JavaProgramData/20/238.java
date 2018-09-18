package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		int i;
		int k = 0;
		int n;
		char a;
		while (scanf("%s %s",str,substr) == 2)
		{
			n = str.length();
			a = str.charAt(0);
			for (i = 0;;i++) //??ASCII???????
			{
				if (str.charAt(i) == '\0')
				{
				break;
				}
				if (str.charAt(i) > a)
				{
					a = str.charAt(i);
					k = i;
				}
			}
			for (i = 0;i <= k;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			for (i = 0;i <= 2;i++)
			{
				System.out.printf("%c",substr.charAt(i));
			}
			for (i = k + 1;i < n;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.print("\n");
		}

	}



}
