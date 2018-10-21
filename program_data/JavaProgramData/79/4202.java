package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int effect = new int(int n,int m);
		int[] b = new int[20];
		int[] c = new int[20];
		int j = 0;
		int k;
		for (k = 1;k <= 20;k++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b[k] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c[k] = Integer.parseInt(tempVar2);
		}
		if (b[k] != 0 || c[k] != 0)
		{
				j++;
		}
		else
		{
			break;
		}
		}
		for (k = 1;k <= j;k++)
		{
			System.out.printf("%d\n",effect(b[k], c[k]));
		}
	}

	public static int effect(int n,int m)
	{
		int i;
		int s = 0;
		for (i = 2; i <= n; i++)
		{
			s = (s + m) % i;
		}
		return (s + 1);
	}


}

