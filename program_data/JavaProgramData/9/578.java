package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int f;
		  int k = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  char[][] a = new char[100][2000];
		  String e = new String(new char[11]);
		  char[][] d = new char[100][2000];
		  int[] b = new int[100];
		  int[] c = new int[100];
		  for (i = 0;i <= n - 1;i++)
		  {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		  }
			for (i = 0;i < n;i++)
			{
				 if (b[i] >= 60)
				 {
				 c[k] = b[i];
				 d[k] = a[i];
				 k++;
				 }
			}
			for (j = k - 2;j >= 0;j--)
			{
			   for (i = j;i <= k - 2;i++)
			   {
				 if (c[i] < c[i + 1])
				 {
				   e = d[i];
				   d[i] = d[i + 1];
				   d[i + 1] = e;
				   f = c[i];
				   c[i] = c[i + 1];
				   c[i + 1] = f;
				 }
			   }
			}
			  for (i = 0;i < k;i++)
			  {
					System.out.printf("%s\n",d[i]);
			  }
					k = 0;
			  for (i = 0;i < n;i++)
			  {
				   if (b[i] < 60)
				   {

					  c[k] = b[i];
					  d[k] = a[i];
					  k++;
				   }
			  }
			   for (i = 0;i < k;i++)
			   {
					System.out.printf("%s\n",d[i]);
			   }
	}

}

