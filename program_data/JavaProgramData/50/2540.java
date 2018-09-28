package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int t;
		int i;
		int[] a = new int[13];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		a[1] = 31;
		a[2] = 28;
		a[3] = 31;
		a[4] = 30;
		a[5] = 31;
		a[6] = 30;
		a[7] = 31;
		a[8] = 31;
		a[9] = 30;
		a[10] = 31;
		a[11] = 30;
		a[12] = 31;
		t = 0;
		i = 0;
		while (t <= 11)
		{
		i = i + 1;
		t = t + 1;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		  if (w == 7)
		  {
			 System.out.printf("%d\n",t);
			 w = ((w + a[i]) % 7) + 7;
		  }
		  else
		  {
			 w = ((w + a[i]) % 7) + 7;
		  }
		}

		   return 0;
	}

}

