package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[310];
		int i;
		int j;
		int s;
		int b;
		int n = 0;
		int sec = 0;
		char c;

		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			n = n + 1;
			if (c == '\n')
			{
				break;
			}
		}


		if (n == 1)
		{
			System.out.print("No");
		}
		else
		{
			for (j = 0;j < n;j++)
			{
				for (i = 0;i < n - j - 1;i++)
				{
					if (num[i] > num[i + 1])
					{
						b = num[i];
						num[i] = num[i + 1];
						num[i + 1] = b;
					}
				}
			}
			if (num[0] == num[n - 1])
			{
				System.out.print("No");
			}
			else
			{
				for (i = 0;i < n;i++)
				{
					if (num[i] > sec && num[i] < num[n - 1])
					{
						sec = num[i];
					}
				}


			System.out.printf("%d",sec);
			}
		}

		return 0;
	}

}

