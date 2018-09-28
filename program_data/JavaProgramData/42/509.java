package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		int m;
		int i;
		int j;
		int flag;
		int[] a = new int[100001];
		p = a[0];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++,p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				*p = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		p = a[0];
		for (i = 0;i < n;i++,p++)
		{

		}

		m = n;
		p = a[0];
		for (i = 0;i <= n;i++,p++)
		{
			 if (p != a[0] && *(p - 1) == k)
			 {
			  p = p - 1;
			  i = i - 1;
			  j = j - 1;
			 }

			 if (*p == k)
			 {
			   q = p;
			   for (j = i;j < n;j++,q++)
			   {
					q = *(q + 1);


			   }

			   n = n - 1;




			 }


		}

		p = a[0];
		for (i = 0;i < n - 1;i++,p++)
		{
		 System.out.printf("%d ",*p);
		}
		System.out.printf("%d",*p);
	}

}

