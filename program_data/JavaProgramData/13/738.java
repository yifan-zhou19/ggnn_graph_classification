package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int[] a = new int[20000];
	 int j;
	 int temp;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (int i = 1;i <= n;i++)
	 {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 temp = Integer.parseInt(tempVar2);
				 }
				 if (i == 1)
				 {
							j = 0;
							System.out.printf("%d",temp);
							a[j] = temp;
				 }
				 else
				 {
					  int c = 0;
					  for (int k = 0;k <= j;k++)
					  {
							   if (a[k] == temp)
							   {
							   c++;
							   }
					  }
					  if (c == 0)
					  {
								System.out.printf(" %d",temp);
								j++;
								a[j] = temp;
					  }
				 }
	 }
	 System.in.read();
	 System.in.read();
	}
}

