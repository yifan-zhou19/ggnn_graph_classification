package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] a = new int[1001];
		int t;
		int w;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		t = 0;
		for (i = 0;i <= n - 1;i++)
		{
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i] = Integer.parseInt(tempVar3);
		  }
		}
		  for (i = 0;i <= n - 1;i++)
		  {
			  for (j = i;j <= n - 1;j++)
			  {
				if (a[i] + a[j] == m)
				{
						t = 1;
						break;
				}
			  }
			  if (t == 1)
			  {
				  break;
			  }
		  }
			   if (t == 1)
			   {
				   System.out.print("yes");
			   }
			   else
			   {
				   System.out.print("no");
			   }


	return 0;
	}




}

