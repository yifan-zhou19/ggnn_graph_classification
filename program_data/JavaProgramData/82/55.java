package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int n;
		int i;
		int j;
		int k;
		int h;
		int max;
		int[] l = new int[100];
		h = 0;
		max = 0;
		for (i = 0;i < 100;i++)
		{
			l[i] = 0;
		}
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
				j = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				k = Integer.parseInt(tempVar3);
			}
		   if (j >= 90 && j <= 140 && k >= 60 && k <= 90)
		   {
			   h++;
		   l[i] = h;
		   }
		   else
		   {
			   h = 0;
		   }
		}
		for (i = 0;i < 100;i++)
		{
			if (l[i] > l[max])
			{
				max = i;
			}
		}
		System.out.printf("%d",l[max]);
		return 0;
	}

}

