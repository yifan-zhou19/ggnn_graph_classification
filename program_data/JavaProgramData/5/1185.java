package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double m;
		double a;
		double b;
		double t = 1;
		double k = 0;
		double s = 1;
		double result;
		String r = new String(new char[501]);
		String e = new String(new char[501]);
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			r = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			e = tempVar3.charAt(0);
		}
		a = r.length();
		b = e.length();
		if (a != b)
		{
				 System.out.print("error");
		}
		for (i = 0;i < (a - 1);i++)
		{
			  if ((r.charAt(i) == 'A') || (r.charAt(i) == 'T') || (r.charAt(i) == 'C') || (r.charAt(i) == 'G'))
			  {
					t++;
			  };
			  if ((e.charAt(i) == 'A') || (e.charAt(i) == 'T') || (e.charAt(i) == 'C') || (e.charAt(i) == 'G'))
			  {
					s++;
			  };
		}
		if ((t == a) && (s == b) && (a == b))
		{
		  for (i = 0;i < a - 1;i++)
		  {
		   if (r.charAt(i) == e.charAt(i))
		   {
			   k++;
		   };
		  };
		   result = k / (a - 1);
		if (result > m)
		{
					System.out.print("yes");
		}
		else
		{
					   System.out.print("no");
		};
		}
					   if (((t != a) || (s != b)) && (a == b))
					   {
			  System.out.print("error");
					   }
		 return 0;
	}


}

