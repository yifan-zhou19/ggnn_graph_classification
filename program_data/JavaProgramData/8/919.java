public class nums
{
	public int m;
 public int n;
 public int[][] x = new int[2][100];
}

package <missing>;

public class GlobalMembers
{
	public static nums get()
	{
		int i;
	 nums in = new nums();
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 in.m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 in.n = Integer.parseInt(tempVar2);
	 }
	 System.in.read();
	 for (i = 0;i < in.m;i++)
	 {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 in.x[0][i] = Integer.parseInt(tempVar3);
		 }
	 }
	 for (i = 0;i < in.n;i++)
	 {
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 in.x[1][i] = Integer.parseInt(tempVar4);
		 }
	 }

	return in;
	}
	public static nums bubble(nums in)
	{
		int i;
		int j;
		int c;
	 for (i = 1;i <= in.m;i++)
	 {
		 for (j = 0;j < in.m - 1;j++)
		 {
			 if (in.x[0][j] > in.x[0][j + 1])
			 {
				 c = in.x[0][j];
			  in.x[0][j] = in.x[0][j + 1];
			  in.x[0][j + 1] = c;
			 }
		 }
	 }
	  for (i = 1;i <= in.n;i++)
	  {
		 for (j = 0;j < in.n - 1;j++)
		 {
			 if (in.x[1][j] > in.x[1][j + 1])
			 {
				 c = in.x[1][j];
			  in.x[1][j] = in.x[1][j + 1];
			  in.x[1][j + 1] = c;
			 }
		 }
	  }
	return in;
	}
	public static nums combine(nums in)
	{
		int i;
	 for (i = in.m;i < in.m + in.n;i++)
	 {
		 in.x[0][i] = in.x[1][i - in.m];
	 }
	 return in;
	}
	public static void put(nums in)
	{
		int i;
	 System.out.printf("%d",in.x[0][0]);
	 for (i = 1;i < in.m + in.n;i++)
	 {
		 System.out.printf(" %d",in.x[0][i]);
	 }
	}
	public static void Main()
	{
		nums in = get();
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to contain a copy constructor call - this should be verified and a copy constructor should be created:
//ORIGINAL LINE: struct nums ina=bubble(in);
	 nums ina = bubble(new nums(in));
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to contain a copy constructor call - this should be verified and a copy constructor should be created:
//ORIGINAL LINE: struct nums inb=combine(ina);
	 nums inb = combine(new nums(ina));
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to contain a copy constructor call - this should be verified and a copy constructor should be created:
//ORIGINAL LINE: put(inb);
	 put(new nums(inb));
	}
}

