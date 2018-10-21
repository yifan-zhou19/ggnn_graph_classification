package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[10];
	int[] b = new int[10];
	int[] c = new int[10];
	int num1;
	int num2;
	int[] m = new int[50];
	int[] l = new int[50];
	double[] d = new double[50];
	double temp;
	double distance;
	int i;
	int j;
	int k = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
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
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		c[i] = Integer.parseInt(tempVar4);
	}
	}
	for (i = 0;i < n - 1;i++)
	{
		for (j = i + 1;j < n;j++)
		{
		 distance = Math.sqrt(Math.pow((a[i] - a[j]),2) + Math.pow((b[i] - b[j]),2) + Math.pow((c[i] - c[j]),2));
		 d[k] = distance;
		 m[k] = i;
		 l[k] = j;
		 k++;
		}

	}
	for (i = 1;i <= n * (n - 1) / 2;i++)
	{
		for (j = 0;j < n * (n - 1) / 2 - i;j++)
		{
			if (d[j] < d[j + 1])
			{
			 temp = d[j];
			 d[j] = d[j + 1];
			 d[j + 1] = temp;
			 num1 = m[j];
			 m[j] = m[j + 1];
			 m[j + 1] = num1;
			 num2 = l[j];
			 l[j] = l[j + 1];
			 l[j + 1] = num2;
			}
		}
	}
	for (i = 0;i < n * (n - 1) / 2;i++)
	{
	System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[m[i]],b[m[i]],c[m[i]],a[l[i]],b[l[i]],c[l[i]],d[i]);
	}
	return 0;
	}



}

