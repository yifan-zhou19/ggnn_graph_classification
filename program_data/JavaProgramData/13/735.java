package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20000];
		int i;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						// a[i]>=10&&a[i]<100;
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							a[i] = Integer.parseInt(tempVar2);
						}
						//a[i]>=10&&a[i]<100;
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
						for (j = 0;j < i;j++)
						{
										if (a[i] == a[j])
										{
										k = k + 1;
										}
						}
						if (k == 0)
						{
						System.out.printf(" %d",a[i]);
						}
						k = 0;

		}
		System.in.read();
		System.in.read();
	}


}

