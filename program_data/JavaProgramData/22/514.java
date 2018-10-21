package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] d = new int[400];
		int r = 0;
		do
		{
			d[r] = -10000;
			r++;
		}while (r < 300);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			d[0] = Integer.parseInt(tempVar);
		}
		int i = 1;
		do
		{
			String tempVar2 = ConsoleInput.scanfRead(",");
			if (tempVar2 != null)
			{
				d[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}while (i < 300);
		int b;
		int a = d[0];
		i = 0;
		if (d[1] != -10000)
		{
			do
			{
				if (d[i] > a)
				{
				a = d[i];
				}
			i++;
			}while (i < 300);
			int num = 0;
			i = 0;


		   do
		   {
				if (a != d[i])
				{
					b = d[i];
					break;
				}
				i++;
		   }while (i < 300);

			i = 0;
			do
			{
				if (d[i] > b)
				{
					if (d[i] != a)
					{
						b = d[i];
					}

				}
				i++;
			}while (i < 300);
			if (b != -10000)
			{
				System.out.printf("%d\n",b);
			}
			else
			{
				System.out.print("No");
			}
		}
		else if (d[1] == -10000)
		{
			System.out.print("No");
		}
		return 0;
	}

}

