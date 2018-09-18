package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[9000];
		int[] ans = new int[9000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int num = 1;
		int t = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		ans[0] = a[0];
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							a[i] = Integer.parseInt(tempVar3);
						}
						int j = 0;
						while (j < num)
						{
									if (a[i] == ans[j])
									{
													 t = 1;
													 break;
									}
									j++;
						}
						if (t == 0)
						{
								 ans[num] = a[i];
								 System.out.printf(" %d",ans[num]);
								 num++;
						}
						else
						{
							t = 0;
						}
		}
		System.in.read();
		System.in.read();
		System.in.read();
	}



}

