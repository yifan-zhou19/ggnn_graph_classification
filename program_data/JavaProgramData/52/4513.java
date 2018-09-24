package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	void change(int a[100],int n,int m);
	int[] a = new int[100];
	int n;
	int m;
	int i;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}

	change(a, n, m);
	for (i = 0;i < n - 1;i++)
	{
	System.out.printf("%d ",a[i]);
	}
	System.out.printf("%d",a[n - 1]);
	return 0;
	}



	public static void change(int[] a, int n, int m)
	{
		int i;
		int j;
		int temp;
		for (i = 0;i < m;i++)
		{
				temp = a[n - 1];
			for (j = 0;j < n;j++)
			{

				a[n - j - 1] = a[n - j - 2];
			}
			  a[0] = temp;
		}

	}
}

