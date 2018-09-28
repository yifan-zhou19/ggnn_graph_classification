package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int i;
		int n;
		int k;
		int b = 0;
	int[] a = new int[1001];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
	}

	for (i = 0;i < n - 1;i++)
	{
	 for (j = i + 1;j < n;j++)
	 {
		 if (a[i] + a[j] == k)
		 {
		 b++;
		 break;
		 }
	 if (b != 0)
	 {
		 break;
	 }
	 }
	}

	 if (b == 0)
	 {
		 System.out.print("no");
	 }
	 else
	 {
	System.out.print("yes");
	 }
	}
}

