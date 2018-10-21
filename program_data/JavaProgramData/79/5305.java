package <missing>;

public class GlobalMembers
{
	public static int bianhao(int m, int n)
	{
		int s = 0;
		int i;
		for (i = 2;i <= n;i++)
		{
			s = (s + m) % i;
		}
		s = s + 1;
		return s;
	}
	public static int Main()
	{
		int i;
		int a;
		int t;
		int[] m = new int[10000];
		int[] n = new int[301];

		for (i = 0;i > -1;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead("""");
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			if ((m[i] == 0) && (n[i] == 0))
			{
				break;
			}
		}
		for (t = 0;t < i;t++)
		{
			a = bianhao(m[t], n[t]);
			System.out.printf("%d\n",a);
		}
		 return 0;
	}



}

