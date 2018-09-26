package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int k;
	  int h;
	  int n;
	  int c;
	  int t;
	  int y;
	  int[] a = new int[70];
	  int[] b = new int[30];
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
			h = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < h;j++)
		{
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[j] = Integer.parseInt(tempVar3);
		  }
		}
		c = 0;
		t = 1;
		while (t <= 60)
		{
		  c++;
		  y = 0;
		  for (j = 0;j < h;j++)
		  {
			if (c == a[j])
			{
			  t += 4;
			  y = 1;
			  break;
			}
		  }
		  if (y == 0)
		  {
			t++;
		  }

		}
		b[i] = c;
	  }
	  for (i = 0;i < n;i++)
	  {
		System.out.printf("%d\n",b[i]);
	  }

	return 0;




	}
}

