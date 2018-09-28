package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double f;
		int i;
		int p;
		int s = 1;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			f = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		int len1 = a.length();
		int len2 = b.length();
		if (len1 != len2)
		{
			System.out.print("error");
		}
		else if (len1 == len2)
		{
			for (i = 0;i < len1;i++)
			{
				if (((a.charAt(i) != 'A') && (a.charAt(i) != 'T') && (a.charAt(i) != 'C') && (a.charAt(i) != 'G')) || ((b.charAt(i) != 'A') && (b.charAt(i) != 'T') && (b.charAt(i) != 'C') && (b.charAt(i) != 'G')))
				{
					System.out.print("error");
					p = 0;
					break;
				}
				else if (a.charAt(i) == b.charAt(i))
				{
					s++;
				}
			}
			if ((1.0 * s / (1.0 * len1) > f) && (p != 0))
			{
				System.out.print("yes");
			}
			else if ((1.0 * s / (1.0 * len1) <= f) && (p != 0))
			{
				System.out.print("no");
			}

		}
		return 0;


	}


}

