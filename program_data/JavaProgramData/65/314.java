package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[200];
	int[] b = new int[200];
	int result = 0;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
	}
	for (i = 0;i < n;i++)
	{
			if (a[i] - b[i] == -1 || a[i] - b[i] == 2)
			{
				result = result + 1;
			}
			else if (a[i] - b[i] == 1 || a[i] - b[i] == -2)
			{
				result--;
			}
	}
	if (result > 0)
	{
		System.out.print("A");
	}
	if (result < 0)
	{
		System.out.print("B");
	}
	if (result == 0)
	{
		System.out.print("Tie");
	}
	}

}

