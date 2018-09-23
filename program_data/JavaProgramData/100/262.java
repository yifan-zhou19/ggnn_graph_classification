package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void num(char a[1000]);
		String b = new String(new char[1000]);
		b = new Scanner(System.in).nextLine();
		num(b);
	}
	public static void num(String a)
	{
		char let;
		int d;
		int i;
		int c;
		for (let = 'a',c = 0;let <= 'z';let++)
		{
			d = 0;
			for (i = 0;i < a.length();i++)
			{
				if (a[i].equals(let))
				{
					d++;
				}
			}
			if (d != 0)
			{
				System.out.printf("%c=%d\n",let,d);
				c++;
			}
		}
		if (c == 0)
		{
			System.out.print("No");
		}
	}
}
