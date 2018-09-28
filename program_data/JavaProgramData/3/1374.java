package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	int n;
	int k;
	int a;
	int h;
	int[] sz = new int[1000];
	h = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	for (int i = 0;i < n;i++)
	{
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   sz[i] = Integer.parseInt(tempVar3);
	   }
	}
	for (int j = 0;j < n;j++)
	{
		for (int r = 0;r < n;r++)
		{
			a = sz[j] + sz[r];
			if (a != k)
			{
			   h++;
			}

		}
	}
	if (h == n * n)
	{
		System.out.print("no");
	}
	else
	{
		System.out.print("yes");
	}



	}

}

