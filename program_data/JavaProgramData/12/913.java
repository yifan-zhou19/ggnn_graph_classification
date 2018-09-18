package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n = 0;
	int[] a = new int[16];
	int i = 0;
	int count = 0;
	for (;;n++)
	{
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a[n] = Integer.parseInt(tempVar);
	 }
	 if (a[n] == 0)
	 {
	  System.out.printf("%d\n",count);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	  memset(a,0,(Integer.SIZE / Byte.SIZE));
	  n = 0;
	  count = 0;
	 }
	 if (a[n] == -1)
	 {
	  break;
	 }
	 int ifOdd = a[n] % 2;
	 for (i = 0;i < n;++i)
	 {
	  if (ifOdd == 0)
	  {
	   if (a[i] == a[n] / 2)
	   {
		count++;
	   }
	  }
	  if (a[i] == a[n] * 2)
	  {
		count++;
	  }
	 }
	}
	}
}

