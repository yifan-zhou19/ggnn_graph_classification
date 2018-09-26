package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w1 = 0;
		int w2 = 0;
		int i;
		int j;
		int k;
		int n;
		int[] a = new int[200];
		int[] b = new int[200];
		int[] c = new int[200];
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c[i] = Integer.parseInt(tempVar4);
			}
			{
				if (a[i] % 4 == 0 && a[i] % 100 != 0)

				{
				days[2] = 29;
				for (j = 0;j < b[i];j++)
				{
					w1 = w1 + days[j];
				}
				for (k = 0;k < c[i];k++)
				{
					w2 = w2 + days[k];
				}
				}
				  else if (a[i] % 400 == 0)
				  {
				days[2] = 29;
				for (j = 0;j < b[i];j++)
				{
					w1 = w1 + days[j];
				}
				for (k = 0;k < c[i];k++)
				{
					w2 = w2 + days[k];
				}
				  }

			else
			{
			days[2] = 28;

				for (j = 0;j < b[i];j++)
				{
					w1 = w1 + days[j];
				}
				for (k = 0;k < c[i];k++)
				{
					w2 = w2 + days[k];
				}
			}
	}

			  if ((w2 - w1) % 7 == 0)
			  {
				  System.out.print("YES\n");
			  }
			else
			{
				System.out.print("NO\n");
			}
			w1 = 0;
			w2 = 0;
		}

		return 0;
	}


}

