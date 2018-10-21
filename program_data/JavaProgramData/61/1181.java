package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100];
		int f1;
		int f2;
		int i;
		int t;
		int j;
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
		for (i = 0;i < n;i++)
		{
			f1 = 1;
			f2 = 1;
			for (j = 2;j < a[i];j++)
			{
				t = f1;
				f1 = f2;
				f2 = f2 + t;
			}
		System.out.printf("%d\n",f2);
		}

	}
}

