package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a;
		int b;
		int f = 0;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		for (;100 > n && n > 1;n--)
		{

			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			b = a > b != 0?a:b;
			if (f <= b)
			{
				s = f;
				f = b;
			}
			   else
			   {
				   s = b > s != 0?b:s;
			   }


		}
		System.out.printf("%d\n",f);
		System.out.printf("%d",s);

	}

}

