package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int n;
		int k;
		int i;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int[] a = new int[1000];
		for (i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}


		 for (b = 0;b < n;b++)
		 {
		 for (i = 0;i < n;i++)
		 {
			 if (i != b)
			 {
			 if (a[b] + a[i] != k)
			 {
			 c = c + 1;
		 continue;
			 }
		 else
		 {
		 break;
		 }
			 }
		 }
		 }



		 if (c == n * (n - 1))
		 {
		 System.out.print("no");
		 }
		 if (c != n * (n - 1))
		 {
		 System.out.print("yes");
		 }

		 return 0;
	}

}

