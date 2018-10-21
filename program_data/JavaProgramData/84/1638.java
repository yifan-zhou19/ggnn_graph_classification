package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int x;
		int i = 2;
		int y;
		int m1;
		int m2 = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 x = Integer.parseInt(tempVar2);
	 }
	 m1 = x;
	 while (i <= a)
	 {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 y = Integer.parseInt(tempVar3);
		 }
	  if (m1 < y)
	  {
			  m2 = m1;
		   m1 = y;
	  }
	  else if (m1 >= y != 0 && y > m2)
	  {
		  m2 = y;
	  }
		i++;
	 }
	 System.out.printf("%d\n%d\n",m1,m2);
	return 0;
	}

}

