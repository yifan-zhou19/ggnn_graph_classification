package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[110];
		int[] t = a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t++ = Integer.parseInt(tempVar2);
			}
		}
		//??????
		for (i = 0;i < n / 2;i++)
		{
			t[0] = a[i];
			a[i] = (a + n - 1 - i); //?????
			a[n - 1 - i] = t;
		}
		System.out.printf("%d",a[0]); //?????
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",a[i]);
		}
		return 0;
	}
}

