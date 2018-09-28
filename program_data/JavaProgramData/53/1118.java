package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int k;
		char b = ',';
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
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
						 for (k = 0;k < i;k++)
						 {
										  if (a[k] == a[i])
										  {
											  break;
										  }
						 }
						 if (k == i)
						 {
							 System.out.printf("%c%d",b,a[i]);
						 }
		}
		return 0;
	}



}

