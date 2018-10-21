package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		int max;
		int sec;
		max = a[0];
		sec = a[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		 if (a[i] < max && a[i]> sec)
		 {
				sec = a[i];
		 }
		}
		System.out.printf("%d\n%d\n",max,sec);
	}

}

