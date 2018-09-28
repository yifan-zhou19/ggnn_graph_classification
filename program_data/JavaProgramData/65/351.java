package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int j;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 0)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			j = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
			  if (j == k)
			  {
					  a++;
					  b++;
			  }
			  else
			  {
				   if ((j == 0 && k == 1) || (j == 1 && k == 2) || (j == 2 && k == 0))
				   {
				   a++;
				   }
				   else
				   {
				   b++;
				   }
			  }
				   n--;
		}
		if (a > b)
		{
		System.out.print("A");
		}
		if (a < b)
		{
		System.out.print("B");
		}
		if (a == b)
		{
		System.out.print("Tie");
		}
	}
}

