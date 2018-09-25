package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20000];
		int t;
		int j;
		int m;
		int i;
		int asd;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			t = 1;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		if (i == 0)
		{
			System.out.printf("%d",a[i]);
		}
		else if (i != 0)
		{
		for (j = 0;j < i;j++)
		{
			asd = a[i] - a[j];
		if (asd == 0)
		{
			t = 0;
		break;
		}
		}
		if (t == 1)
		{
			System.out.printf(" %d",a[i]);
		}

		}
		}

		System.out.print("\n");
		return 0;
	}

}

