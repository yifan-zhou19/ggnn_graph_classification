package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[1000];
		int[] b = new int[1000];
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
		}
		int x = 0;
		int y = 0;
		int z = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] == 0 && b[i] == 1)
			{
				x++;
			}
			if (a[i] == 1 && b[i] == 2)
			{
				x++;
			}
			if (a[i] == 2 && b[i] == 0)
			{
				x++;
			}
			if (b[i] == 0 && a[i] == 1)
			{
				y++;
			}
			if (b[i] == 1 && a[i] == 2)
			{
				y++;
			}
			if (b[i] == 2 && a[i] == 0)
			{
				y++;
			}
			if (a[i] == 0 && b[i] == 0)
			{
				z++;
			}
			if (a[i] == 1 && b[i] == 1)
			{
				z++;
			}
			if (a[i] == 2 && b[i] == 2)
			{
				z++;
			}
		}

	  if (x > y)
	  {
		System.out.print("A");
	  }
	  if (x == y)
	  {
		System.out.print("Tie");
	  }
	  if (x < y)
	  {
		  System.out.print("B");
	  }
	  return 0;
	}



}

