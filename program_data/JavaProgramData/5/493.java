package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double k;
		double x;
		int l;
		int m;
		int i;
		int a = 0;
		int t = 0;
		String st1 = new String(new char[501]);
		String st2 = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Double.parseDouble(tempVar);
		}
		scanf("\n");
		st1 = new Scanner(System.in).nextLine();
		st2 = new Scanner(System.in).nextLine();
		l = st1.length();
		m = st2.length();
		if (l != m)
		{
			t = 1;
		}
		else
		{
		for (i = 0;i < l - 1;i++)
		{
			if ((st1.charAt(i) != 'A' && st1.charAt(i) != 'T' && st1.charAt(i) != 'C' && st1.charAt(i) != 'G') || (st2.charAt(i) != 'A' && st2.charAt(i) != 'T' && st2.charAt(i) != 'C' && st2.charAt(i) != 'G'))
			{
				t = 1;
				break;
			}
				else if (st1.charAt(i) == st2.charAt(i))
				{
				a++;
				}
		}
		}
		x = 1.0 * a / (l - 1);
		if (t == 1)
		{
			System.out.print("error");
		}
			else if (x <= k)
			{
			System.out.print("no");
			}
		else
		{
		System.out.print("yes");
		}
		return 0;
	}
}

