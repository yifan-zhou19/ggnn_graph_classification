package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int f;
		int[] brk = new int[100];
		int[] num = new int[100];
		int[] t = new int[100];
		int[] bkt = new int[10];

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
				brk[i] = Integer.parseInt(tempVar2);
			}
			if (brk[i] == 0)
			{
				num[i] = 60;
				continue;
			}
			num[i] = 0;
			t[i] = 0;
			f = 0;
			for (j = 0;j < brk[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					bkt[j] = Integer.parseInt(tempVar3);
				}
				if (f == 0)
				{
					t[i] += 3 + bkt[j];
					num[i] += bkt[j];
					if (j != 0)
					{
						t[i] -= bkt[j - 1];
						num[i] -= bkt[j - 1];
					}
					if (t[i] >= 63)
					{
						num[i] -= t[i] - 63;
						f = 1;
					}
					else if (t[i] >= 60)
					{
						f = 1;
					}
				}
			}
			if (t[i] < 60)
			{
				num[i] += 60 - t[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",num[i]);
		}

		return 0;
	}

}

