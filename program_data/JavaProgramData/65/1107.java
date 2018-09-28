package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k = 0;
		int l = 0;
		int[] a = new int[200];
		int[] b = new int[200];
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
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 b[i] = Integer.parseInt(tempVar3);
			 }
			 if (a[i] == 1)
			 {
				 if (b[i] < a[i])
				 {
					 l = l + 1;
				 }
				 else if (b[i] > a[i])
				 {
					 k = k + 1;
				 }
			 }
			if (a[i] == 2)
			{
				 if (b[i] == 0)
				 {
					 k = k + 1;
				 }
				 else if (b[i] == 1)
				 {
					 l = l + 1;
				 }
			}
		   if (a[i] == 0)
		   {
				 if (b[i] == 1)
				 {
					 k = k + 1;
				 }
				 else if (b[i] == 2)
				 {
					 l = l + 1;
				 }
		   }
		}
		if (k > l)
		{
			System.out.print("A");
		}
		else if (k < l)
		{
			System.out.print("B");
		}
		else if (k == l)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

