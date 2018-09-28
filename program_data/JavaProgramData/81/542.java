package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] array = new int[5][5];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * p;
	for (p = array[0];p < array[0] + 25;p++)
	{
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  p = Integer.parseInt(tempVar);
	  }
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
	if (m < 0 || m>4 || n < 0 || n>4)
	{
		System.out.print("error");
		return 0;
	}
	int i;
	int t;
	for (i = 0;i < 5;i++)
	{
			t = array[m][i];
			array[m][i] = array[n][i];
			array[n][i] = t;
	}

	for (p = array[0];p < array[0] + 25;p++)
	{
		 if ((p + 1 - array[0]) % 5 == 0)
		 {
			 System.out.printf("%d\n",*p);
		 }
		 else
		 {
			 System.out.printf("%d ",*p);
		 }
	}
	}

}

