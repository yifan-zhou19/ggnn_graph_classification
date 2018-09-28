package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] enter = new int[1000];
		int[] leave = new int[1000];
		int i;
		int j = 0;
		int e = 0;
		int l = 0;
		char c;
		int[] ans = new int[1000];
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				enter[e] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			e++;
		}while (c == ',');
		do
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				leave[l] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
			l++;
		}while (c == ',');
		System.out.printf("%d",l);
		int start = enter[0];
		int end = leave[0];
		for (j = 1;j < l;j++)
		{
			if (start > enter[j])
			{
				start = enter[j];
			}
			if (end < leave[j])
			{
				end = leave[j];
			}
		}
		for (i = start;i < end;i++)
		{
			for (j = 0;j < l;j++)
			{
				if (enter[j] <= i != 0 && leave[j]> i)
				{
					ans[i]++;
				}
			}
		}
		int m = ans[start];
		for (j = start;j < end;j++)
		{
			if (m < ans[j])
			{
				m = ans[j];
			}
		}
		System.out.printf(" %d",m);
	}


}

