package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int num = 0;
		int judge;
		char c;
		for (i = 0;i < 300;i++)
		{

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			num = num + 1;
			if (c == '\n')
			{
				break;
			}
		}

		int t = 0;
		int s = 0;
		int k;
		k = a[0];
		if (num == 1)
		{
			System.out.print("No\n");
		}
		else
		{
			judge = 0;
			for (i = 0;i < num;i++)
			{
				if (a[i] == k)
				{
					judge = judge+1;
				}
			}

			if (judge == num)
			{
				System.out.print("No\n");
			}
			else
			{
				for (j = 0;j < num;j++)
				{
					if (a[j] > t)
					{
						t = a[j];
					}
				}

				for (i = 0;i < num;i++)
				{
					if (a[i] > s && a[i] < t)
					{
						s = a[i];
					}
				}

				System.out.printf("%d\n", s);

			}



		}
		return 0;
	}





}

