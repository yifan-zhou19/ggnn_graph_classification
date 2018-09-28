package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k = 0;
		int[] a = new int[200];
		int[] b = new int[200];
		int i;
		int j;
		int[] s = new int[200];
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < n;j++)
		{
		 for (i = j;i < n;i++)
		 {
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				k++;
			}
			else
			{
				break;
			}
		 }
			s[j] = k;
			k = 0;
		}
		int x = 0;
		for (i = 0;i < n;i++)
		{
			if (s[i] > x)
			{
				x = s[i];
			}
		}
		System.out.printf("%d",x);
		return 0;
	}
}

