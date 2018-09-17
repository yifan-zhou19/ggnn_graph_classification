package <missing>;

public class GlobalMembers
{
	public static int f(int shu,int min)
	{
	  int k = 1;
	  if (shu < min)
	  {
		k = 0;
	   return k;
	  }
	  else
	  {
	  for (int i = min;i < shu;i++)
	  {
		if (shu % i == 0)
		{
			 k = k + f(shu / i, i);
		}


	  }
		return k;
	  }
	}

	public static int Main()
	{
		  int n;
		  int i;
		  int a;
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
				  a = Integer.parseInt(tempVar2);
			  }

			  if (i != n - 1)
			  {
			   System.out.printf("%d\n",f(a, 2));
			  }
			   else
			   {
			   System.out.printf("%d",f(a, 2));
			   }



		  }


	}
}

