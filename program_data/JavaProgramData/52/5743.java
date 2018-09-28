package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[100];
	int b;
	int c;
	int i;
	int j;
	int temp;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		b = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		c = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < b;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < b - c;i++)
	{
	temp = a[0];
	for (j = 0;j < b - 1;j++)
	{
	a[j] = a[j + 1];
	}
	a[j] = temp;
	}
	System.out.print(a[0]);
	for (i = 1;i < b;i++)
	{
	System.out.print(" ");
	System.out.print(a[i]);
	}
	System.out.print("\n");
	return 0;
	}
}

