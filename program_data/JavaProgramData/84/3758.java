package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int[] shuzu = new int[111];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 shuzu[i] = Integer.parseInt(tempVar2);
						 }
		}
		for (i = 0;i < n;i++)
		{
						  if (a < shuzu[i])
						  {
										   a = shuzu[i];
						  }
		}
		System.out.printf("%d\n",a);
		for (i = 0;i < n;i++)
		{
						  if (a == shuzu[i])
						  {
											  shuzu[i] = 0;
						  }
		}
		for (i = 0;i < n;i++)
		{
						  if (b < shuzu[i])
						  {
										  b = shuzu[i];
						  }
		}
		 System.out.printf("%d",b);
		 return 0;
	}

}

