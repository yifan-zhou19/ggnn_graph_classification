package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int[] h = new int[100];
		int[] l = new int[100];
		int[] t = {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] len = new int[100];
		int j = 0;
		int max = 0;
		int r = 0;
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
				h[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				l[i] = Integer.parseInt(tempVar3);
			}
		}
		i = 0;
		while (h[i],l[i])
		{
			while (h[i] >= 90 && h[i] <= 140 && l[i] >= 60 && l[i] <= 90)
			{
				i++;
			}
			t[j + 1] = i;
			len[j] = t[j + 1] - t[j] - 1;
			j++;
			i++;
		}
		for (r = 0;r < j;r++)
		{
			if (len[max] < len[r])
			{
				max = r;
			}
		}
		System.out.printf("%d",len[max]);
		return 0;
	}
}

