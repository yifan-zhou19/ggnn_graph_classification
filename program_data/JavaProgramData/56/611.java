package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[5];
	int i;
	for (i = 0;i <= 4;i++)
	{
	a[i] = '0';
	}
	String tempVar = ConsoleInput.scanfRead(null, 1);
	if (tempVar != null)
	{
		a[4] = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(null, 1);
	if (tempVar2 != null)
	{
		a[3] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(null, 1);
	if (tempVar3 != null)
	{
		a[2] = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(null, 1);
	if (tempVar4 != null)
	{
		a[1] = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(null, 1);
	if (tempVar5 != null)
	{
		a[0] = Integer.parseInt(tempVar5);
	}
	for (i = 0;i <= 4;i++)
	{
	if ((a[i] >= '1') && (a[i] <= '9'))
	{
	System.out.printf("%c",a[i]);
	}
	}
	}
}

