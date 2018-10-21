package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int jiaohuan = new int(int * p,int,int);
	 int[][] a = new int[5][5];
	 int n;
	 int m;
	 int i;
	 int c;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 int * p;
	 p = a[0];
	 for (i = 0;i < 25;i++,p++)
	 {

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  *p = Integer.parseInt(tempVar);
	  }
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 m = Integer.parseInt(tempVar3);
	 }
	 p = a[0];
 tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
	 c = jiaohuan(tempRef_p, n, m);
	 p = tempRef_p.argValue;

	 if (c == 0)
	 {
		 System.out.print("error");
	 }
	 else if (c == 1)
	 {
	  p = a[0];
	  for (i = 0;i < 25;i++,p++)


	  {
		  if (i % 5 == 0)
		  {
			  System.out.print("\n");
		  }
		  else
		  {
			  System.out.print(" ");
		  }
	  System.out.printf("%d",*p);
	  }

	 }

	 return 0;
	}
	public static int jiaohuan(tangible.RefObject<Integer> p, int n, int m)
	{
	 int t;
	 int i;
	 if (m < 5 && n < 5)
	 {
	  for (i = 0;i < 5;i++)
	  {
	  t = (p.argValue + n * 5 + i);
	  *(p.argValue + n * 5 + i) = *(p.argValue + m * 5 + i);
	  *(p.argValue + m * 5 + i) = t;
	  }
	  return 1;
	 }
	 else
	 {
		 return 0;
	 }
	}




}

