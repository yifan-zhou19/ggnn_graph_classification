package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int len1;
		int len2;
		int num = 0;
		int t = 1;
			double rate;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
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
		len1 = a.length();
		len2 = b.length();
		if (len1 != len2)
		{
		  System.out.print("error");
		}
		 if (len1 == len2)
		 {
		   for (i = 0;i < len1;i++)
		   {
		   if (a.charAt(i) == b.charAt(i) && (a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'C' || a.charAt(i) == 'G') && (b.charAt(i) == 'A' || b.charAt(i) == 'T' || b.charAt(i) == 'C' || b.charAt(i) == 'G'))
		   {
			num++;
		   }
		   else if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
		   {
			t = 0;
			break;
		   }
		   }
		  if (t == 0)
		  {
		   System.out.print("error");
		  }
		  else
		  {
			if (num * 1.0 / len1 > rate)
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

