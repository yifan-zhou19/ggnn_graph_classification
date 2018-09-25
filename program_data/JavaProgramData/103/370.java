package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1100]);
		a = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int count = 0;
		char b = 0;
		i = 0;
		while (true)
		{
			if (i > a.length())
			{
				break;
			}
			if (a.charAt(i) <= 'z' && a.charAt(i) >= 'a')
			{
				a.charAt(i) += 'A'-'a';
			}
			if (b == 0)
			{
				b = a.charAt(i);
				count = 1;
				i++;
				continue;
			}
			if (a.charAt(i) == b)
			{
				count++;
			}
			else
			{

					System.out.print("(");
					System.out.print(b);
					System.out.print(",");
					System.out.print(count);
					System.out.print(")");
					b = a.charAt(i);
					count = 1;
			}
			i++;
		}

		return 0;
	}
}
