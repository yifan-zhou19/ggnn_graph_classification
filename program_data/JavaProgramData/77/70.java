package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p;
		int[] num = new int[255];
		char ch;
		char boy;
		num[0] = 0;
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			boy = tempVar.charAt(0);
		}
		for (n = p = 1;p > 0;n++)
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				ch = tempVar2.charAt(0);
			}
			if (ch == boy)
			{
				num[p] = n;
				p++;
			}
			else
			{
				System.out.printf("%d %d\n",num[p - 1],n);
				p--;
			}
		}
		return 0;
	}

}

