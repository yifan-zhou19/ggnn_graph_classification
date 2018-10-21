package <missing>;

public class GlobalMembers
{
	public static int[] bomb = new int[25];
	public static int p = 0;
	public static int k;
	public static int[] antibomb = new int[25];
	public static int j = 0;
	public static int[] answer = {0, 0};
	public static void makeanti(int[] bomb)
	{
		int i;
		int l;
		int r = 0;
		int aa;
		if (k == 0)
		{
			answer[1] = j;
			answer[0] = answer[0] > answer[1] != 0?answer[0]:answer[1];
		}
		else
		{
			for (i = 0;i < k;i++)
			{
				if (j == 0)
				{
					antibomb[j++] = bomb[i];
				}
				else if (bomb[i] <= antibomb[j - 1])
				{
					antibomb[j++] = bomb[i];
					r = 1;
				}
				else if (r == 0 && i == k - 1)
				{
					answer[1] = j;
				 answer[0] = answer[0] > answer[1] != 0?answer[0]:answer[1];
					continue;
				}
				else
				{
					continue;
				}
				k -= (i + 1);
				for (l = 0;l <= i;l++)
				{
					bomb++;
				}
				makeanti(bomb);
				j--;
				k += (i + 1);
				for (l = 0;l <= i;l++)
				{
					bomb--;
				}
			}
		}
	}
	public static void Main()
	{
		int i;
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
				bomb[i] = Integer.parseInt(tempVar2);
			}
		}
		makeanti(bomb);
		System.out.printf("%d",answer[0]);
		System.in.read();
		System.in.read();
	}

}

