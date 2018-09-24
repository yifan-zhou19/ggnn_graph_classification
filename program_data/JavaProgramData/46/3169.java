package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int r;
		int c;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		int a;
		int l;
		int m;
		int n;
		int i;
		int up;
		int dn;
		int le;
		int ri;
		int k = 1;
		int end = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		l = r * c;
		up = 1;
		dn = r;
		le = 1;
		ri = c;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc((Integer.SIZE / Byte.SIZE) * (l + 1));
		for (i = 1; i <= l; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				*(a + i) = tempVar3;
			}
		}
		System.out.printf("%d", *(a + 1));
		do
		{
			for (n = le; n <= ri; n++)
			{
				if (up == 1 && n == 1)
				{
					continue;
				}
				System.out.printf("\n%d", *(a + (up - 1) * c + n));
				k++;
				if (k == l)
				{
					end = 1;
				}
			}
			up++;
			if (end == 1)
			{
				break;
			}
			for (m = up; m <= dn; m++)
			{
				System.out.printf("\n%d", *(a + (m - 1) * c + ri));
				k++;
				if (k == l)
				{
					end = 1;
				}
			}
			ri--;
			if (end == 1)
			{
				break;
			}
			for (n = ri; n >= le; n--)
			{
				System.out.printf("\n%d", *(a + (dn - 1) * c + n));
				k++;
				if (k == l)
				{
					end = 1;
				}
			}
			dn--;
			if (end == 1)
			{
				break;
			}
			for (m = dn; m >= up; m--)
			{
				System.out.printf("\n%d", *(a + (m - 1) * c + le));
				k++;
				if (k == l)
				{
					end = 1;
				}
			}
			le++;
			if (end == 1)
			{
				break;
			}
		} while (k != l);
	}
}

