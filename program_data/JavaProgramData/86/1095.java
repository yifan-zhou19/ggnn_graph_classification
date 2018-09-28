package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int z;
		int y = 0;
		int[] x = new int[100];
		int[] pint;
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
				x[i] = 60;
				y = 1;
				continue;
			}
			pint = new int[m];
			for (j = 0;j < m;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pint[j] = Integer.parseInt(tempVar3);
			}
			}
			for (j = 0;j < m;j++)
			{
			z = pint[j] + (j + 1) * 3;
			if (z <= 60)
			{
				x[i] = pint[j] + 60 - z;
			}
				else
				{
					if (z > 60 && z < 63)
					{
					x[i] = pint[j];
					}
					else
					{
						break;
					}
				}
			}
		}
			for (i = 0;i < n;i++)
			{
			System.out.printf("%d\n",x[i]);
			}
			if (!(n == 1 && y == 1))
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			  free(pint);
			}
			 return 0;
	}






}

