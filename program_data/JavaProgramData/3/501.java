package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int k;
	 int m;
	 int[] a = new int[1000];
	 int i;
	 int j;
	 int flag = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
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
		m = a[i] + a[j];
	 if (m == k)
	 {
	 flag = 1;
	 }
	 else
	 {
		 continue;
	 }
	 break;
	}
	}
	if (flag == 0)
	{
	System.out.print("no");
	}
	else if (flag == 1)
	{
	System.out.print("yes");
	}
	}
}

