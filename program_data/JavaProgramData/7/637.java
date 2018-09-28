package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[257]);
		String z = new String(new char[200]);
		String h = new String(new char[200]);
		String t = new String(new char[100]);
		int lens;
		int lenz;
		int lenh;
		int i;
		int j;
		int sum;
		int r;
		int q = 0;
		int p = 0;
		s = new Scanner(System.in).nextLine();
		z = new Scanner(System.in).nextLine();
		h = new Scanner(System.in).nextLine();
		lens = s.length();
		lenz = z.length();
		lenh = h.length();
		for (i = 0;i < lens;i++)
		{
			sum = 0;
			for (j = 0;j < lenz;j++)
			{
				if (s.charAt(i + j) == z.charAt(j))
				{
					sum++;
				}
				else
				{
				break;
				}
			}
			if (sum == lenz)
			{
				r = i;
				q = 1;
				break;
			}
		}
		if (q == 1)
		{
			for (i = 0;i < r;i++)
			{
				System.out.printf("%c",s.charAt(i));
			}
			System.out.printf("%s",h);
			for (i = r + sum;i < lens;i++)
			{
				System.out.printf("%c",s.charAt(i));
			}
		}
		else if (q == 0)
		{
			System.out.printf("%s",s);
		}
		return 0;
	}

}
