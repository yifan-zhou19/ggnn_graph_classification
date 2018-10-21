package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int c;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		for (i = 1;i <= n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
		}
		for (i = 1,b = 1;i <= n;i++,b++)
		{
		   if (b == 1)
		   {
		   System.out.printf("%d",a[i]);
		   }
		   else
		   {
			for (c = 1;c <= i;c++)
			{
				if (a[c] == a[i])
				{
				 break;
				}
			}
			 if (c == i)
			 {
			 System.out.printf(" %d",a[i]);
			 }
		   }
		}
		System.in.read();
		System.in.read();
	}

}

