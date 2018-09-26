package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[300];
		int[] m = new int[3000];
		int i;
		int[] s = new int[300];
		int p;
		int x;
		for (x = 0;x < 300;x++)
		{
			s[x] = 0;
		}
		for (p = 0;;p++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[p] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[p] = Integer.parseInt(tempVar2);
			}
			if (n[p] != 0 && m[p] != 0)
			{
				 for (i = 2;i <= n[p];i++)
				 {
					s[p] = (s[p] + m[p]) % i;
				 }
					System.out.printf("%d\n",s[p] + 1);
			}
			else
			{
				break;
			}
		}
		return 0;
	}

}

