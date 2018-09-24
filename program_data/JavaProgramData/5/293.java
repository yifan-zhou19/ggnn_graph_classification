package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		double n;
		double a = 0;
		double b = 0;
		double t = 0;
		double k = 0;
		String s = new String(new char[501]);
		String str = new String(new char[501]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			str = tempVar3.charAt(0);
		}

		for (i = 0;s.charAt(i);i++)
		{
			a++;
		}
		for (i = 0;str.charAt(i);i++)
		{
			b++;
		}
		if (a == b)
		{
		 for (i = 0;s.charAt(i);i++)
		 {
			 if ((s.charAt(i) == 'A' || s.charAt(i) == 'G' || s.charAt(i) == 'C' || s.charAt(i) == 'T') && (str.charAt(i) == 'A' || str.charAt(i) == 'G' || str.charAt(i) == 'C' || str.charAt(i) == 'T'))
			 {
			   if (s.charAt(i) == str.charAt(i))
			   {
				 t++;
			   }
			 }
			 else
			 {
				 System.out.print("error");
				 k = 1;
				 break;
			 }
		 }
		if (t / a > n && k == 0)
		{
			System.out.print("yes");
		}
		else if (k == 0)
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

