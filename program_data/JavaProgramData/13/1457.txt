package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] shuzu = new int[n];
		for (i = 0;i < n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  shuzu[i] = Integer.parseInt(tempVar2);
		  }
		}
		System.out.printf("%d",shuzu[0]);
		for (i = 1;i < n;i++)
		{
		  for (j = 0;j < i;j++)
		  {
			  if (j < i - 1)
			  {
				if (shuzu[i] == shuzu[j])
				{
				  break;
				}
			  }
			  if (j == i - 1)
			  {
				if (shuzu[i] != shuzu[j])
				{
				  System.out.printf(" %d",shuzu[i]);
				}
			  }
		  }
		}
		return 0;
	}
}

