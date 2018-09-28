package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int s = 0;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100];
		int[] b = new int[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				t++;
			}
			else
			{
				if (s < t)
				{
					s = t;
				}
				t = 0;
			}
		}
		if (s < t)
		{
					s = t;
		}
		System.out.printf("%d",s);
	}

}

