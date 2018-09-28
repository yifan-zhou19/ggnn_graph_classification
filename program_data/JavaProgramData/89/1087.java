package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10000];
		int[] r = new int[10000];
		int k;
		int i;
		int c = 1;
		int b = 1;
		int frag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = n;
		for (i = 0;i < n;i++)
		{
			a[i] = 1,r[i] = 0;
		}
		for (;;)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  b = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  c = Integer.parseInt(tempVar3);
		  }
		  if (c + b > 0)
		  {
				   r[c]++;
				   if (a[b] == 1)
				   {
					   k--,a[b] = 0;
				   }
		  }
		  else
		  {
			  break;
		  }
		  if (k == 0)
		  {
			  break;
		  }
		}
		if (k == 1)
		{
		  for (i = 0;i < n;i++)
		  {
			if (a[i] == 1)
			{
			  if (r[i] == n - 1)
			  {
			  System.out.printf("%d",i);
			  frag = 1;
			  break;
			  }
			}
		  }
		}
		if (frag == 0)
		{
			System.out.print("NOT FOUND");
		}

	}
}

