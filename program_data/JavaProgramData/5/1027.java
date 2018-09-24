package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int sum = 0;
		int flag = 1;
		double n1;
		double n;
		String a = new String(new char[512]);
		String b = new String(new char[512]);
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
		if (a.length() != b.length())
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;a.charAt(i) != 0;i++)
			{
				   if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C')
				   {
					  flag = 0;
				   }
			}
			   for (i = 0;b.charAt(i) != 0;i++)
			   {
				if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C')
				{
					flag = 0;
				}
			   }
			if (flag != 0)
			{
				for (i = 0;a.charAt(i) != 0;i++)
				{
					if (a.charAt(i) == b.charAt(i))
					{
						sum++;
					}
				}
				n1 = (double)sum / (double)a.length();
				if (n1 > n)
				{
					System.out.print("yes\n");
				}
				else
				{
					System.out.print("no\n");
				}
			}
			else
			{
				System.out.print("error\n");
			}
		}
		return 0;
	}

}

