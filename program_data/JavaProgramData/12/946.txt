package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int[] a = new int[20];
		int t;
		int sum;
		int i;
		int j;
		while (true)
		{
			t = sum = 0;
			while (true)
			{
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   c = Integer.parseInt(tempVar);
			   }
			   if (c == 0 || c == -1)
			   {
				   break;
			   }
			   a[t++] = c;
			}
			if (c == -1)
			{
				break;
			}
			for (i = 0;i < t;i++)
			{
			for (j = 0;j < t;j++)
			{
				if (a[j] == a[i] * 2)
				{
					sum++;
				}
			}
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

