package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[] a = new int[10000];
		 int[] b = new int[10000];
		 int i;
		 int j;
		 int flag;
		 int m;
		 int n;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (m = 0;m < n;m++)
		 {
			 a[m] = 0;
			 b[m] = 0;
		 }
			 for (;;)
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
				a[i]++;
				b[j]++;
			   }

			 }
				  for (j = 0,flag = 0;j < n;j++)
				  {
					if (b[j] == (n - 1) && a[j] == 0)
					{
						   System.out.printf("%d",j);
						   flag = 1;
					}
				  }
		 if (flag == 0)
		 {
		 System.out.print("NOT FOUND\n");
		 }
		 return 0;

	}

}

