package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String a = new String(new char[501]);
		String b = new String(new char[501]);
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
		int la = a.length();
		int lb = b.length();
		int i;
		int s = 0;
		double e;
		if (la != lb)
		{
			System.out.print("error");
		}
		else
		{
			 for (i = 0;i < la;i++)
			 {
			 if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G' || b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G')
			 {
				System.out.print("error");
				break;
			 }

		else
		{
		if (a.charAt(i) == b.charAt(i))
		{
			s = s + 1;
		}
		if (i == la - 1)
		{
		e = 1.0 * s / la;
		if (e > n)
		{
		System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		}
		}
			 }
		}
		return 0;
		}
}

