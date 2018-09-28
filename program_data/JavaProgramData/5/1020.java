package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int d;
		int l;
		int h;
		double n;
		double t;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		d = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		l = a.length();
		h = b.length();
		if (l > h || l < n)
		{
			System.out.print("error");
		}
		else if (l == h)
		{
			for (i = 0,j = 0;a.charAt(i) != '\0';i++,j++)
			{
				if (a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'C' || a.charAt(i) == 'G')
				{
					 if (a.charAt(i) == b.charAt(j))
					 {
						 d++;
					 }
				}
				else
				{
					System.out.print("error");
					return 0;
				}
			}
			t = (double)d / l;
			if (t > n)
			{
				System.out.print("yes");
			}
			else if (t <= n)
			{
				System.out.print("no");
			}
		}
		return 0;
	}


}

