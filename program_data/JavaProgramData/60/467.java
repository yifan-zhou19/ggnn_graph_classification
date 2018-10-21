package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[3900];
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			System.out.print("empty\n");
		}
		else
		{
		  for (i = 2;i <= n;i++)
		  {
			  for (j = 2;j < i;)
			  {
			  if (i % j == 0)
			  {
					break;
			  }
				else
				{
					j++;
				}
			  }
		  if (j == i)
		  {
				a[k] = i;
				k++;
		  }
		  }

		 for (i = 0;i < k;i++)
		 {

			if (a[i + 1] - a[i] == 2)
			{
				System.out.printf("%d %d\n",a[i],a[i + 1]);
			}
		 }
		}
	}

}

