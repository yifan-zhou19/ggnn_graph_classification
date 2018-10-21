package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] arr = new int[1001];
		int[] left = new int[1001];
		int cnt;
		int i;
		int j;
		int k;
		while (scanf("%d", arr[0]) != EOF)
		{
			cnt = 1;
			char ch;
			while (scanf("%c", ch) != EOF && ch == ',')
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					arr[cnt] = Integer.parseInt(tempVar);
				}
				cnt++;
			}
			for (i = 0;i < cnt - 1;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					left[i] = Integer.parseInt(tempVar2);
				}
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				left[cnt - 1] = Integer.parseInt(tempVar3);
			}
			int min = arr[0];
			int max = left[0];
			for (i = 0;i < cnt;i++)
			{
				if (arr[i] < min)
				{
					min = arr[i];
				}
				if (left[i] > max)
				{
					max = left[i];
				}
			}
			int count = 0;
			int mcnt = 0;
			for (i = min;i <= max;i++)
			{
				count = 0;
				for (j = 0;j < cnt;j++)
				{
					if (arr[j] <= i != 0 && left[j]> i)
					{
						count++;
					}
				}
				if (count > mcnt)
				{
					mcnt = count;
				}
			}
			System.out.printf("%d %d\n",cnt,mcnt);
		}
	}
}

