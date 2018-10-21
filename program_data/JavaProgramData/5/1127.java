package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = 0;
		int lena;
		int lenb;
		int i;
		int c;
		String yi = new String(new char[501]);
		String er = new String(new char[501]);
		double rate;
		double a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			yi = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			er = tempVar3.charAt(0);
		}
		lena = yi.length();
		lenb = er.length();
		if (lenb != lena)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < lena;i++)
			{
				if (yi.charAt(i) == 0)
				{
					break;
				}
				else if (yi.charAt(i) >= 'A' && yi.charAt(i) <= 'Z' && er.charAt(i) >= 'A' && er.charAt(i <= 'Z'))
				{
					if (yi.charAt(i) == er.charAt(i))
					{
						sum++;
					}
					else
					{
						continue;
					}
				}
				else
				{
					c = 1;
					System.out.print("error");
					break;
				}
			}
			rate = sum * 1.0 / lena;
			if (c != 1)
			{
			if (rate > a)
			{
				System.out.print("yes");
			}
			else if (rate <= a)
			{
				System.out.print("no");
			}
			}
		}
		return 0;
	}
}

