package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[300]);
		int[] a = new int[26];
		String c = new String(new char[26]);
		int b;
		int i;
		int n = 0;
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				b = s.charAt(i) - 'a';
				a[b] = a[b] + 1;
			}
		}
		for (i = 0;i < 26;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, 'a' + i);
			if (a[i] != 0)
			{
				n++;
				System.out.printf("%c=%d\n",c.charAt(i),a[i]);
			}
		}
		if (n == 0)
		{
			System.out.print("No\n");
		}

	}


}

