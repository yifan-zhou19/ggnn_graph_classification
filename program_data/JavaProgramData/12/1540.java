package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int num;
	 int s;
	 int[] a = new int[101];
	 while (true)
	 {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   s = Integer.parseInt(tempVar);
	   }
	   if (s == -1)
	   {
		   break;
	   }
	   num = 0;
	   for (i = 0;i < 101;i++)
	   {
		 a[i] = 0;
	   }
	   a[s] = 1;
	   while (scanf("%d", s) == 1 && s != 0)
	   {
		 a[s] = 1;
	   }
	   for (i = 0;i < 50;i++)
	   {
		if (a[i] == 1 && a[2 * i] == 1)
		{
		 num++;
		}
	   }
		 System.out.printf("%d\n",num);
	 }
	  return 0;
	}
}

