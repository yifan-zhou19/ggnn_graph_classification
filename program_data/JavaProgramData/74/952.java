package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		int k = 0;
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

			for (j = 2;j <= i / 2;j++)
			{
				if (i % j == 0)
				{
				 break;
				}
			}
			if (j >= i / 2)
			{
				int a;
				int b;
				int c;
				a = i;
				b = 0;
				while (a > 0)
				{
					c = a % 10;
					b = b * 10 + c;
					a = a / 10;
				}
			 if (i == b)
			 {
				 if (k == 0)
				 {
				   System.out.printf("%d",i);
				   k++;
				 }
				   else
				   {
					   System.out.printf(",%d",i);
					   k++;
				   }
			 }
			}
		}
			  if (k == 0)
			  {
				  System.out.print("no\n");
			  }
	}

}

