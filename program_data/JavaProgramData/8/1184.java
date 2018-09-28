package <missing>;

public class GlobalMembers
{
	public static int f(int[] zhengshuchuan, int changdu)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < changdu;i++)
		{
			for (j = i;j < changdu;j++)
			{
				if (zhengshuchuan[i] > zhengshuchuan[j])
				{
				t = zhengshuchuan[i];
				zhengshuchuan[i] = zhengshuchuan[j];
				zhengshuchuan[j] = t;
				}
			}
		}
		return 0;
	}
	public static int Main()
	{
		int[] a = new int[200];
		int[] b = new int[100];
		int i;
		int changdu1;
		int changdu2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			changdu1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			changdu2 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < changdu1;i++)
		{
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  a[i] = Integer.parseInt(tempVar3);
			  }
		}
			for (i = 0;i < changdu2;i++)
			{
			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  b[i] = Integer.parseInt(tempVar4);
			  }
			}
			f(a, changdu1);
			f(b, changdu2);
			for (i = 0;i < changdu2;i++)
			{
				a[changdu1 + i] = b[i];
			}

			for (i = 0;i < changdu1 + changdu2;i++)
			{
				if (i == 0)
				{
					System.out.printf("%d",a[0]);
				}
			else
			{
				System.out.printf(" %d",a[i]);
			}
			}
		return 0;
	}
}

