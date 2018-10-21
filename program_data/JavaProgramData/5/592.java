package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int p;
		int q;
		int i;
		int flag = 1;
		double m;
		double c = 0;
		double d = 0;
		String a = new String(new char[10086]);
		String b = new String(new char[10086]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Double.parseDouble(tempVar);
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
		p = a.length();
		q = b.length();
		if (p != q)
		{
			flag = 0;
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
							   if ((a.charAt(i) == 'A') || (a.charAt(i) == 'G') || (a.charAt(i) == 'C') || (a.charAt(i) == 'T'))
							   {
							   }
							   else
							   {
								   flag = 0;
							   }
		}
		 for (i = 0;b.charAt(i) != '\0';i++)
		 {
							   if ((b.charAt(i) == 'A') || (b.charAt(i) == 'G') || (b.charAt(i) == 'C') || (b.charAt(i) == 'T'))
							   {
							   }
							   else
							   {
								   flag = 0;
							   }
		 }
		for (i = 0;a.charAt(i) != '\0';i++)
		{
							   if (a.charAt(i) == b.charAt(i))
							   {
								   c++;
							   }
							   d++;
		}
		if (flag == 0)
		{
			System.out.print("error");
		}
		if (flag == 1)
		{
		if (c / d >= m)
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

