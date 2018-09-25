package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int c;
		int temp = 0;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i = i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					b = Integer.parseInt(tempVar3);
				}
				  if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
				  {
					   j = j++;
					   c = j;
					   if (temp <= c)
					   {
						 temp = c;
					   }
				  }
				  else
				  {
					 j = 0;
				  }
		}
		System.out.printf("%d",temp);
		scanf("");
		return 0;
	}
}

