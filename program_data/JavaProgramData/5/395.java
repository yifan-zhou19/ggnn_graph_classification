package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		int i;
		int j = 0;
		double x;
		double y;
		double z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Double.parseDouble(tempVar);
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
		y = b.length();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			 if (a.length() != b.length())
			 {
				  System.out.print("error");
				  break;
			 }
			 if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
			 {
				 System.out.print("error");
				 break;
			 }
			 if (a.charAt(i) == b.charAt(i))
			 {
				 j++;
			 }
			 if (a.charAt(i + 1) == '\0')
			 {
				 z = j / y;
				 if (z > x)
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

