package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double w;
		String s1 = new String(new char[600]);
		String s2 = new String(new char[600]);
		int l1;
		int l2;
		int i;
		int a;
		a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s2 = tempVar3.charAt(0);
		}
		l1 = s1.length();
		l2 = s2.length();
		if (l1 != l2)
		{
				   System.out.print("error");
		}
		else
		{
			 for (i = 0;i < l1;i++)
			 {
							   if (!(s1.charAt(i) == 'A' || s1.charAt(i) == 'T' || s1.charAt(i) == 'C' || s1.charAt(i) == 'G'))
							   {
																						System.out.print("error");
																						return 0;
							   }
			 }
			 for (i = 0;i < l1;i++)
			 {
							   if (!(s2.charAt(i) == 'A' || s2.charAt(i) == 'T' || s2.charAt(i) == 'C' || s2.charAt(i) == 'G'))
							   {
																						System.out.print("error");
																						return 0;
							   }
			 }

			 for (i = 0;i < l1;i++)
			 {
							   if (s1.charAt(i) == s2.charAt(i))
							   {
												a++;
							   }
			 }
			 if ((1.0 * a) / l1 > w)
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

