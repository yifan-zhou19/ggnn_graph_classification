package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int j;
	int i;
	int x;
	int y;
	int a;
	int m;
	int[] n = new int[100];

	float sum = 0F;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= m;i++)
	{
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n[i] = Integer.parseInt(tempVar2);
	  }
	}
	for (i = 1;i <= m;i++)
	{
		sum = 0F;
	   x = 2;
	   y = 1;
		for (j = 1;j <= n[i];j++)
		{
		   sum += (float)(x) / (float)(y);
		   a = x;
		   x = x + y;
		   y = a;
		}
		System.out.printf("%.3f", sum);
		System.out.print("\n");

	}

	return 0;
	}
}

