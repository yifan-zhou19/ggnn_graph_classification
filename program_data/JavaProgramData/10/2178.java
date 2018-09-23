package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	int max = 0;
	int maxb = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[n];
	int[] b = new int[n];

	for (i = (n - 1);i >= 0;i--)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	b[0] = 1;

	for (i = 1;i <= (n - 1);i++)
	{
		max = 0;
	//printf("max=%d",max);
		for (j = 0;j <= (i - 1);j++)
		{
		if (a[i] >= a[j] != 0 && b[j] > max)
		{
	   // printf("a[%d]>=a[j] is %d > %d",i,j,a[i],a[j]);
		max = b[j];
	   //printf("max=%d",max);
		}
		}
		b[i] = max + 1;
	   // printf("max=%d",max);
		//printf("b[%d]=%d\n",i,b[i]);  
	}

	for (i = 1;i <= (n - 1);i++)
	{
		 if (b[i] > maxb)
		 {
		 maxb = b[i];
		 }
	}
	System.out.printf("%d",maxb);

	}

}

