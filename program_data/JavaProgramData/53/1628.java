package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20000];
		int i = 1;
		int j;
		int f;
		int b;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			f = Integer.parseInt(tempVar2);
		}
		a[0] = f;
		for (;i < n;i++)
		{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 b = Integer.parseInt(tempVar3);
			 }
			 a[i] = b;
		}
		System.out.printf("%d",f);
		for (i = 0;i < n;i++)
		{
						for (j = i + 1;j < n;j++)
						{
										  if (a[i] == a[j])
										  {
										  a[j] = -1;
										  }
						}
		}
		for (i = 1;i < n;i++)
		{
						if (a[i] > 0)
						{
						System.out.printf(",%d",a[i]);
						}
		}

		return 0;
	}
}

