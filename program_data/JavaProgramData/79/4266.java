package <missing>;

public class GlobalMembers
{
	public static void ysfwt(int n,int m)
	{
		int i;
		int s = 0;
		for (i = 2;i <= n;i++)
		{
			s = (s + m) % i;
		}
		System.out.printf("%d\n",s + 1);
	}
	public static void Main()
	{
		int j;
		int n;
		int m;
		for (j = 0;;j++)
		{
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
		if (m != 0 && n != 0)
		{
			ysfwt(n, m);
		}
		else
		{
			break;
		}
		}
	}



}

