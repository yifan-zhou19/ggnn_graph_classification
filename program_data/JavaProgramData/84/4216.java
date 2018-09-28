package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int num;
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
			num = Integer.parseInt(tempVar2);
		}
		   if (i == 1)
		   {
				a = num;
				b = num;

		   }
		  else if (num > a)
		  {
			   b = a;
				a = num;
		  }
			else if ((a > num) && (num > b))
			{
				b = num;
			}

		}
	System.out.printf("%d\n%d\n",a,b);
		return 0;
	}
}

