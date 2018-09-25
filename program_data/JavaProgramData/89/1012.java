package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int y;
		int t = 0;
		int[] num = new int[10000];
		for (i = 0;i < 1000;i++)
		{
		 num[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   x = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   y = Integer.parseInt(tempVar3);
		   }
		  if (x == 0 && y == 0)
		  {
			  break;
		  }
		  num[x]++;
		  num[y]++;
		}
		for (i = 0;i < n;i++)
		{
		 if (num[i] == n - 1)
		 {
		 t = 1;
		 break;
		 }
		}
		 if (t == 0)
		 {
			 System.out.print("NOT FOUND");
		 }
		 else
		 {
			 System.out.printf("%d",i);
		 }
	   return 0;
	}
}

