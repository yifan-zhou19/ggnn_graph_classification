package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int[] t = new int[100];
		int[] k = new int[20];
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
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				t[i] = 60;
			}
			else
			{
				for (j = 1;j <= m;j++)
				{
				   String tempVar3 = ConsoleInput.scanfRead();
				   if (tempVar3 != null)
				   {
					   k[j] = Integer.parseInt(tempVar3);
				   }
				}
				for (j = 1;j <= m;j++)
				{
				   if (k[j] + j * 3 >= 63)
				   {
					   t[i] = 63 - j * 3;
					   break;
				   }
				   else if (k[j] + j * 3 >= 60)
				   {
					   t[i] = k[j];
					   break;
				   }
				   else
				   {
					   t[i] = 60 - 3 * m;
				   }
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i > 0)
			{
				System.out.print("\n");
			}
			System.out.printf("%d",t[i]);
		}
		return 0;
	}






















}

