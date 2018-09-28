package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int k = 0;
		int[] ss = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n;i++)
		{
			t = 1;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					t = 0;
				}
			}
			if (t == 1)
			{
				ss[k] = i;
				k++;
			}
		}
		t = 0;
		for (i = 0;i < k;i++)
		{
			if (ss[i + 1] - ss[i] == 2)
			{
				System.out.printf("%d %d\n",ss[i],ss[i + 1]);
				t++;
			}
			else if (ss[i + 2] - ss[i] == 2)
			{
				System.out.printf("%d %d\n",ss[i],ss[i + 2]);
				t++;
			}
		}
		if (t == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}
}

