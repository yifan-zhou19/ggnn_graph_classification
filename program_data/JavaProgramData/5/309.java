package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[MAX + 1]);
		String s2 = new String(new char[MAX + 1]);
		double w;
		double m;
		int l1;
		int l2;
		int i;
		int j;
		int c = 0;
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
			for (i = 0;s1.charAt(i);i++)
			{
			   if (!(s1.charAt(i) == 'A' || s1.charAt(i) == 'T' || s1.charAt(i) == 'C' || s1.charAt(i) == 'G' || s2.charAt(i) == 'A' || s2.charAt(i) == 'T' || s2.charAt(i) == 'C' || s2.charAt(i) == 'G'))
			   {
			   System.out.print("error");
			  break;
			   }
			}
		   if (i == l1)
		   {
			for (j = 0;s1.charAt(j);j++)
			{
			   if (s1.charAt(j) == s2.charAt(j))
			   {
				  c++;
			   }
			}
		   m = (double)c / l1;
		   if (m > w)
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

