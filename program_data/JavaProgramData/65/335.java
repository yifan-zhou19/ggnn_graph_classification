package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int A = 0;
		int B = 0;
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
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 b[i] = Integer.parseInt(tempVar3);
			 }
		  if ((3 + a[i] - b[i]) % 3 == 2)
		  {
		   A++;
		  }
		  if ((3 + a[i] - b[i]) % 3 == 1)
		  {
		   B++;
		  }
		}
		if (A > B)
		{
		 System.out.print("A");
		}
		else if (B > A)
		{
		 System.out.print("B");
		}
		else
		{
		 System.out.print("Tie");
		}
	}

}

