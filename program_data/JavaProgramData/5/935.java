package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int l;
		int max;
		int s;
		int f;
		float a;
		float b;
		String ch1 = new String(new char[600]);
		String ch2 = new String(new char[600]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Float.parseFloat(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			ch1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			ch2 = tempVar3.charAt(0);
		}
		m = ch1.length();
		n = ch2.length();

		f = 1;
		if (m != n)
		{
			f = 0;
		}
		max = 0;

		if (f != 0)
		{
			for (i = 0;i < m;i++)
			{
				if (((ch1.charAt(i) == 'A') || (ch1.charAt(i) == 'T') || (ch1.charAt(i) == 'C') || (ch1.charAt(i) == 'G')) && ((ch2.charAt(i) == 'A') || (ch2.charAt(i) == 'T') || (ch2.charAt(i) == 'C') || (ch2.charAt(i) == 'G')))
				{
					if (ch1.charAt(i) == ch2.charAt(i))
					{
						max++;
					}
				}
				else
				{
					f = 0;
					break;
				}
			}
		}

		if (f != 0)
		{
			b = (float)max / n;
			if (b > a)
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

