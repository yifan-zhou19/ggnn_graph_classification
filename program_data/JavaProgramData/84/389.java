package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] a = new int[100];
		int i;
		int j;
		int h;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
			 for (i = 0; i < 100; i++)
			 {
				 a[i] = 0;
			 }
		for (i = 0;i < h;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j < h;j++)
		{
			for (i = 0;i < h - j;i++)
			{
				if (a[i] < a[i + 1])
				{
				 t = a[i];
				 a[i] = a[i + 1];
				 a[i + 1] = t;
				}
			}
		}
		for (i = 0;i < 2;i++)
		{
		System.out.printf("%d\n",a[i]);
		}
	}


}

