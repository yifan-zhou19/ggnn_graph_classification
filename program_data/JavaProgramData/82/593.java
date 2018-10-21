package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		int a;
		int s = 0;
		int i = 1;
		int u = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
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
		 if (x <= 140 && x >= 90 && y <= 90 && y >= 60)
		 {
		  s++;
		 }
		   if (s > u)
		   {
		   u = s;
		   }
		  if (x > 140 || x < 90 || y>90 || y < 60)
		  {
		   s = 0;
		  }
		   i++;
		}
		  System.out.printf("%d",u);
		  return 0;
	}
}

