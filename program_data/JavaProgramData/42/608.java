package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100000];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int n;
		int i;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p1;
		int num = 0;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = a;p < a + n;p++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   p = Integer.parseInt(tempVar2);
		   }
		}
		scanf("\n");
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (p = a;p < a + n;p++)
		{
		   if (*p == k)
		   {
			   p1 = p;
			   t = 0;
			   while (*p1 == k)
			   {
				   p1++;
				   num++;
				   t++;
			   }
			   for (i = 0;p + i < a + n;i++)
			   {
			   *(p + i) = *(p1 + i);
			   }
		   }
		}
		n -= num;
		for (p = a;p < a + n - 1;p++)
		{
		   System.out.printf("%d ",*p);
		}
		System.out.printf("%d\n",*p);
	}
}

