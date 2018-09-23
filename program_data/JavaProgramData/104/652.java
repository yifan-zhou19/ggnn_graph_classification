package <missing>;

public class GlobalMembers
{
	public static int col(int x) //?
	{
	 int i;
	 for (i = 1;;i++)
	 {
		 if (x <= (Math.pow(2,i) - 1))
		 {
			 break;
		 }
	 }
	 return i;
	}
	public static int row(int x) //?
	{
	  int temp;
	  temp = col(x);
	  return x - Math.pow(2,temp - 1) + 1;
	}
	public static int Main()
	{
	 int a;
	 int b;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 b = Integer.parseInt(tempVar2);
	 }
	 int cola;
	 int rowa;
	 int colb;
	 int rowb;
	 cola = col(a);
	 rowa = row(a);
	 colb = col(b);
	 rowb = row(b);
	 if (cola > colb)
	 {
	  while (cola > colb)
	  {
	   cola--;
	   if (rowa % 2 == 0)
	   {
		   rowa = rowa / 2;
	   }
		else
		{
			rowa = (rowa + 1) / 2;
		}
	  }
	 }
	 if (cola < colb)
	 {
	  while (cola < colb)
	  {
	  colb--;
	   if (rowb % 2 == 0)
	   {
		   rowb = rowb / 2;
	   }
		else
		{
			rowb = (rowb + 1) / 2;
		}
	  }
	 }
	 while (rowa != rowb)
	 {
	  rowa = (rowa + 1) / 2;
	  rowb = (rowb + 1) / 2;
	  cola--;
	  colb--;
	 }
	 System.out.print(Math.pow(2,cola - 1) + rowa - 1);
	 return 0;
	}
}

