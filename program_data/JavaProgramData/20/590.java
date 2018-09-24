package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char c;
		String d = new String(new char[100]);
		int i;
		int j = 0;
		int k;
		while (scanf("%s%s",a,b) != EOF)
		{
			k = a.length();
			j = 0;
			for (i = 1,c = a.charAt(0);i < k;i++)
			{
				if (c < a.charAt(i))
				{
					c = a.charAt(i);
					j = i;
				}
			}
			for (i = 0;i <= j;i++)
			{
				d = tangible.StringFunctions.changeCharacter(d, i, a.charAt(i));
			}
			for (i = j + 1;i < k;i++)
			{
				d = tangible.StringFunctions.changeCharacter(d, i + 3, a.charAt(i));
			}
			for (i = 0;i < 3;i++,j++)
			{
				d = tangible.StringFunctions.changeCharacter(d, j + 1, b.charAt(i));
			}
			d = d.substring(0, k + 3);
			System.out.printf("%s\n",d);
		}
	}
}

