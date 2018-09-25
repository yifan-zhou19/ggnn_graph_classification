package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] szz = new int[11111];
	int[] szy = new int[11111];

	int x;
	int e;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	for (int j = 0;j < n;j++)
	{

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			szz[j] = Integer.parseInt(tempVar2);
		}

		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			szy[j] = Integer.parseInt(tempVar3);
		}
	}

	for (int k = 1;k <= n;k++)
	{



		for (int h = 0;h < n - k;h++)
		{

			if (szz[h] > szz[h + 1])
			{

				e = szz[h + 1];

				szz[h + 1] = szz[h];

				szz[h] = e;
				e = szy[h + 1];

				szy[h + 1] = szy[h];

				szy[h] = e;

			}


		}



	}

	for (int i = 0;i < n - 1;i++)
	{
		if (i == 0)
		{



		   x = szz[i];

		}

		if (szz[i + 1] > szy[i])
		{

		   System.out.print("no");

		   return 0;
		}

		if ((szz[i + 1] <= szy[i]))
		{



			if (szy[i] > szy[i + 1])
			{

			   szy[i + 1] = szy[i];




			}





		}

	}
	System.out.printf("%d %d",szz[0],szy[n - 1]);
	return 0;
	}

}

