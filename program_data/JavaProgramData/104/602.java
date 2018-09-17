package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] x = new int[10];
	int[] y = new int[10];
	int a;
	int b;
	int i;
	int j;
	int k;
	int t;
	int m;
	int s = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	for (i = 1,x[0] = a;x[i - 1] != 1;i++)
	{
		x[i] = x[i - 1] / 2;
	}
	k = i;
	for (i = 1,y[0] = b;y[i - 1] != 1;i++)
	{
		y[i] = y[i - 1] / 2;
	}
	t = i;
	for (i = 0;i < k;i++)
	{
		for (j = 0;j < t;j++)
		{
			 if (x[i] == y[j])
			 {
				  System.out.printf("%d",x[i]);
				  s = 1;
				  break;
			 }
		}
	   if (s == 1)
	   {
		   break;
	   }
	}
	return 0;
	}
}

