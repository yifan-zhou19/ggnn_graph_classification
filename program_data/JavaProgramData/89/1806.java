package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i;
		 int j;
		 int[] a = new int[100000];
		 int[] b = new int[100000];
		 int s;
		 int[] c = new int[100000];
		 int n;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }


		for (i = 0;i < n;i++)
		{
			c[i] = 0;
		}



		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[0] = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 b[0] = Integer.parseInt(tempVar3);
		 }
		 for (i = 1;;i++)
		 {
			 c[b[i - 1]] = c[b[i - 1]] + 1;
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 a[i] = Integer.parseInt(tempVar4);
			 }
			 String tempVar5 = ConsoleInput.scanfRead(" ");
			 if (tempVar5 != null)
			 {
				 b[i] = Integer.parseInt(tempVar5);
			 }
		if (a[i] + b[i] == 0)
		{
			break;
		}


		 }
			 s = 0;
			 for (j = 0;j < n;j++)
			 {
			if (c[j] == n - 1)
			{
				System.out.printf("%d",j);
			  s = 1;
			}
			 }
			  if (s == 0)
			  {
				  System.out.print("NOT FOUND");
			  }


	}


}

