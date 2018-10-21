package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			 int n;
			 int k;
			 int i = 0;
			 int m = 0;
			 int s = 0;
			 int[] a = new int[100000];
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 n = Integer.parseInt(tempVar);
			 }
			 for (i;i < n;i++)
			 {
					  String tempVar2 = ConsoleInput.scanfRead();
					  if (tempVar2 != null)
					  {
						  a[i] = Integer.parseInt(tempVar2);
					  }
					  m++;
			 }

			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 k = Integer.parseInt(tempVar3);
			 }
			 while (s != m)
			 {
					  if (a[s] == k)
					  {
							   m--;
							   i = s;
							   for (i;i < m;i++)
							   {
								   a[i] = a[i + 1];
							   }
					  }
					  else
					  {
						  s++;
					  }
			 }
			 System.out.printf("%d",a[0]);
			 for (i = 1;i < m;i++)
			 {
			 System.out.printf(" %d",a[i]);
			 }

	}

}

