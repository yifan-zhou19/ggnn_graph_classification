package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int t;
		int n;
		int i;
		int j;
		int ans;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  t = Integer.parseInt(tempVar2);
		  }
		  for (j = 0;j < t;j++)
		  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[j] = Integer.parseInt(tempVar3);
		  }
		  }
		   if (t == 0)
		   {
				System.out.print("60\n");
				continue;
		   }
		   else if (a[t - 3] + 3 * (t - 2) < 60 && a[t - 2] + 3 * (t - 2)>60)
		   {
				  ans = 60 - 3 * (t - 2);
				  System.out.printf("%d\n",ans);
				  continue;
		   }
			else if (a[t - 2] + 3 * (t - 1) > 60)
			{
				  ans = a[t - 2];
				  System.out.printf("%d\n",ans);
				  continue;
			}
			else if (a[t - 1] + 3 * (t - 1) <= 60 && a[t - 1] + 3 * t >= 60)
			{
			   System.out.printf("%d\n",a[t - 1]);
			 continue;
			}

		   else if (a[t - 1] + 3 * (t - 1) < 60)
		   {
			   System.out.printf("%d\n",60 - 3 * t);
			 continue;
		   }

				  else if (a[t - 1] + 3 * (t - 1) > 60)
				  {
			   System.out.printf("%d\n",60 - 3 * (t - 1));
			continue;
				  }
		   else if (a[t - 1] + 3 * (t - 2) > 60)
		   {
				ans = 60 - 3 * (t - 2);
				System.out.printf("%d\n",ans);
			 continue;
		   }



		}
		 return 0;


	}

}

