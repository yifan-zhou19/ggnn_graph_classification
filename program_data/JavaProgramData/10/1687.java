package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int max = 0;
		int maxall = 1;
		int[] num = new int[10000];
		int[] hight = new int[10000];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			hight[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num[i] = 0;
		}
		num[0] = 1;
		for (i = 1;i < k;i++)
		{
		  max = 1;
		  for (j = 0;j < i;j++)
		  {
			  if (hight[j] >= hight[i] != 0 && max < num[j] + 1)
			  {
				  max = num[j] + 1;
			  }
		  }
		  num[i] = max;
		  if (num[i] > maxall)
		  {
			  maxall = num[i];
		  }
		}
		System.out.print(maxall);
		System.out.print("\n");
		return 0;
	}
}

