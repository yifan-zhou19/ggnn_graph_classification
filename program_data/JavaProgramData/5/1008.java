package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		double w;
		int count = 0;
		int lena;
		int lenb;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Double.parseDouble(tempVar);
		}
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		lena = a.length();
		lenb = b.length();

		if (lena != lenb)
		{
			System.out.print("error");
		}
		else
		{
			int i;
			int j;
			int k = 0;
			for (i = 0;i < lena;i++)
			{
			if (!((a.charAt(i) == 'A' || a.charAt(i) == 'C' || a.charAt(i) == 'G' || a.charAt(i) == 'T') && (b.charAt(i) == 'A' || b.charAt(i) == 'G' || b.charAt(i) == 'C' || b.charAt(i) == 'T')))
			{
				System.out.print("error");
				k = 1;
				break;

			}
			}
			if (k == 0)
			{
				for (j = 0;j < lena;j++)
				{
					if (a.charAt(j) == b.charAt(j))
					{
						count++;
					}
				}
				double what;
				what = (double)count / lena;
					if (what >= w)
					{
						System.out.print("yes");
					}
					else
					{
						System.out.print("no");
					}
			}
		}
		return 0;
	}

}

