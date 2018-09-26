package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int a;
		int b;
		int m;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		for (a = 0,b = 0;n > 0;n--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m > a)
			{
				b = a;
				a = m;


			}
			else if (m > b && m < a)
			{
				b = m;


			}

		}
	System.out.printf("%d\n%d",a,b);

	}
}

