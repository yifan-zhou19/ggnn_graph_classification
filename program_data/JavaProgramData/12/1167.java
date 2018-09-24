package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0; //n is the num of int
		int[] m = new int[20];
		int i = 0;
		int j = 0;
		int t = 0;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		while (m[0] > 0)
		{
			n = 1;
			t = 0;
			while (c != '\n')
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					m[n++] = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(null, 1);
				if (tempVar4 != null)
				{
					c = tempVar4.charAt(0);
				}
			}
			n--;
			for (i = 0;i < n;i++)
			{
				for (j = n;j > i;j--)
				{
					if ((m[j] == 2 * m[i]) || (m[i] == 2 * m[j]))
					{
						t++;
					}
				}
			}
			System.out.printf("%d\n",t);
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				m[0] = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(null, 1);
			if (tempVar6 != null)
			{
				c = tempVar6.charAt(0);
			}
		}
		return 0;
	}
}

