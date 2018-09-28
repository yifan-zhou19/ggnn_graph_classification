package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int l;
	   int a;
	   int b;
	   int s;
	   int i;
	   double n;
	   double x;
	   String zfca = new String(new char[501]);
	   String zfcb = new String(new char[501]);
	   a = 0;
	   b = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Double.parseDouble(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   zfca = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   zfcb = tempVar3.charAt(0);
	   }


		int la = zfca.length();
		int lb = zfcb.length();
	   if (la != lb)
	   {
		   System.out.print("error");
	   }
	   else
	   {
		   a = 1;
	   }

	  if (a == 1)
	  {
	   while (true)
	   {
	   for (i = 0;zfca.charAt(i) != '\0';i++)
	   {
		 if (zfca.charAt(i) != 'A' && zfca.charAt(i) != 'T' && zfca.charAt(i) != 'C' && zfca.charAt(i) != 'G')
		 {
				System.out.print("error");
				break;
		 }
	   }
	   if (zfca.charAt(i) != '\0' && zfca.charAt(i) != 'A' && zfca.charAt(i) != 'T' && zfca.charAt(i) != 'C' && zfca.charAt(i) != 'G')
	   {
		   break;
	   }

	   for (i = 0;zfcb.charAt(i) != '\0';i++)
	   {
		 if (zfcb.charAt(i) != 'A' && zfcb.charAt(i) != 'T' && zfcb.charAt(i) != 'C' && zfcb.charAt(i) != 'G')
		 {
				System.out.print("error");
				break;
		 }
	   }
	   if (zfcb.charAt(i) == '\0')
	   {
		   b = 1;
	   }
	   break;
	   }
	  }
	  if (a == 1 && b == 1)
	  {
		for (i = 0,s = 0;zfca.charAt(i) != '0';i++)
		{
			if (zfca.charAt(i) == zfcb.charAt(i))
			{
				s = s + 1;
			}
		}
	  if (a == 1 && b == 1)
	  {
		  x = 1.0 * s / la;
		 if (x > n)
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

