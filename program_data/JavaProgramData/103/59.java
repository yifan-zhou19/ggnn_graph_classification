package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		char t;
		int i;
		int l;
		int count;
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
			}
		}
		t = a.charAt(0);
		count = 1;
		for (i = 1;i < l;i++)
		{
			if (a.charAt(i) == t)
			{
				count++;
			}
			else
			{
				System.out.printf("(%c,%d)",t,count);
				t = a.charAt(i);
				count = 1;
			}
		}
		t = a.charAt(l - 1);
		System.out.printf("(%c,%d)\n",t,count);
	}
}

