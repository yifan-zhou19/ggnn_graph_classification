package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int[] num = new int[300];
	 int temp;
	 int flag = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 int * q;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 num[0] = Integer.parseInt(tempVar2);
	 }
	 for (p = num + 1;p < (num + n);p++)
	 {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  temp = Integer.parseInt(tempVar3);
	  }
	  for (q = num;q < p;q++)
	  {
	   if (temp == *q)
	   {
		flag = 1;
		break;
	   }
	  }
	  if (flag == 1)
	  {
	   p--;
	   n--;
	  }
	  else
	  {
		  *p = temp;
	  }
	  flag = 0;
	 }
	 System.out.printf("%d",num[0]);
	 for (p = num + 1;p < (num + n);p++)
	 {
		 System.out.printf(",%d",*p);
	 }
	}

}

