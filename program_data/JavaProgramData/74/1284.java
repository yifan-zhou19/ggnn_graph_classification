package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		int a;
		int b;
		int i;
		int j = 0;
		int k = 0;
		int h = 1;
		int v;
		int l;
		int c = 0;
		int leap = 1;
		int q;
		int[] m = new int[22];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = a;i < b + 1;i++)
		{
			c = i;
		j = 0;
		leap = 1;
	while (c != 0)

	{
		m[j] = c % 10;
		c = c / 10;
		j = j + 1;
	}

	  for (k = 0;k < (j / 2);k++)
	  {
		  if (m[k] != m[j - k - 1])
		  {
			leap = 0;
		break;
		  }
	  }
	  v = (int)(Math.sqrt(i));
	   for (l = 2;l < v + 1;l++)
	   {
		   if (i % l == 0)
		   {
			   leap = 0;
		   break;
		   }
	   }
		if (leap == 1)
		{
			if (h == 1)
			{
		System.out.printf("%d",i),h = h + 1;
			}
		else
		{
			System.out.printf(",%d",i);
		}
		}

		}
	   if (leap == 0 && h == 1)
	   {
		   System.out.print("no");
	   }
	 }
}

