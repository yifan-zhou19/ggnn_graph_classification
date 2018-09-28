package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] beg = new int[100];
		int[] end = new int[100];
		int[] ti = new int[100];
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				beg[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				end[i] = Integer.parseInt(tempVar3);
			}
		}
		for (int i = 0;i < n;i++)
		{
			if (beg[i] >= 90 && beg[i] <= 140 && end[i] >= 60 && end[i] <= 90)
			{
				ti[i] = 1;
			}
			for (int j = i + 1;j < n;j++)
			{
			if (beg[j] >= 90 && beg[j] <= 140 && end[j] >= 60 && end[j] <= 90)
			{
				ti[i]++;
			}
			else
			{
				break;
			}
			}
		}
		for (int i = 0;i < n;i++)
		{
			if (t < ti[i])
			{
				t = ti[i];
			}
		}
		System.out.printf("%d",t);
		return 0;
	}
}

