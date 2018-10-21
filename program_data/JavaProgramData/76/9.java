package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] a = new int[100];
	int[] b = new int[100];
	int min = 10000;
	int max = 0;
	int flag;
	float j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
	}
	for (i = 1;i <= n;i++)
	{
		if (a[i] < min)
		{
			min = a[i];
		}
	}
	for (i = 1;i <= n;i++)
	{
		if (b[i] > max)
		{
			max = b[i];
		}
	}
	for (j = min;j <= max;j = j + 0.5)
	{
	   flag = 0;
	   for (i = 1;i <= n;i++)
	   {
		 if (j >= a[i] != 0 && j <= b[i])
		 {
			 flag = 1;
		 break;
		 }
	   }
		 if (flag != 1)
		 {
			 break;
		 }
	}
	if (flag == 1)
	{
		System.out.printf("%d %d",min,max);
	}
	else
	{
		System.out.print("no");
	}
	}

}

