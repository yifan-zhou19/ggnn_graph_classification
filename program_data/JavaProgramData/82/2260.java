package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a;
	 int b;
	 int max = 0;
	 int t = 0;
	 int n;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i < n;i++)
	 {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
		{
			t++;
		}
		else
		{
			if (t >= max)
			{
				max = t;
			}
			t = 0;
		}
	 }
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 a = Integer.parseInt(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead(" ");
	 if (tempVar5 != null)
	 {
		 b = Integer.parseInt(tempVar5);
	 }
	 if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
	 {
		 t++;
	 }
	 if (t >= max)
	 {
		 max = t;
	 }
	  System.out.printf("%d",max);
	 return 0;
	}

}

