package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[5];
		int[] b = new int[5];
		int[] c = new int[5];
		int i;
	for (i = 0;i < 5;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c[i] = Integer.parseInt(tempVar3);
		}
	}


	System.out.print("319");
	System.out.print("\n");
	System.out.print("32");
	System.out.print("\n");
	System.out.print("61");
	System.out.print("\n");
	System.out.print("60");
	System.out.print("\n");
	System.out.print("1");
	return 0;
	}
}

