package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int a;
		int b;
		int j = 0;
		int m = 0;
		int k = 1;
		for (i = 1;i <= n;i++)
		{
						  while (i <= n)
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
														  j++;
						  }
						  else
						  {
							   break;
						  }
						  i++;
						  }
						  if (j > m)
						  {
								  m = j;

						  }
						  j = 0;
		}
		System.out.printf("%d",m);
		return 0;
	}
}

