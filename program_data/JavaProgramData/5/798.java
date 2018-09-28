package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int p = 0;
		int t = 0;
		int r = 0;
		double k;
		double q;
		String gen1 = new String(new char[1000]);
		String gen2 = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			gen1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			gen2 = tempVar3.charAt(0);
		}
		if (gen1.length() != gen2.length())
		{
		System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < gen1.length();i++)
			{
				if (gen1.charAt(i) != 'A' && gen1.charAt(i) != 'C' && gen1.charAt(i) != 'G' && gen1.charAt(i) != 'T')
				{
			r++;
				}
			}
			for (i = 0;i < gen2.length();i++)
			{
			if (gen2.charAt(i) != 'A' && gen2.charAt(i) != 'C' && gen2.charAt(i) != 'G' && gen2.charAt(i) != 'T')
			{
			r++;
			}
			}
			if (r > 0)
			{
			System.out.print("error");
			t = 0;
			}
			else
			{
			t = 1;
			}
		if (t == 1)
		{
			for (i = 0;i < gen1.length() + 1;i++)
			{
				if (gen1.charAt(i) == gen2.charAt(i))
				{
				p++;
				}
			}
			q = 1.0 * p / (gen1.length());
			 if (q > k)
			 {
			 System.out.print("yes\n");
			 }
			 else
			 {
			 System.out.print("no\n");
			 }
		}
		}
	return 0;
	}
}

