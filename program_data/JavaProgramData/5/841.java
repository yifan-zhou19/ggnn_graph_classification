package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double k;
		int N = 1;
		String kk = new String(new char[100]);
		kk = new Scanner(System.in).nextLine();
		k = Double.parseDouble(kk);
		String aa = new String(new char[10000]);
		aa = new Scanner(System.in).nextLine();
		String bb = new String(new char[10000]);
		bb = new Scanner(System.in).nextLine();
		int na;
		int nb;
		na = aa.length();
		nb = bb.length();
		int n = 0;
		if (na != nb)
		{
			N = 0;
		}
		else
		{
			for (int i = 0;i < na;i++)
			{
				if (aa.charAt(i) == bb.charAt(i) && (aa.charAt(i) == 'A' || aa.charAt(i) == 'T' || aa.charAt(i) == 'C' || aa.charAt(i) == 'G'))
				{
					n++;
				}
				else if (aa.charAt(i) == 'a' || aa.charAt(i) == 't' || aa.charAt(i) == 'c' || aa.charAt(i) == 'g' || bb.charAt(i) == 'a' || bb.charAt(i) == 't' || bb.charAt(i) == 'c' || bb.charAt(i) == 'g')
				{
					N = 0;
				}
			}
		}
		if (N == 0)
		{
			System.out.print("error");
		}
		else
		{
			double p;
			p = 1.0 * n / na;
			if (p > k)
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
