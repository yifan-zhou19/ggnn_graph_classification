package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double c = 0;
		int i;
		int j = 0;
		int zs;
		String s1 = new String(new char[501]);
		String s2 = new String(new char[501]);
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
	if (s1.length() != s2.length())
	{
		System.out.print("error");
	}
	else
	{
		  zs = s1.length();
		  for (i = 0;i < zs;i++)
		  {
			  if (s1.charAt(i) == 'G' || s1.charAt(i) == 'A' || s1.charAt(i) == 'C' || s1.charAt(i) == 'T')
			  {
					 j++;
			  }
		  }

		  if (j != zs)
		  {
					 System.out.print("error");
					 return 0;
		  }
		  else
		  {
			 for (i = 0;i < zs;i++)
			 {
						 if (s1.charAt(i) - s2.charAt(i) == 0)
						 {
										 c = c + 1;
						 }
			 }
			 if (c / zs > n)
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

