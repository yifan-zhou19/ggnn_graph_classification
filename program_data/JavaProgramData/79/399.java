package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int p = 1;
		int q = 1;
		for (i = 0; p != 0 && q != 0; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				q = Integer.parseInt(tempVar2);
			}
			a[i] = p;
			b[i] = q;
		};
		int j;
		int aa;
		int bb;
		int[] monkey = new int[500];
		for (j = 0; j < i - 1; j++)
		{
			aa = a[j];
			bb = b[j];
			int sum = 0;
			int ptr;
			int s = 0;
			for (ptr = 0; ptr < aa; ptr++)
			{
				monkey[ptr] = 1;
			}
			for (ptr = 1; sum < aa - 1; ptr = (ptr + 1) % aa)
			{
				if (monkey[ptr] == 1)
				{
					s++;
					if (s == bb)
					{
						monkey[ptr] = 0;
						sum++;
						s = 0;
					};
				};
			};
			int ans;
			for (ptr = 0; ptr < aa; ptr++)
			{
				if (monkey[ptr] == 1)
				{
					ans = ptr;
				}
			}
			if (ans == 0)
			{
				ans = aa;
			}
			System.out.printf("%d\n", ans);
		};
		return 0;
	}

}

