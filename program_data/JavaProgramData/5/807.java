package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n = 0;
		int k = 0;
		double m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Double.parseDouble(tempVar);
		}
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		int l = a.length();
		int t = b.length();
		   for (i = 0;i < l;i++)
		   {
		   if (a.charAt(i) != 'A' && a.charAt(i) != 'G' && a.charAt(i) != 'C' && a.charAt(i) != 'T')
		   {
			   k++;
		   }
		   if (b.charAt(i) != 'A' && b.charAt(i) != 'G' && b.charAt(i) != 'C' && b.charAt(i) != 'T')
		   {
			   k++;
		   }
		   }
		  if (k > 0)
		  {
			  System.out.print("error");
			  return 0;
		  }


		if (l == t)
		{
		for (i = 0;i <= l;i++)
		{

		  if (a.charAt(i) == b.charAt(i))
		  {
			  n++;
		  }
		}
		  if ((1.00 * n / l) > m)
		  {
			  System.out.print("yes");
		  }

		  else
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

