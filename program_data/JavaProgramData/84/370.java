package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int index;
		int k;
		int n;
		int temp;
	int[] a = new int[100];
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
	}
	for (k = 0;k < 2;k++)
	{
	 index = k;
	 for (i = k + 1;i < n;i++)
	 {
	 if (a[i] > a[index])
	 {
		 index = i;
	 }
	 }
	 temp = a[index];
	 a[index] = a[k];
	 a[k] = temp;
	}
	  System.out.printf("%d\n%d\n",a[0],a[1]);

	}

}

