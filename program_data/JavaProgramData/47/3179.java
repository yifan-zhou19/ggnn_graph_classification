package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int j;
		int m;
		int temp;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,*q;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		for (j = 0;j < n / 2;j++)
		{
		  p = a[j];
	  q = a[n - 1 - j];
	   temp = p;
	   p = q;
	   q = temp;

		}

		for (m = 0;m < n - 1;m++)
		{
		   System.out.printf("%d ",a[m]);
		}
	 System.out.printf("%d",a[n - 1]);
		return 0;
	}
}

