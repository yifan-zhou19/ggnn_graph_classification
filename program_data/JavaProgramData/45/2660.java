package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int t;
	 String a = new String(new char[50]);
	 String b = new String(new char[50]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 b = tempVar2.charAt(0);
	 }
	 for (i = 0;;i++)
	 {
		  for (j = 0;;j++)
		  {
			if (a.charAt(i) == b.charAt(j))
			{
			   t = j;
			   m = i;
			   n = j;
			for (m = i,n = j;;)
			{
				 if (a.charAt(m) == b.charAt(n))
				 {
					 m++;
					 n++;
				 }
			  if ((m - i) == (a.length()))
			  {
				  break;
			  }
			}
			}
		  else
		  {
			  continue;
		  }

		  if ((m - i) == (a.length()))
		  {
			  break;
		  }

		  }
		 if ((m - i) == (a.length()))
		 {
			 break;
		 }
	 }
	  System.out.printf("%d",t);
	}

}

