package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[256]);
		String s2 = new String(new char[256]);
		int[] c = new int[256];
		int a;
		int b;
		int i;
		int l1;
		int l2;
		int n;
		int j;
		int l;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0; j < n; j++)
		{
			l = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(c, 0, (Integer.SIZE / Byte.SIZE));
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s2 = tempVar3.charAt(0);
			}

			// ??????????
			l1 = (int)s1.length();
			l2 = (int)s2.length();

			while (l1 > 0 || l2 > 0)
			{
				// ?????????
				a = (l1 > 0) ? s1.charAt(--l1) - '0' : 0;
				b = (l2 > 0) ? s2.charAt(--l2) - '0' : 0;
				// ????????????????
				// ????????????????????
				c[l] += a - b;
				c[l + 1] = (c[l] - 9) / 10;
				c[l] = (c[l] + 10) % 10;
				l++;
			}

			// ??????????????????
			while (c[l] == 0 && l > 0)
			{
				l--;
			}
			for (i = l; i >= 0; i--)
			{
				System.out.printf("%d", c[i]);
			}
			System.out.print("\n");
		}
	return 0;
	}
}

