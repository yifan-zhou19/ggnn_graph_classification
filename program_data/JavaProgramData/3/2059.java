package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
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
		int[] SZ = new int[n];
		for (int m = 0;m < n;m++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				SZ[m] = Integer.parseInt(tempVar3);
			}
		}
		for (int i = 0;i < n - 1;i++)
		{
				int I = 0;
				int J = 0;
			for (int j = 1;j < n - 1 - i;j++)
			{

				if (SZ[i] + SZ[i + j] == k)
				{
				   System.out.print("yes");
				   I = i,J = j;
				   break;
				}
			}
				   if (SZ[I] + SZ[I + J] == k)
				   {

				   break;
				   }



		if (i == n - 2)
		{
		   System.out.print("no");
		}
		}
		return 0;
	}
}

