package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		int count = 0;
		int i;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
			if ((int)a.length() != (int)b.length())
			{
				System.out.print("error");
			}
			else
			{
				for (i = 0;i < (int)a.length();i++)
				{
					if (((a.charAt(i) != 'A') && (a.charAt(i) != 'T') && (a.charAt(i) != 'C') && (a.charAt(i) != 'G')) || ((b.charAt(i) != 'A') && (b.charAt(i) != 'T') && (b.charAt(i) != 'C') && (b.charAt(i) != 'G')))
					{
						System.out.print("error");
						return 0;
					}
					else if (a.charAt(i) == b.charAt(i))
					{
						count++;
					}
				}
				if (1.0 * count / (int)a.length() >= n)
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

