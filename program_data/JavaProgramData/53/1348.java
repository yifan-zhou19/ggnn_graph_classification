package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int l;
		int t;
		int[] a = new int[100];
		int[] b = new int[100];
		t = 0;
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
		b[0] = a[0];
		k = 0;
		for (i = 0;i < n;i++)
		{
			t = 0;
			for (l = 0;l < k + 1;l++)
			{
				if (a[i] == b[l])
				{
					t = 1;
					break;
				}
			}
		  if (t == 0)
		  {
				   k++;
				   b[k] = a[i];
		  }
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d,",b[i]);
		}
					  System.out.printf("%d",b[k]);
	   return 0;
	}
}

