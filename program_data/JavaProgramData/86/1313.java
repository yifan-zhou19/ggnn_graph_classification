package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int m;
	  int j;
	  int ans;
	  int t;
	  int tmp;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		t = 0;
		ans = 60;
		for (j = 1;j <= m;j++)
		{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   tmp = Integer.parseInt(tempVar3);
		   }
		   if (tmp + t <= 60)
		   {
			  t += 3;
			  if (tmp + t > 60)
			  {
				ans -= 63 - tmp - t;
			  }
			  else
			  {
				ans -= 3;
			  }
		   }
		}
		System.out.printf("%d\n",ans);
	  }
	}
}

