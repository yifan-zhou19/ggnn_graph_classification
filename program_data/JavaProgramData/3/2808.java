package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[MAX];
		int n;
		int k;
		int i;
		int j;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		s = a[1] + a[2];
		for (i = 0;i < n;i++)
		{
			if (s == k)
			{
				break;
			}
			else
			{
			for (j = 0;j < n;j++)
			{
			   s = a[i] + a[j];
			   if (s == k)
			   {
			   break;
			   }
			   else
			   {
			   s = s;
			   }
			}
			}
		}
		if (s == k)
		{
			System.out.print("yes");
		}
		else
		{
		System.out.print("no");
		}
		return 0;
	}

}

