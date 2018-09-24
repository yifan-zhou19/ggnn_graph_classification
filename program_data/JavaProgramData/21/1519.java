package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float temp;
		float aver;
		int[] b = new int[300];
		int c;
		int d;
		int j;
		int s = 0;
		int i;
		int n;
		int[] a = new int[300];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i <= n - 1;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 0;i <= n - 1;i++)
	{
	s = s + a[i];
	}
	for (i = 0;i <= n - 1;i++)
	{
		a[i] = a[i] * n;
		b[i] = Math.abs(a[i] - s);
	}
	for (i = 0;i <= n - 2;i++)
	{
	   for (j = i + 1;j <= n - 1;j++)
	   {
		   if (b[i] <= b[j])
		   {
			   temp = b[i];
			   b[i] = b[j];
			   b[j] = temp;
		   }
	   }
	}
	c = (s - b[0]) / n;
	d = (s + b[0]) / n;
	   if (b[0] == b[1])
	   {
	System.out.printf("%d,%d",c,d);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	goto end;
	   }
	else
	{
		for (i = 0;i <= n - 1;i++)
		{
		a[i] = a[i] / n;
	if (a[i] == c)
	{
		System.out.printf("%d",c);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto end;
	}
		}
	}
	System.out.printf("%d",d);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		i = Integer.parseInt(tempVar3);
	}
	}
}

