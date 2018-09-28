package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100001];
		int n;
		int i;
		int j;
		int k;
		int d = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		p = a;

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
			   p + i = Integer.parseInt(tempVar2);
		   }
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
		   if (*(p + i) == k)
		   {
			   d++;
		   }
		}
		for (i = 0;i < n;i++)
		{
			   while (*(p + i) == k)
			   {
	   //test       d++;
			  for (j = i;j < n;j++)
			  {
				 *(p + j) = *(p + j + 1);
			  }
			   }
		}
		p = a;
		System.out.printf("%d", p);
		for (i = 1;i < n - d;i++)
		{
		   System.out.printf(" %d",*(p + i));
		}
	}

}

