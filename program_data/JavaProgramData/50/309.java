package <missing>;

public class GlobalMembers
{
	public static int count(int month)
	{
		int[] c = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int answer = 0;
		for (i = 0;i < month;i++)
		{
		answer += c[i];
		}
		answer += 13;
		return (answer);
	}
	public static void Main()
	{
		int t;
		int w;
		int[] a = new int[13];
		int i;
		int[] b = new int[13];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 12;i++)
		{
			a[i] = count(i);
			a[i] -= 1;
		}
		t = 7 - w;
		for (i = 1;i <= 12;i++)
		{
			b[i] = (a[i] - t) % 7;
		}
		for (i = 1;i <= 12;i++)
		{
			if (b[i] == 5)
			{
				System.out.printf("%d\n",i);
			}
		}
	}

}

