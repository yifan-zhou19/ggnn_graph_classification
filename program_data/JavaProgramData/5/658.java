package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int t;
		int k = 0;
		double rate;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			rate = Double.parseDouble(tempVar);
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
		if (a.length() != b.length())
		{
		  System.out.print("error");
		}
		else
		{
		  t = a.length();
		  for (i = 0;i < t;i++)
		  {
			  if (a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C' && a.charAt(i) != 'A')
			  {
			  System.out.print("error");
			  break;
			  }
			  if (b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C' && b.charAt(i) != 'A')
			  {
			  System.out.print("error");
			  break;
			  }
			  if (a.charAt(i) == b.charAt(i))
			  {
			  k++;
			  }
			  if (i == t - 1)
			  {
				  if (1.0 * k / t >= rate)
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
	return 0;
	}

}

