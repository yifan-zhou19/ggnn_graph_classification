package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] num = new int[n + n];
	for (i = 0;i < (n + n);i = i + 2)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(num[i]) = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		(num[i + 1]) = Integer.parseInt(tempVar3);
	}
	}
	for (j = 0;j < (n + n);j = j + 2)
	{
	for (i = 0;i < (n + n);i = i + 2)
	{
	if (((num[j]) <= (num[i + 1])) && ((num[j + 1]) >= (num[i])))
	{
		num[j] = num[i] < num[j] != 0?num[i]:num[j];
	num[i] = num[i] < num[j] != 0?num[i]:num[j];
	num[j + 1] = num[i + 1] > num[j + 1] != 0?num[i + 1]:num[j + 1];
	num[i + 1] = num[i + 1] > num[j + 1] != 0?num[i + 1]:num[j + 1];
	}
	}
	}
	for (j = 0;j < (n + n);j = j + 2)
	{
	for (i = 0;i < (n + n);i = i + 2)
	{
	if (((num[j]) != (num[i])) || ((num[j + 1]) != (num[i + 1])))
	{
		System.out.print("no");
	return 0;
	}
	}
	}
	System.out.printf("%d %d",num[0],num[1]);
	return 0;
	}
}

