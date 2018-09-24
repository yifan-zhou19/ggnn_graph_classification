package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int number;
		int i;
		int j;
		int f;
		int g;
		int s;
		int k = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			number = Integer.parseInt(tempVar);
		}
		int[] num = new int[20000];
		for (i = 2;i < number;i++)
		{
			s = i - 1;
		for (j = (i - 1);j > 0;j--)
		{
		if (i % j != 0)
		{
		s--;
		}
		}
	   if (s == 1)
	   {
		   num[k] = i;
		k++;
	   }
		}
	   for (f = k - 1;f > 0;f--)
	   {
					  for (g = 1;g <= f;g++)
					  {
						  if (num[f] + num[g] == number)
						  {
					  System.out.printf("%d %d\n",num[g],num[f]);
						  }
					  }
	   }
	  System.in.read();
	  System.in.read();
	  return 0;
	}
}

