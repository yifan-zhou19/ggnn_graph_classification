package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int SA = 0;
		int SB = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
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
		for (i = 0;i < n;i++)
		{
			if (a[i] == b[i] - 1 || a[i] == b[i] + 2)
			{
				SA++;
			}
			else if (b[i] == a[i] - 1 || b[i] == a[i] + 2)
			{
				SB++;
			}
			else
			{
				SA = SA;
				SB = SB;
			}
		}
	   if (SA > SB)
	   {
		   System.out.print("A");
	   }
	   else if (SA < SB)
	   {
		   System.out.print("B");
	   }
	   else if (SA = SB)
	   {
		   System.out.print("Tie");
	   }
	   return 0;
	}
}

