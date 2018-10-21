package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] s = new int[100];
		int[] q = new int[100];
		int[] t = new int[100];


		int i;
		int j = 0;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			t[i] = 0;
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				q[i] = Integer.parseInt(tempVar3);
			}
			if (s[i] >= 90 && s[i] <= 140 && q[i] <= 90 && q[i] >= 60)
			{
				t[j]++;

			}
			else if (i >= 1 && s[i - 1] >= 90 && s[i - 1] <= 140 && q[i - 1] >= 60 && q[i - 1] <= 90)
			{

					j++;

			}
		}
		for (i = 0;i < n - 1;i++)
		{

				if (t[i] > t[i + 1])
				{
					m = t[i];
					t[i] = t[i + 1];
					t[i + 1] = m;
				}

		}










		System.out.printf("%d",t[n - 1]);







		return 0;
	}

}

