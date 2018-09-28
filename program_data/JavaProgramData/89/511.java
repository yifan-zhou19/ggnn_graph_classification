package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int num;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int famous;
		famous = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (k = 0;k < num;k++)
		{
		a[k] = 0;
		b[k] = 0;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			j = Integer.parseInt(tempVar3);
		}
		while (i != 0 || j != 0)
		{
		  a[i] = a[i] + 1;
		  b[j] = b[j] + 1;
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  i = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ");
		  if (tempVar5 != null)
		  {
			  j = Integer.parseInt(tempVar5);
		  }
		}
		 for (k = 0;k < num;k++)
		 {
		   if (a[k] == 0 && b[k] == num - 1)
		   {
		   System.out.printf("%d",k);
		   famous++;
		   }
		 }
		 if (famous == 0)
		 {
		 System.out.print("NOT FOUND");
		 }


	}

}

