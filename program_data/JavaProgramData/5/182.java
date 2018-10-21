package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		char x;
		char y;
		int i;
		int j;
		int k;
		int m;
		int n = 0;
		int z = 0;
		double o;
		double p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Double.parseDouble(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		m = b.length();
		k = c.length();
		if (m != k)
		{
		  System.out.print("error");
		  z = 1;
		}
		if (z == 0)
		{
		  for (i = 0;i < m;i++)
		  {
			if ((b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C') || (c.charAt(i) != 'A' && c.charAt(i) != 'T' && c.charAt(i) != 'G' && c.charAt(i) != 'C'))
			{
			   System.out.print("error");
			   z = 1;
			   break;
			}
		  }
		}
		if (z == 0)
		{
		  for (i = 0;i < m;i++)
		  {
			 if (b.charAt(i) == c.charAt(i))
			 {
				 n++;
			 }
		  }
		  o = 1.0 * n / m;
		  if (o > p)
		  {
			  System.out.print("yes");
		  }
		  else
		  {
			  System.out.print("no");
		  }
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			j = Integer.parseInt(tempVar2);
		}
		return 0;
	}

}

