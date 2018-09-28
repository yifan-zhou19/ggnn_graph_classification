package <missing>;

public class GlobalMembers
{
	public static int A;
	public static int B;
	public static int[] a = new int[40];
	public static int[] b = new int[40];

	public static void enter()
	{
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 A = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 B = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 a[1] = Integer.parseInt(tempVar3);
	 }
		for (i = 2;i <= A;i++)
		{
	  String tempVar4 = ConsoleInput.scanfRead(" ");
	  if (tempVar4 != null)
	  {
		  a[i] = Integer.parseInt(tempVar4);
	  }
		}
	 String tempVar5 = ConsoleInput.scanfRead();
	 if (tempVar5 != null)
	 {
		 b[1] = Integer.parseInt(tempVar5);
	 }
		for (i = 2;i <= B;i++)
		{
	  String tempVar6 = ConsoleInput.scanfRead(" ");
	  if (tempVar6 != null)
	  {
		  b[i] = Integer.parseInt(tempVar6);
	  }
		}
	}

	public static void array()
	{
	 int i;
	 int j;
	 int m;
	 for (i = 1;i <= A - 1;i++)
	 {
	  for (j = 1;j <= A - i;j++)
	  {
	   if (a[j] > a[j + 1])
	   {
					m = a[j];
		a[j] = a[j + 1];
		a[j + 1] = m;
	   }
	  }
	 }
	 for (i = 1;i <= B - 1;i++)
	 {
		 for (j = 1;j <= B - i;j++)
		 {
		  if (b[j] > b[j + 1])
		  {
					m = b[j];
			b[j] = b[j + 1];
		   b[j + 1] = m;
		  }
		 }
	 }
	}

	public static void connect()
	{
	 int i;
	 int j;
	 for (i = A + 1,j = 1;i <= A + B;i++,j++)
	 {
	  a[i] = b[j];
	 }
	}

	public static void print()
	{
	 int i;
	 System.out.printf("%d",a[1]);
	 for (i = 2;i <= A + B;i++)
	 {
	  System.out.printf(" %d",a[i]);
	 }
	}


	public static void Main()
	{
		enter();
		array();
	 connect();
	 print();
	}


}

