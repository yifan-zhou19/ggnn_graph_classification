package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int max;
		int min;
		int n;
		int s = 0;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		if (c == '\n')
		{
		System.out.print("No");
		}
		else
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
		if (a > b)
		{
			max = a;
		min = b;
		s = 1;
		}
		else if (a < b)
		{
			max = b;
		min = a;
		s = 1;
		}
		else
		{
			max = a;
		min = b;
		s = 0;
		}
		for (;c == ',';)
		{
				 String tempVar5 = ConsoleInput.scanfRead();
				 if (tempVar5 != null)
				 {
					 n = Integer.parseInt(tempVar5);
				 }
				 String tempVar6 = ConsoleInput.scanfRead(null, 1);
				 if (tempVar6 != null)
				 {
					 c = tempVar6.charAt(0);
				 }
				 if (n != a || n != b)
				 {
				 s = 1;
				 }
				  if (n > min && n < max)
				  {
				   min = n;
				  }
				  else if (n > max)
				  {
					   min = max;
				   max = n;
				  }
				   else if (n < min && min == max)
				   {
				   min = n;
				   }
		}

		if (s == 0)
		{
		System.out.print("No");
		}
		else
		{
		System.out.printf("%d",min);
		}
		}
		   return 0;
	}

}

