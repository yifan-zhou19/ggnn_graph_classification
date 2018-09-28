package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int m = 0;
		 int t;
		 int j;
		 int d = 0;
		 int e = 0;
		 String a = new String(new char[100]);
		 String b = new String(new char[100]);
		 String c = new String(new char[100]);
		  for (t = 0;t < 100;t++)
		  {
			  b = b.substring(0, t);
		  }
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 while (d != n)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a = tempVar2.charAt(0);
			 }
		   for (t = 0;t < 100;t++)
		   {
			   if (a.charAt(t) == '\0')
			   {
				   j = t;
				   break;
			   }
		   }
			for (t = 0;t < j;t++)
			{
			   for (i = 0;i < j;i++)
			   {
			  if (a.charAt(t) == a.charAt(i))
			  {
				  b.charAt(t)++;
			  }
			   }
			}
		  for (t = 0;t < j;t++)
		  {
			 if (b.charAt(t) == 1)
			 {
				 m = t + 1;
				 break;
			 }
		  }
		  if (m == 0)
		  {
			  System.out.print("no\n");
		  }
		   else
		   {
			   System.out.printf("%c\n",a.charAt(m - 1));
		   }
			d++;
			for (t = 0;t < 100;t++)
			{
				b = b.substring(0, t);
			}
			e = 0;
			m = 0;
		 }
		   System.in.read();
		   System.in.read();
		   System.in.read();
		   System.in.read();
	}
}

