package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[6];
	 int sum;
	 int i;
	 int j = 0;
	 int m;
	 do
	 {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a[0] = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[1] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   a[2] = Integer.parseInt(tempVar3);
		   }
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   a[3] = Integer.parseInt(tempVar4);
		   }
		   String tempVar5 = ConsoleInput.scanfRead();
		   if (tempVar5 != null)
		   {
			   a[4] = Integer.parseInt(tempVar5);
		   }
		   String tempVar6 = ConsoleInput.scanfRead();
		   if (tempVar6 != null)
		   {
			   a[5] = Integer.parseInt(tempVar6);
		   }
		   a[3] = a[3] + 12;
		   sum = (a[3] - a[0] - 1) * 3600 + (60 - a[1] - 1 + a[4]) * 60 + 60 - a[2] + a[5];
		   if (a[0] == 0)
		   {
			 return 0;
		   }
		   else
		   {
			 System.out.printf("%d\n",sum);
		   }
	 } while (a[0] != 0);

	 return 0;

	}
}

