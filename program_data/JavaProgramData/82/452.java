package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int[] a = new int[99];
	  int[] b = new int[99];
	  int[] pd = new int[99];
	  int y = 0;
	  int j;
	  int e;
	  int s;
	  int max;
	  int[] h = new int[99];
	  int x = 0;
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
			a[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
		if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
		{
		  pd[i] = 1;
		  y = 1;
		}
		else
		{
			pd[i] = 0;
		}
	  }
	  j = 0;
	  for (s = 0;s < n;s++)
	  {
		if (pd[s] == 1 && pd[s] == pd[s + 1] && (s == 0 || pd[s - 1] == 0))
		{
			e = s + 1;
			x = 1;
			while (true)
			{
				 if (e == n - 1 || pd[e+1] == 0)
				 {
					 break;
				 }
				 e++;
			}
		h[j] = e - s + 1;
		j++;
		}
	  }
	 if (y == 1 && x == 1)
	 {
	  max = h[0];
	  for (i = 0;i < j;i++)
	  {
		if (max < h[i])
		{
			max = h[i];
		}
	  }
	  System.out.printf("%d",max);
	 }
	 else if (y == 0)
	 {
		 System.out.print("0");
	 }
	 else
	 {
		 System.out.print("1");
	 }
	  return 0;
	}

}

