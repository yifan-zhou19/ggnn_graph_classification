package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int k;
		int num = 0;
		int flag = 0;
		double l;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		String s = new String(new char[10]);
		s = new Scanner(System.in).nextLine();
		k = Integer.parseInt(s);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n = a.length();
		m = b.length();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if ((a.charAt(i) != 'A') && (a.charAt(i) != 'T') && (a.charAt(i) != 'C') && (a.charAt(i) != 'G'))
			{
				flag = 1;
				break;
			}
		}
		if ((n == m) && (flag == 0))
		{
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					num++;
				}
			}
			l = (double)num / n;
			if (l > k)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}

}
