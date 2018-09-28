package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double n;
	double m;
	int i;
	int s = 0;
	int p;
	int q;
	int j;
	String s1 = new String(new char[501]);
	String s2 = new String(new char[501]);
	String string = new String(new char[100]);
	final String no = "no";
	final String y = "yes";
	final String e = "error";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
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
		p = s1.length();
		q = s2.length();
	   if (p == q)
	   {
		   for (j = 0;j < p;j++)
		   {
			   if (s1.charAt(j) == s2.charAt(j))
			   {
					s = s + 1;
			   }
		   }
			m = s * 1.0 / p;
			if (m > n)
			{
				String = y;

			}
			else
			{
				String = no;
			}
	   }
		else
		{
			String = e;
		}

		if (p == q)
		{
		   for (j = 0;j < p;j++)
		   {
			  if (s1.charAt(j) != 'A' && s1.charAt(j) != 'T' && s1.charAt(j) != 'C' && s1.charAt(j) != 'G' || s2.charAt(j) != 'A' && s2.charAt(j) != 'T' && s2.charAt(j) != 'C' && s2.charAt(j) != 'G')
			  {
			  String = e;
			  }
		   }
		}
	   System.out.printf("%s",String);
		return 0;
	}


}

