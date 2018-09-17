package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		char t;
		int i;
		int j;
		int n;
		int f = 0;
		int s;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (t = 'a';t <= 'z';t++)
		{
			for (s = i = 0;i < n;i++)
			{
				if (a.charAt(i) == t)
				{
				s = s + 1;
				f = 1;
				}
			}
				if (s != 0)
				{
					System.out.printf("%c=%d\n",t,s);
				}
		}
				if (f == 0)
				{
					System.out.print("No\n");
				}

	}

}
