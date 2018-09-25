package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		char t;
		int i;
		int f = 0;
		int s = 0;
			a = new Scanner(System.in).nextLine();
		for (t = 'a';t <= 'z';t++)
		{
			for (i = 0;i < a.length();i++)
			{
				if (t == a.charAt(i))
				{
					s = s + 1;
					f = 1;
				}
			}
				if (s != 0)
				{
				System.out.printf("%c=%d\n",t,s);
				}
				s = 0;
		}
		if (f == 0)
		{
			System.out.print("No");
		}
	}
}
