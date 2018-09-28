package <missing>;

public class GlobalMembers
{
	public static void NX()
	{
		int j;
		j = 0;
		for (int i = n - 1;i >= 0;i--)
		{
			nx[j] = sz[i];
			j++;
		}
	}
	public static int n;
	public static int[] sz = new int[100];
	public static int[] nx = new int[100];
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		NX();
		for (int i = 0;i < n;i++)
		{
			if (i < n - 1)
			{
			System.out.printf("%d ",nx[i]);
			}
			else
			{
				System.out.printf("%d",nx[i]);
			}
		}
		return 0;
	}



}

