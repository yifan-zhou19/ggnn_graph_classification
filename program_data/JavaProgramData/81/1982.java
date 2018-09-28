package <missing>;

public class GlobalMembers
{
	public static int trans(int[][] a, int n, int m)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * pi;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * pj;
		int i;
		int c;

	 if (n <= 4 && n >= 0 && m <= 4 && n >= 0)
	 {
	  pi = (a + n);
	  pj = (a + m);
	  for (i = 0;i < 5;i++)
	  {
		  c = pi;
	  *pi = pj;
	  *pj = c;
	  pi++;
	  pj++;
	  }
	  return 1;
	 }
	else
	{
		return 0;
	}
	}


	public static int Main()
	{
	 int[][] a = new int[5][5];
	 int n;
	 int m;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 int * p;
	 p = a;
	 for (n = 0;n < 5;n++)
	 {
		 for (m = 0;m < 5;m++)
		 {
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 p = Integer.parseInt(tempVar);
			 }
		  p++;
		 }
	 }
	p = a;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
		 if (trans(a, n, m) != 0)
		 {
			for (n = 0;n < 5;n++)
			{
			 for (m = 0;m < 4;m++)
			 {
				 System.out.printf("%d ",*p);
				 p++;
			 }
			 System.out.printf("%d\n",*p);
			 p++;

			}

		 }
		 else
		 {
			 System.out.print("error\n");
		 }
	}
}

