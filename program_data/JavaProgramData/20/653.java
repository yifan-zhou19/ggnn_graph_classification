package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		String substr = new String(new char[100]);
		char max;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int k;
		int m;
		int n;
		int t;

		while (scanf("%s %s",str,substr) != EOF)
		{

		m = str.length();
		max = str.charAt(0);
		for (i = 0;i < m;i++)
		{
			if (str.charAt(i) > max)
			{
				max = str.charAt(i);
				t = i;
			}
		}
			b = str;
			b = tangible.StringFunctions.changeCharacter(b, t + 1, '\0');
			a = b;
			a += substr;
			n = a.length();
			for (i = 1;i < m - t;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, n + i - 1, str.charAt(t + i));
			}
			a = tangible.StringFunctions.changeCharacter(a, n + i - 1, '\0');


			System.out.printf("%s\n",a);
		}





	}

}

