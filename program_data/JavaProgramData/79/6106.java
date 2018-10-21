package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		int[] q = new int[100];
		int t;
		int r;
		int[] n = new int[100];
		int[] m = new int[100];
		int[] num = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
	for (t = 0;t < 100;t++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[t] = Integer.parseInt(tempVar);
		}
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  m[t] = Integer.parseInt(tempVar2);
	  }
	 if (n[t] == 0 && m[t] == 0)
	 {
	  break;
	 }
	}

	for (r = 0;r < t;r++)
	{
		p = num;
	 for (i = 0;i < n[r];i++)
	 {
	 *(p + i) = i + 1;
	 }
	  i = 0;
	  k = 0;
	  q[r] = 0;
	 while (q[r] < (n[r] - 1))
	 {
		  if (*(p + i) != 0)
		  {
		  k++;
		  }
	   if (k == m[r])
	   {
		   *(p + i) = 0;
		k = 0;
		q[r]++;
	   }
		i++;
		if (i == n[r])
		{
		i = 0;
		}
	 }
	while (p == 0)
	{
	p++;
	}
	System.out.printf("%d\n", p);
	}
	}

}

