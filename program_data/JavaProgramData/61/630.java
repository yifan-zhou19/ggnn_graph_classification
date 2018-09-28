package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int t;
		a[0] = 1;
		a[1] = 1;
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
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 2;i < 99;i++)
		{
			a[i] = a[i - 1] + a[i - 2];
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == 1 || b[i] == 2)
			{
			   System.out.print("1\n");
			}
		   else
		   {
			   t = b[i] - 1;
		   System.out.printf("%d\n",a[t]);
		   }
		}
		return 0;
	}



}

