package <missing>;

public class GlobalMembers
{
	public static int killer(int n,int m)
	{
		int[] a = new int[301];
		int i = 0;
		int j = 1;
		int k = n;
		while (k > 1)
		{
			if (a[i] == 0)
			{
				if (j == m)
				{
				a[i] = 1;
				k--;
				j = 1;
				}
				else
				{
					j++;
				}
			}
			i++;
			if (i >= n)
			{
				i = 0;
			}
		}
			for (i = 0;i < n;i++)
			{
				if (a[i] == 0)
				{
					return i + 1;
				}
			}
	}

	public static int Main()
	{
		  int n;
		  int m;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  m = Integer.parseInt(tempVar2);
		  }
		  while (n != 0)
		  {
			  System.out.printf("%d\n",killer(n, m));
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  n = Integer.parseInt(tempVar3);
			  }
			  String tempVar4 = ConsoleInput.scanfRead(" ");
			  if (tempVar4 != null)
			  {
				  m = Integer.parseInt(tempVar4);
			  }
		  }
	}
}

