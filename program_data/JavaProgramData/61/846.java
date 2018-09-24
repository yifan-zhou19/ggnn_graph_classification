package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= n;i++)
		  {
						   int m;
						   int j;
						   String tempVar2 = ConsoleInput.scanfRead();
						   if (tempVar2 != null)
						   {
							   m = Integer.parseInt(tempVar2);
						   }
			  int[] a = new int[1000];
			  a[1] = 1;
			  a[2] = 1;
			  for (j = 3;j <= m;j++)
			  {
			   a[j] = a[j - 1] + a[j - 2];
			  }
			  if (m == 1 || m == 2)
			  {
			  System.out.printf("%d",1);
			  }
			  else
			  {
			  System.out.printf("%d",a[m]);
			  }
			  if (i < n)
			  {
			  System.out.print("\n");
			  }


		  }

		  System.in.read();

	}
}

