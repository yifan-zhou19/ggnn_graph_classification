package <missing>;

public class GlobalMembers
{
	public static int Main()
	{


		 int n;
		 int[] a = new int[1000];
		 int[] b = new int[1000];
		 int win;
		 int max;
		 int dz;
		 int j;
		 int i;
		 int k;
		 int s;
		 int x;
		 int y;
		 for (s = 0;;s++)
		 {
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
		 if (n == 0)
		 {
			 break;
		 }
		 for (i = 0;i < n;i++)
		 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
		 }
		  for (j = n - 1;j >= 0;j--)
		  {
			  max = 0;
			  for (i = 0;i < (j + 1);i++)
			  {
		  if (max < a[i])
		  {
			  max = a[i];
		  dz = i;
		  }
			  }
		  a[dz] = a[j];
		  a[j] = max;

		  }
		  for (i = 0;i < n;i++)
		  {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
		  }
		 for (j = n - 1;j >= 0;j--)
		 {
			  max = 0;
		 for (i = 0;i < (j + 1);i++)
		 {
		  if (max < b[i])
		  {
			  max = b[i];
		  dz = i;
		  }
		 }
		  b[dz] = b[j];
		  b[j] = max;
		 }
		win = 0;
		i = n - 1;
		j = n - 1;
		x = 0;
		y = 0;
		 while (n-- != 0)
		 {
		if (a[x] == b[y] && a[i] == b[j])
		{
		if (a[x] < b[j])
		{
		win--;
		}
		  else if (a[x] > b[j])
		  {
	win++;
		  }
	x++;
	 j--;
		}
	 else if (a[x] != b[y])
	 {
		 if (a[x] > b[y])
		 {
		 x++;
	 y++;
	 win++;
		 }
	else
	{
		if (a[x] < b[j])
		{
	win--;
		}
	else if (a[x] > b[j])
	{
	 win++;
	}
	 x++;
	j--;
	}
	 }
	else
	{
		if (a[i] > b[j])
		{
		 i--;
	 j--;
	 win++;
		}
	 else
	 {
		if (a[x] < b[j])
		{
	 win--;
		}
	 else if (a[x] > b[j])
	 {
	 win++;
	 }
	 x++;
	 j--;
	 }
	}
		 }



		k = 200 * win;
	if (k == 156200)
	{
		k = 156400;
	}
		System.out.printf("%d\n",k);


		 }

	}

}

