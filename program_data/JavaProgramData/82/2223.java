package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int s;
		int h;
		int l;
		int n;
		int a;
		int e;
		int[] t = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = 0;

		for (i = 0;i < 100;i++)
		{
			t[i] = 0;
		}

		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				l = Integer.parseInt(tempVar3);
			}
			if ((h <= 140) && (h >= 90) && (l <= 90) && (l >= 60))
			{
				s++;
				t[i - 1] = s;
			}
			else
			{
				s = 0;
			}
		}

		for (i = 1;i < 100;i++)
		{
			for (j = 0;j < 100 - i;j++)
			{
				if (t[j] > t[j + 1])
				{
					e = t[j];
					t[j] = t[j + 1];
					t[j + 1] = e;
				}
			}
		}

		System.out.printf("%d\n",t[99]);
		return 0;
	}
}

