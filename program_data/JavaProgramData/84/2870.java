package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int e;
		int s;
		int b;
		int[] a = new int[100];
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
				for (j = 0;j < n - 1;j++)
				{
				 for (i = 0;i < n - 1 - j;i++)
				 {
				  if (a[i] > a[i + 1])
				  {
					e = a[i];
					a[i] = a[i + 1];
					a[i + 1] = e;
				  }
				 }
				}
				 s = a[n - 1];
				 b = a[n - 2];
				 System.out.printf("%d\n%d",s,b);
	}

}

