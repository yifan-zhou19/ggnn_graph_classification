package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] x = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] r = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int y;
		int p;
		int q;
		int n;
		int i;
		int s = 0;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (t < n)
		{
			t++;
			s = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			q = Integer.parseInt(tempVar4);
		}
		if (y % 4 != 0)
		{
			y = 1;
		}
		else if ((y % 100 == 0) && (y % 400 != 0))
		{
			y = 1;
		}
		else
		{
			y = 0;
		}
		if (y == 1)
		{
			if (p < q)
			{
			 for (i = p - 1;i < q - 1;i++)
			 {
			 s = s + x[i];
			 }

			}
			else
			{
			for (i = q - 1;i < p - 1;i++)
			{
			 s = s + x[i];
			}

			}

			if (s % 7 == 0)
			{
			System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}

		}




	   if (y == 0)
	   {


		if (p < q)
		{
			 for (i = p - 1;i < q - 1;i++)
			 {
			 s = s + r[i];
			 }

		}
			else
			{
			for (i = q - 1;i < p - 1;i++)
			{
			 s = s + r[i];
			}

			}

			if (s % 7 == 0)
			{
			System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}



	   }
		}

	}

}

