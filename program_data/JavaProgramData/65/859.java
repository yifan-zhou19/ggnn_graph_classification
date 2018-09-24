package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p = 0;
		int q = 0;
		int[] a = new int[300];
		int[] b = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
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
		for (int i = 0;i < n;i++)
		{
			if (a[i] == 0 && b[i] == 0)
			{
				p = p + 0;
				q = q + 0;
			}
			else if (a[i] == 0 && b[i] == 1)
			{
				p = p + 1;
				q = q + 0;
			}
			else if (a[i] == 0 && b[i] == 2)
			{
				p = p + 0;
				q = q + 1;
			}
			else if (a[i] == 1 && b[i] == 0)
			{
				p = p + 0;
				q = q + 1;
			}
			else if (a[i] == 1 && b[i] == 1)
			{
				p = p + 0;
				q = q + 0;
			}
			else if (a[i] == 1 && b[i] == 2)
			{
				p = p + 1;
				q = q + 0;
			}
			else if (a[i] == 2 && b[i] == 0)
			{
				p = p + 1;
				q = q + 0;
			}
			else if (a[i] == 2 && b[i] == 1)
			{
				p = p + 0;
				q = q + 1;
			}
			else if (a[i] == 2 && b[i] == 2)
			{
				p = p + 0;
				q = q + 0;
			}
		}
		if (p == q)
		{
			System.out.print("Tie");
		}
		 if (p > q)
		 {
			 System.out.print("A");
		 }
		  if (p < q)
		  {
			  System.out.print("B");
		  }
		  return 0;
	}

}

