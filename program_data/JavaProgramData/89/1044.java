package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int n;
		  int s;
		  int t;
		  int l;
		  int flag;
		  int[] a = new int[20000];
		  int[] b = new int[20000];
		  int[] c = new int[20000];

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }


		  s = 1;
		  t = 1;

		  for (i = 0;i < n;i++)
		  {
		  c[i] = 0;
		  }
		  i = 0;
		  while ((s != 0) || (t != 0))
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

				s = a[i];
				t = b[i];

				i++;

		  }

		  l = i - 1;


		   for (i = 0;i < l;i++)
		   {
				 for (j = 0;j < n;j++)
				 {
					   if (b[i] == j)
					   {
					   c[j]++;
					   }



				 }






		   }

		flag = 0;
		for (i = 0;i < n;i++)
		{
			  if (c[i] == n - 1)
			  {
				  System.out.printf("%d",i);
			   flag++;
			  }



		}

		if (flag == 0)
		{
		System.out.print("NOT FOUND");
		}













		return 0;

	}
}

