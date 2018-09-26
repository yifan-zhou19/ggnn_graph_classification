package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int t = 0;
		int[] a = new int[400];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		 for (i = 2;i <= n;i++)
		 {
			 for (j = 1;j < i;j++)
			 {
			if (a[i] == a[j])
			{
				a[i] = -999999;
			}
			 }



		 }
		 for (i = 1;i <= n;i++)
		 {
		if (a[i] != -999999)
		{
			t = i;
		}
		 }
		  for (i = 1;i < t;i++)
		  {
			if (a[i] != -999999)
			{
				System.out.printf("%d,",a[i]);
			}
		  }
			System.out.printf("%d",a[t]);

	}

}

