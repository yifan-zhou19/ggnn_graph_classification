package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t = 0;
		int[] a = new int[20000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[1] = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",a[1]);
		for (i = 2;i <= n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		for (j = 1;j < i;j++)
		{
		t = 0;
		if (a[i] == a[j])
		{
		t = 1;
		break;
		}
		}
		if (t == 0)
		{
		System.out.printf(" %d",a[i]);
		}
		}
		  return 0;
	}

}

