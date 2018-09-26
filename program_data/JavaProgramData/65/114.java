package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[200];
	int[] b = new int[200];
	for (int i = 0;i < n;i++)
	{
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 a[i] = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 b[i] = Integer.parseInt(tempVar3);
	 }
	}
	int sa = 0;
	int sb = 0;
	for (int k = 0;k < n;k++)
	{
		if ((a[k] == 0 && b[k] == 1) || (a[k] == 1 && b[k] == 2) || (a[k] == 2 && b[k] == 0))
		{
		 sa++;
		}
		else if ((a[k] == 1 && b[k] == 0) || (a[k] == 2 && b[k] == 1) || (a[k] == 0 && b[k] == 2))
		{
			sb++;
		}
	}
	if (sa > sb)
	{
	 System.out.print("A");
	}
	else if (sa < sb)
	{
	  System.out.print("B");
	}
	else
	{
		System.out.print("Tie");
	}
	return 0;
	}
}

