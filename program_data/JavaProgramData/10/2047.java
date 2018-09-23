package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	int[] a = new int[k];
	int i;
	int j;
	for (i = 0;i < k;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	int[] count = new int[30];
	int max;
	max = 0;
	for (i = k - 2;i >= 0;i--)
	{
	for (j = i + 1;j < k;j++)
	{
	if (a[j] <= a[i] != 0 && count[i] < count[j] + 1)
	{
	count[i] = count[j] + 1;
	}
	}
	}
	for (i = 0;i < k;i++)
	{
	if (max < count[i])
	{
	max = count[i];
	}
	}
	System.out.printf("%d",max + 1);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	free(a);
	return 0;
	}
}

