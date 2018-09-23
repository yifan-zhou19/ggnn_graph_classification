package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int k;
	 int l;
	 int s;
	 int m;
	 int[] a = new int[10000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,*p1,*p2,*p3;
	 int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1;
	 int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
	 int p2;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p3;
	 int p3;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 p = a;
	 for (l = 0;l < n;l++)
	 {
	  for (i = 0;i < n;i++)
	  {
		  p1 = p + 100 * i;
	   for (j = 0;j < n;j++)
	   {
		   p2 = p1 + j;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p2 = Integer.parseInt(tempVar2);
		}
	   }
	  }
	  s = 0;
	  for (k = 0;k < n - 1;k++)
	  {
		  for (i = 0;i < n;i++)
		  {
		   p1 = p + i * 100;
		m = p1;
		for (j = 0;j < n;j++)
		{
			p2 = p1 + j;
		 if (j > k)
		 {
		  if (p2 < m)
		  {
			  m = p2;
		  }
		 }
		}
		for (j = 0;j < n;j++)
		{
			p2 = p1 + j;
		 p2 = p2 - m;
		}
		  }
	   for (i = 0;i < n;i++)
	   {
		   p1 = p + i;
		m = p1;
		for (j = 0;j < n;j++)
		{
			p2 = p1 + j * 100;
		 if (j > k)
		 {
		  if (p2 < m)
		  {
			  m = p2;
		  }
		 }
		}
		for (j = 0;j < n;j++)
		{
			p2 = p1 + j * 100;
		 p2 = p2 - m;
		}
	   }
	   s = s + *(p + 101 * (k + 1));
	  }
	  System.out.printf("%d\n",s);
	 }



	}


}

