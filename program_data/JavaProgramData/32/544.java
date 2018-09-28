package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int[] c = new int[100];
		int[] d = new int[100];
		int i;
		int l1;
		int l2;
		int n;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			l1 = a.length();
			l2 = b.length();
			//printf("%d,%d\n",l1,l2);
			for (i = 0;i < l1;i++)
			{
			c[i] = a.charAt(l1 - i - 1) - '0';
			}
			for (i = 0;i < l2;i++)
			{
			d[i] = b.charAt(l2 - i - 1) - '0';
			}

			for (i = 0;i < l2;i++)
			{
				c[i] -= d[i];
				if (c[i] < 0)
				{
					c[i] += 10;
					c[i + 1]--;
				}
			}
			for (i = l1 - 1;i >= 0;i--)
			{
			if (c[i] != 0)
			{
				break;
			}
			}
			for (j = i;j >= 0;j--)
			{
			System.out.printf("%d",c[j]);
			}
			System.out.print("\n");
		}

	}
}

