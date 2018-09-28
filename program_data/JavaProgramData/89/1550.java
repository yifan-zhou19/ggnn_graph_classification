package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int i;
		int j;
		int[] b = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			 b[i] = 1;
				  a[i] = 0;
		}
		while (true)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 i = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 j = Integer.parseInt(tempVar3);
			 }
			 if (i == 0 && j == 0)
			 {
				 break;
			 }
			 else
			 {
				  a[j]++;
				  b[i] = 0;
			 }
		}
		for (i = 0;i < n;i++)
		{
			 if (b[i] == 1)
			 {
				  if (a[i] == n - 1)
				  {
						   System.out.printf("%d",i);
						   break;
				  }
			 }
		}
		if (i == n)
		{
			System.out.print("NOT FOUND");
		}
	}


}

