package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int l;
		int z;
		int a;
		int b;
		a = 0,b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < l;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
	  z = m - n;
	  if (z == -1 || z == 2)
	  {
		  b++;
	  }
	  else if (z == 1 || z == -2)
	  {
		  a++;
	  }



		}
	   if (a > b)
	   {
		   System.out.print("B");
	   }
	else if (b > a)
	{
		System.out.print("A");
	}
	else if (b == a)
	{
		System.out.print("Tie");
	}

	   return 0;

	}


}

