package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20];
	int[] b = new int[20];
	int n1;
	int n2;
	int s;
	int i;
	int l1;
	int l2;
	int sum = new int(int n1,int n2,int a[],int l1,int b[],int l2);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n1 = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n2 = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < n1;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
	}
	for (i = 0;i < n2;i++)
	{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b[i] = Integer.parseInt(tempVar4);
		}
	}
	s = sum(n1, n2, a, l1, b, l2);
	System.out.printf("%d",a[0]);
	for (i = 1;i < n1;i++)
	{
	System.out.printf(" %d",a[i]);
	}
	for (i = 0;i < n2;i++)
	{
	System.out.printf(" %d",b[i]);
	}
	return 0;
	}
	public static int sum(int n1, int n2, int[] a, int l1, int[] b, int l2)
	{
		int i;
		int j;
		int temp;
	for (j = 1;j < n1;j++)
	{
		for (i = 0;i < n1 - j;i++)
		{
			if (a[i] > a[i + 1])
			{
				temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
		}
	}
	for (j = 1;j < n2;j++)
	{
		for (i = 0;i < n2 - j;i++)
		{
			if (b[i] > b[i + 1])
			{
				temp = b[i];
				b[i] = b[i + 1];
				b[i + 1] = temp;
			}
		}
	}
	return 0;
	}
}

