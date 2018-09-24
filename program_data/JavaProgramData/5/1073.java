package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  double n;
		  String a = new String(new char[600]);
		  String b = new String(new char[600]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Double.parseDouble(tempVar);
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
		  int len = a.length();
		  int time = 0;
		  int i;
		  if (a.length() != b.length())
		  {
			  System.out.print("error\n");
		  }
		  else
		  {
			   for (i = 0;i < len;i++)
			   {
					   if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C'))
					   {
						   break;
					   }
					   else if (a.charAt(i) == b.charAt(i))
					   {
						   time++;
					   }
			   }
			   if (i == len)
			   {
						 if ((double)time / (double)len > n)
						 {
							 System.out.print("yes\n");
						 }
						 else
						 {
							 System.out.print("no\n");
						 }
			   }
			   else
			   {
				   System.out.print("error\n");
			   }
		  }
	}
}

