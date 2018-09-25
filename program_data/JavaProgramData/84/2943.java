package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int max1 = 0;
		int max;
		int max2 = 0;
		int[] p;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   p = new int[n];
	   for (i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   p[i] = Integer.parseInt(tempVar2);
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   if (p[i] > max1)
		   {
			   max1 = p[i];
		   }
	   }
		max = max1;
		max1 = 0;
		for (i = 0;i < n;i++)
		{
			if (p[i] > max2 && p[i] != max)
			{
				max2 = p[i];
			}
		}
		System.out.printf("%d\n%d\n",max,max2);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);

	}
}

