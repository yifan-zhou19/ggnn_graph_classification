package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int n;
		int i;
		int z = 0;
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i = i + 1)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i <= n - 1;i = i + 1)
		{
		   if (a[i] == 0 && b[i] == 1)
		   {
			   z = z + 1;
		   }
		   else if (a[i] == 0 && b[i] == 2)
		   {
			   x = x + 1;
		   }
		   else if (a[i] == 1 && b[i] == 0)
		   {
			   x = x + 1;
		   }
		   else if (a[i] == 1 && b[i] == 2)
		   {
			   z = z + 1;
		   }
		   else if (a[i] == 2 && b[i] == 0)
		   {
			   z = z + 1;
		   }
		   else if (a[i] == 2 && b[i] == 1)
		   {
			   x = x + 1;
		   }
		   else if (a[i] == b[i])
		   {
			   z = z + 0;
		   }
			   x = x + 0;
		}
		if (z > x)
		{
			System.out.print("A");
		}
		if (z < x)
		{
			System.out.print("B");
		}
		if (z == x)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

