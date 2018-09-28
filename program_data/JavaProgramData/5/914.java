package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		String s = new String(new char[501]);
		String t = new String(new char[501]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int m = 0;
		int n;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			t = tempVar3.charAt(0);
		}
		n = s.length();
		l = t.length();
		if (n == l)
		{
		   p = s;
		   q = t;
		   while (*p != '\0')
		   {
			   if (*p != 'A' && *p != 'T' && *p != 'C' && *p != 'G')
			   {
				   System.out.print("error");
				   return 0;
			   }
			   else
			   {
				   if (*q != 'A' && *q != 'T' && *q != 'C' && *q != 'G')
				   {
					   System.out.print("error");
					   return 0;
				   }
				   else
				   {
					   if (*p == *q)
					   {
						   m++;
					   }
					   p++;
					   q++;
				   }
			   }

		   }
		   b = m * 1.0 / n;
		   if (b > a)
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

