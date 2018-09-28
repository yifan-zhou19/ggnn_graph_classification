package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double c = 0;
		int i;
		int n;
		int b = 0;
		String q = new String(new char[500]);
		String w = new String(new char[500]);
		String num = new String(new char[50]);
		num = new Scanner(System.in).nextLine();
		a = Double.parseDouble(num);
		q = new Scanner(System.in).nextLine();
		w = new Scanner(System.in).nextLine();
		n = q.length();
		for (i = 0;i < n;i++)
		{
			if (q.charAt(i) != 'A' && q.charAt(i) != 'T' && q.charAt(i) != 'C' && q.charAt(i) != 'G')
			{
				b++;
			}
			if (w.charAt(i) != 'A' && w.charAt(i) != 'T' && w.charAt(i) != 'C' && w.charAt(i) != 'G')
			{
				b++;
			}
		}
		if (b != 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				if (q.charAt(i) == w.charAt(i))
				{
					c++;
				}
			}
			c = c / n;
			if (c > a)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}
		return 0;
	}






}
