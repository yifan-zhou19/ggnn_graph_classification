package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   double m;
	   double c = 0;
	   double d;
	   int i;
	   int k;
	   int a;
	   int b;
	   int s = 0;
	   String s1 = new String(new char[550]);
	   String s2 = new String(new char[550]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Double.parseDouble(tempVar);
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
	   a = s1.length();
	   b = s2.length();
	   if (a != b)
	   {
			   System.out.print("error\n");
	   }
	   if (a == b)
	   {
			for (i = 0;i < a;i++)
			{
				if (s1.charAt(i) != 'A' && s1.charAt(i) != 'C' && s1.charAt(i) != 'G' && s1.charAt(i) != 'T')
				{
					   s++;
				}
			}
			for (i = 0;i < b;i++)
			{
				   if (s2.charAt(i) != 'A' && s2.charAt(i) != 'C' && s2.charAt(i) != 'G' && s2.charAt(i) != 'T')
				   {
					  s++;
				   }
			}
			if (s == 0)
			{
			 for (i = 0;i < a;i++)
			 {
				   if (s1.charAt(i) == s2.charAt(i))
				   {
					  c++;
				   }
			 }
			 d = c / a;
			 if (d >= m)
			 {
				 System.out.print("yes\n");
			 }
			 else
			 {
				 System.out.print("no\n");
			 }
			}
			if (s != 0)
			{
				 System.out.print("error\n");
			}
	   }

	   return 0;
	}
}

