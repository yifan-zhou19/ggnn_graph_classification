package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int h;
		int p = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] z = new int[n];
		int[] y = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 1;j <= n;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (z[i] > z[i + 1])
				{
					h = z[i];
					z[i] = z[i + 1];
					z[i + 1] = h;
				}
			   if (y[i] > y[i + 1])
			   {
				   h = y[i];
				   y[i] = y[i + 1];
				   y[i + 1] = h;
			   }
			}
		}
			  for (i = 0;i < n - 1;i++)
			  {
				  if (z[i + 1] > y[i])
				  {
					  System.out.print("no");
					  p = 0;
					  break;
				  }
			  }
			  if (p == 1)
			  {
				  System.out.printf("%d %d",z[0],y[n - 1]);
			  }
			 return 0;
	}




}

