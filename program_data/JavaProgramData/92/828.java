package <missing>;

public class GlobalMembers
{
	public static int f(int n, int[] t, int[] q)
	{
		int m = 0;
		int i = 0;
		for (i = n;i != 1;i--)
		{
			   if (t[0] > q[0])
			   {
				   m = m + 200;
				   for (int k = 0;k < i - 1;k++)
				   {
						   t[k] = t[k + 1];
						   q[k] = q[k + 1];
				   }
			   }
			   else
			   {
				  if (t[0] < q[0])
				  {
						 m = m - 200;
					 for (int k = 0;k < i - 1;k++)
					 {
						   q[k] = q[k + 1];
					 }
				  }
				  else
				  {
					  if (t[i - 1] > q[i - 1])
					  {
							 m = m + 200;
					  }
					  else
					  {

					   if (t[i - 1] < q[0])
					   {
							 m = m - 200;
					   }
						  else
						  {
							  m = m;
						  }
							 for (int k = 0;k < i - 1;k++)
							 {
								  q[k] = q[k + 1];
							 }

					  }
				  }
			   }

		}
		if (t[0] < q[0])
		{
			m = m - 200;
		}
		else
		{
			 if (t[0] > q[0])
			 {
				   m = m + 200;
			 }
			 else
			 {
			 m = m;
			 }
		}
		return m;
	}
	public static int Main()
	{
		int n = 2;
		int[] t = new int[2000];
		int[] q = new int[2000];
		for (int k = 0;n != 0;k++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n != 0)
			{
					for (int i = 0;i < n;i++)
					{
							String tempVar2 = ConsoleInput.scanfRead();
							if (tempVar2 != null)
							{
								t[i] = Integer.parseInt(tempVar2);
							}
					}
					for (int i = 0;i < n;i++)
					{
							String tempVar3 = ConsoleInput.scanfRead();
							if (tempVar3 != null)
							{
								q[i] = Integer.parseInt(tempVar3);
							}
					}

					for (int i = 0;i < n;i++)
					{
							 for (int j = 0;j < n - i - 1;j++)
							 {
								 if (t[j] < t[j + 1])
								 {
										 int s;
											 s = t[j];
										  t[j] = t[j + 1];
										 t[j + 1] = s;
								 }
							 }
					}
					for (int i = 0;i < n;i++)
					{
							 for (int j = 0;j < n - i - 1;j++)
							 {
								 if (q[j] < q[j + 1])
								 {
										 int s;
											 s = q[j];
										  q[j] = q[j + 1];
										 q[j + 1] = s;
								 }
							 }
					}
					if (k == 0)
					{
					System.out.printf("%d",f(n, t, q));
					}
					else
					{
					System.out.printf("\n%d",f(n, t, q));
					}
			}
		}
		System.in.read();
		System.in.read();
	}

}

