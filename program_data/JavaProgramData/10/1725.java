package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int[] h = new int[26];
		int[] amount = new int[26];
		int s = 0;
		for (i = 0;i < k;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  h[i] = Integer.parseInt(tempVar2);
		  }
		  amount[i] = 1;
		}
		for (i = k - 2;i >= 0;i--)
		{
		  for (j = i + 1;j < k;j++)
		  {
			if ((h[i] >= h[j]) && (amount[i] < amount[j] + 1))
			{
			  amount[i] = amount[j] + 1;
			}
		  }
		}
		for (i = 0;i < k;i++)
		{
		  if (amount[i] > s)
		  {
			s = amount[i];
		  }
		}
		System.out.printf("%d\n",s);
	}
}

