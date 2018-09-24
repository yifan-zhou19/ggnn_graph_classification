package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String t = new String(new char[100]);
		String b = new String(new char[100]);
		int k;
		int i;
		int j;
		int word;
		word = 0;
		k = 0;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int len;
		len = s.length();
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) == ' ')
			{
				word = 0;
			}
			else if (word == 0)
			{
				k++;
			word = 1;
			}
		}
		int A = 0;
		int n;
		int m = 0;
		for (j = 0;j < k;j++)
		{
			for (i = A,n = 0;i < len;i++,n++)
			{
				if (s.charAt(i) != ' ')
				{
					t = tangible.StringFunctions.changeCharacter(t, n, s.charAt(i));
				}
				if (s.charAt(i) == ' ')
				{
					t = tangible.StringFunctions.changeCharacter(t, n, '\0');
				 A = i + 1;
				 break;
				}
			}
			if (i == len)
			{
				t = tangible.StringFunctions.changeCharacter(t, n, '\0');
			}

			if (strcmp(t,a) == 0)
			{
				t = b;
			}
			m++;
			if (m != k)
			{
				System.out.printf("%s ",t);
			}
			if (m == k)
			{
				System.out.printf("%s\n",t);
			}
		}
		return 0;
	}

}

