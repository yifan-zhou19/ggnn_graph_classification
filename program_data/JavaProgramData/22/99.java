package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int h = 0;
		int l;
		int j;
		int r;
		int x;
		int y;
		int max;
		String c = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		l = c.length();
		c = tangible.StringFunctions.changeCharacter(c, l, '0');

		for (i = 0;i < l;i++)
		{
			if (c.charAt(i) >= '0' && c.charAt(i) <= '9')
			{
				a[h] = c.charAt(i) - '0';

			for (j = i + 1;(c.charAt(j) >= '0' && c.charAt(j) <= '9');j++)
			{
					 a[h] = a[h] * 10 + c.charAt(j) - '0';
			}
				 //printf("%d  %d,",h,a[h]);
				 h++;

				 i = j;
			}
		}
		a[h - 1] = a[h - 1] / 10;

		x = 0;
		if (a[1] == 0)
		{
			System.out.print("No");
		x = 1;
		}


		y = 0;

		if (x == 0)
		{

		 r = 0;
			max = a[0];
			for (i = 0;i < h;i++)
			{
		   if (a[i] != a[0])
		   {
			   r = 1;
		   }
			}
			if (r == 0)
			{
				System.out.print("No");
				y = 1;
			}
		}






		if (x == 0 && y == 0)
		{
			max = a[0];

			// printf("%d\n",max);

			 for (i = 0;i < h;i++)
			 {
			if (a[i] > max)
			{
			 max = a[i];
			}
			 }


		// printf("%d\n",max);



		 for (i = 0;i < h;i++)
		 {
		  if (a[i] == max)
		  {
			  a[i] = 0;
		  }
		 }


		max = a[0];
		for (i = 0;i < h;i++)
		{
			if (a[i] > max)
			{
		max = a[i];
			}
		}

		//printf("%d\n",max);


			System.out.printf("%d",max);
		}
	}

}

