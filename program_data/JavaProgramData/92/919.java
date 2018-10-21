package <missing>;

public class GlobalMembers
{
	//???? 
	public static int Main()
	{
		int n = 1;
		int i;
		int j;
		int k;
		int r;
		int[] t = new int[1000];
		int[] q = new int[1000];
		while (n != 0)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
			   break;
			}
			for (i = 0;i < n;i++)
			{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   t[i] = Integer.parseInt(tempVar2);
			   }
			}
			for (i = 0;i < n;i++)
			{
			   for (j = n - 1;j > i;j--)
			   {
				  if (t[j] >= t[j - 1]) //??
				  {
					 k = t[j - 1];
					 t[j - 1] = t[j];
					 t[j] = k;
				  }
			   }
			}
			for (i = 0;i < n;i++)
			{
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   q[i] = Integer.parseInt(tempVar3);
			   }
			}
			for (i = 0;i < n;i++)
			{
			   for (j = n - 1;j > i;j--)
			   {
				  if (q[j] >= q[j - 1]) //??
				  {
					 k = q[j - 1];
					 q[j - 1] = q[j];
					 q[j] = k;
				  }
			   }
			}
			int sum = 0; //fail???????????qfail????
			int fail = 0;
			int qfail = 0;
			for (j = 0;j < n;j++)
			{
			   i = j - fail;
			   k = j - qfail;
			   if (t[i] > q[k]) //???
			   {
				  sum++;
			   }
			   else if (t[i] < q[k]) //???
			   {
				  sum--;
				  fail++;
			   }
			   else if (t[i] == q[k]) //????????
			   {
				  if (t[n - fail - 1] > q[n - qfail - 1])
				  {
					 sum++;
					 fail++;
					 qfail++;
				  }
				  else if (t[n - fail - 1] < q[n - qfail - 1])
				  {
					 sum--;
					 fail++;
				  }
				  else if (t[n - fail - 1] == q[n - qfail - 1] && t[n - fail - 1] < q[k])
				  {
					 sum--;
					 fail++;
				  }
			   }
			}
			r = 200 * sum;
			System.out.printf("%d\n",r);
		}
	}

}

