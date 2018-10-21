public class z
{
	   public int g;
	   public int h;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int w;
		z[] a = tangible.Arrays.initializeWithDefaultzInstances(50);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].g = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < k;i++)
		{
			a[i].h = 1;
		}
		for (i = k - 2;i >= 0;i--)
		{
			for (j = i + 1;j < k;j++)
			{
				 if (a[i].g >= a[j].g)
				 {
					 if (a[i].h < a[j].h + 1)
					 {
					  a[i].h = a[j].h + 1;
					 }
				 }
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			for (j = i + 1;j < k;j++)
			{
				if (a[i].h < a[j].h)
				{
				   w = a[i].h;
				   a[i].h = a[j].h;
				   a[j].h = w;
				}
			}
		}
		System.out.printf("%d\n",a[0].h);
		//getchar();
		//getchar();
		return 0;
	}

}

