package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String jjla = new String(new char[501]);
		String jjlb = new String(new char[501]);
		int i;
		int j;
		jjla = new Scanner(System.in).nextLine();
		jjlb = new Scanner(System.in).nextLine();
		int b;
		int c;
		b = jjla.length();
		c = jjlb.length();
		if (b != c)
		{
			System.out.print("error");
		}
		else
		{
			int cwzm;
			cwzm = 0;
			for (j = 0;j < b;j++)
			{
				if (jjla.charAt(j) != 'A' && jjla.charAt(j) != 'G' && jjla.charAt(j) != 'T' && jjla.charAt(j) != 'C')
				{
						cwzm++;
				}
			}
			for (j = 0;j < b;j++)
			{
				if (jjlb.charAt(j) != 'A' && jjlb.charAt(j) != 'G' && jjlb.charAt(j) != 'T' && jjlb.charAt(j) != 'C')
				{
						cwzm++;
				}
			}
			if (cwzm == 0)
			{
				int xt;
				xt = 0;
				for (i = 0;i < b;i++)
				{
					if (jjla.charAt(i) == jjlb.charAt(i))
					{
						xt++;
					}
				}
				double bl;
				bl = (double)xt / b;
				if (bl > a)
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
		}
		return 0;
	}


}

