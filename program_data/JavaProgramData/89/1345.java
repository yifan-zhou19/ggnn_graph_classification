package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int c;
		  int[] a = new int[100000];
		  int[] b = new int[100000];
		  int[] m = new int[10000];
		  int[] p = new int[10000];
		  int k = -1;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0; ;i++)
		  {

				   String tempVar2 = ConsoleInput.scanfRead();
				   if (tempVar2 != null)
				   {
					   a[i] = Integer.parseInt(tempVar2);
				   }
				   String tempVar3 = ConsoleInput.scanfRead(" ");
				   if (tempVar3 != null)
				   {
					   b[i] = Integer.parseInt(tempVar3);
				   }
				   k++;
					if (a[i] == 0 && b[i] == 0)
					{
					break;
					}

		  }

		  for (i = 0;i < k;i++)
		  {
			  m[a[i]]++;
					p[b[i]]++;
		  }

		 for (j = 0;j < n;j++)
		 {
			  c = j;
			  if (m[j] == 0 && p[j] == (n - 1))
			  {
				 System.out.printf("%d\n",c);
			  break;
			  }
		 }
		if (j == n)
		{

			  System.out.print("NOT FOUND");
		}


		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}
}

