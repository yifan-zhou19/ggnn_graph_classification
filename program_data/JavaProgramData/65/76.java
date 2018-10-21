package <missing>;

public class GlobalMembers
{
	public static final int M = 200;
	public static int Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[M];
		int[] b = new int[M];
		int an;
		int bn;
		an = 0;
		bn = 0;
		for (int i = 0; i < n;i++)
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
				if (a[i] == 0 && b[i] == 1)
				{
						  an++;
				}
				if (a[i] == 0 && b[i] == 2)
				{
						   bn++;
				}
				if (a[i] == 1 && b[i] == 0)
				{
						   bn++;
				}
				 if (a[i] == 1 && b[i] == 2)
				 {
						   an++;
				 }
				  if (a[i] == 2 && b[i] == 0)
				  {
						   an++;
				  }
				   if (a[i] == 2 && b[i] == 1)
				   {
						   bn++;
				   }
		}
		if (an > bn)
		{
				 System.out.print("A");
		}
		if (an < bn)
		{
				 System.out.print("B");
		}
		if (an == bn)
		{
				  System.out.print("Tie");
		}

		return 1;
	}

}

