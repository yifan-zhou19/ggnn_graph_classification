package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[20];
		int n;
		int r = 0;
		int i;
		int j;
		int count = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(a,0,(Integer.SIZE / Byte.SIZE));
	  for (;;)
	  {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   if (n == -1)
		   {
			   break;
		   }
		  else if (n != 0)
		  {
			   a[r] = n;
			   r++;
			   continue;
		  }
		   else if (n == 0)
		   {

			   for (i = 0;i < r - 1;i++)
			   {
				   for (j = i + 1;j < r;j++)
				   {
					   if (a[i] == 2 * a[j] || a[j] == 2 * a[i])
					   {
				   count++;
					   }
				   }
				  a[i] = 0;
			   }
			   a[i] = 0;
			   System.out.printf("%d\n",count);
			   count = 0;
			   r = 0;
			   i = 0;
			   j = 0;
			   continue;
		   }
	  }
	}

}

