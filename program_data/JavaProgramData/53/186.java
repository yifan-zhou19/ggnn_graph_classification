package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] c = new int[300];
		int n;
		int i;
		int j;
		int k;
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
		c[i] = Integer.parseInt(tempVar2);
	}
	}
	System.out.printf("%d",c[0]);
	for (i = 1;i < n;i++)
	{
		  k = 0;
	for (j = 0;j < i;j++)
	{
	if (c[i] != c[j])
	{
		k++;
	}
	}
	if (k == i)
	{
	System.out.printf(",%d",c[i]);
	}
	}
	}


}

