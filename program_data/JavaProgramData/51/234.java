package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int flag;
		int i;
		int max;
	 String x = new String(new char[501]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * q;
	 int[] y = new int[500];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 int * o;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 int * r;
	 for (o = y;o < y + 499;o++)
	 {
		 *o = 1;
	 }
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 x = new Scanner(System.in).nextLine();
	 for (p = x,o = y;p < x + x.length();p++,o++)
	 {
			 if (*o == -1)
			 {
			 continue;
			 }
		  for (q = p + 1,r = o + 1;q <= x + x.length() - n;q++,r++)
		  {
				 for (flag = 1,i = 0;i < n;i++)
				 {
				  if (*(p + i) != *(q + i))
				  {
					  flag = 0;
					  break;
				  }
				 }
			  if (flag == 1)
			  {
					  *o = o + 1;
					  *(r) = -1;
			  }
		  }
	 }
	 for (max = 0,o = y;o < y + x.length() - n;o++)
	 {
		 if (*o > max)
		 {
			 max = o;
		 }
	 }
	 if (max == 1)
	 {
		 System.out.print("NO");
	 }
	 else
	 {
		 System.out.printf("%d\n",max);
		  for (p = x,o = y;o < y + x.length() - n;o++,p++)
		  {
			 if (*o == max)
			 {
					 for (i = 0;i < n;i++)
					 {
					  System.out.printf("%c",*(p + i));
					 }
				   System.out.print("\n");
			 }
		  }
	 }
	}
}

