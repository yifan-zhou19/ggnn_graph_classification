package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20000];
		int n = 0;
		int i = 0;
		int j = 0;
		int c = 0;

		for (i = 0;i < 20000;i++)
		{
			a[i] = 0;
		}

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;i < n;i++)
		{
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   a[i] = Integer.parseInt(tempVar3);
		   }
		}

		System.out.printf("%d",a[0]);

		for (i = 1;i < n;i++)
		{
			c = 0;
			for (j = 0;j < i;j++)
			{
			if (a[j] == a[i])
			{
				c = 1;
			}
			}
			if (c == 0)
			{
				System.out.printf(" %d",a[i]);
			}
		}
	}

}

