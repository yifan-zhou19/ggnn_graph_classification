package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n1;
		int n2;
		int p;
		double rate;
		double m = 0.0;
		String str1 = new String(new char[501]);
		String str2 = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			rate = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			str2 = tempVar3.charAt(0);
		}
		n1 = str1.length();
		n2 = str2.length();
		p = 0;
		if (n1 == n2)
		{
		   for (i = 0;i < n1;i++)
		   {
			   if (str1.charAt(i) != 'A' && str1.charAt(i) != 'T' && str1.charAt(i) != 'C' && str1.charAt(i) != 'G')
			   {
				p = 1;
			   }
		   else if (str2.charAt(i) != 'A' && str2.charAt(i) != 'T' && str2.charAt(i) != 'C' && str2.charAt(i) != 'G')
		   {
				p = 1;
		   }
		   if (p == 1)
		   {
			   System.out.print("error");
			   break;
		   }
		   if (str1.charAt(i) == str2.charAt(i))
		   {
			   m += 1.0;
		   }
		   }
		   if (p == 0)
		   {
			  if (m / n1 >= rate)
			  {
			   System.out.print("yes");
			  }
			  else
			  {
				  System.out.print("no");
			  }
		   }
		}
		else
		{
			System.out.print("error");
		}

		return 0;
	}
}

