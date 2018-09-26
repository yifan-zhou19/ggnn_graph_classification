package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		int sum;
		int test;
		int i;
		int last;
		int j;
		int[] mon = new int[300];
		int num = 0;
		int count = 0;
		for (j = 1; ;j++)
		{
		 num = 0;
		 count = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 sum = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 test = Integer.parseInt(tempVar2);
	 }
	 if (sum == 0 && test == 0)
	 {
		 break;
	 }
	 for (i = 0;i < sum;i++)
	 {
			mon[i] = i + 1;
	 }
		while (num < sum)
		{
		   for (i = 0;i < sum;i++)
		   {
		   if (mon[i] != 0)
		   {
							  count = count + 1;
							  if (count == test)
							  {
									  num = num + 1;
									  if (num == sum)
									  {
									  last = mon[i];
									  }
									  mon[i] = 0;
									  count = 0;
							  }
		   }
		   }
		}
	   System.out.printf("%d\n",last);
		}
	  return 0;
	 }
}

