package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int t = -2;
		int lengths;
		int lengtha;
		int lengthb;
		lengths = s.length();
		lengtha = a.length();
		lengthb = b.length();

		for (i = 0;i < lengths;i++)
		{
			k = 0;
			for (j = 0;j < lengtha;j++)
			{
				if (a.charAt(j) == s.charAt(i + j))
				{
					k++;
				}
			}

			if (k == lengtha)
			{
				t = i;
				break;
			}
		}
		if (t != -2)
		{
			for (i = 0;i < t;i++)
			{
				System.out.printf("%c",s.charAt(i));
			}
		System.out.printf("%s",b);
			for (i = t + lengthb;i < lengths;i++)
			{
				System.out.printf("%c",s.charAt(i));
			}
		}
		else
		{
			System.out.println(s);
		}
		return 0;
	}
}
