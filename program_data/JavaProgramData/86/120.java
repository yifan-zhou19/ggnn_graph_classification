package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] m = new int[100];
		int[] p = new int[20];
		int i;
		int j;
		int[] t = new int[100];
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
				m[i] = Integer.parseInt(tempVar2);
			}
			if (m[i] == 0)
			{
				t[i] = 60;
			}
			else
			{
			for (j = 0;j < m[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p[j] = Integer.parseInt(tempVar3);
				}
				if ((p[j] + (j + 1) * 3) <= 60 && (60 - p[j]) <= 3)
				{
					t[i] = 60 - j * 3;

				}
				else if ((p[j] + (j + 1) * 3) <= 60 && (60 - p[j])>3)
				{
					t[i] = 60 - (j + 1) * 3;

				}
				else if ((p[j] + 3 * j) < 60)
				{
					t[i] = p[j];

				}
				else if ((60 - p[j - 1] - 3 * (j - 1)) <= 3 && (60 - p[j - 1] - 3 * (j - 1)) >= 0)
				{
					t[i] = p[j - 1];

				}
				else if ((p[j - 1] + j * 3) > 60)
				{
					t[i] = 60 - 3 * (j - 1);
				}
				else
				{
					t[i] = 60 - j * 3;


				}

			}


			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",t[i]);
		}
		return 0;
	}
}

