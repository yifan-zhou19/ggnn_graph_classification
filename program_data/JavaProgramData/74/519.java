package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int t;
		int j = 0;
		int k;
		int o;
		int r;
		int[] b = new int[30];
		final String pp = "\0";
		int f = int m;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		  for (i = m;i <= n;i++)
		  {
		  if (f(i) == 1)


		  {
			  pp = " ";
			// ltoa(i,pp,10);
			  o = 0;
			  r = i;
			 while (r != 0)
			 {
				 pp = tangible.StringFunctions.changeCharacter(pp, o, r % 10 + 48);
				 r = r / 10;
				 o++;
			 }


			   t = 0;
			   k = pp.length();
			  while (t <= k)
			  {
			   if (pp.charAt(t) == pp.charAt(k - 1 - t))
			   {
				  t++;
			   }
			  else
			  {
				  break;
			  }

			  }

			 if (t >= k)
			 {
				 b[j] = i;
				 j++;
			 }
		  }
		  }

	   if (j == 0)
	   {
		System.out.print("no");
	   }
	else
	{
	  for (i = 0;i < j - 1;i++)
	  {
		  System.out.printf("%d,",b[i]);
	  }
	  System.out.printf("%d",b[j - 1]);
	}




	}
	public static int f(int q)
	{
		int flag = 1;
		int i;
		for (i = 2;i < q;i++)
		{
			if (q % i == 0)
			{
			flag = 0;
			break;
			}
		}
			return flag;
	}



}

