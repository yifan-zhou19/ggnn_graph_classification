package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ZFC = new String(new char[105]);
		int[] SZ = new int[105];
		int n;
		int e = 0;
		int s = 0;
		ZFC = new Scanner(System.in).nextLine();
		n = ZFC.length();
		for (int i = 0;i < n;i++)
		{
			SZ[i] = ZFC.charAt(i) - 48;
		}
		int a = SZ[0];
		for (int j = 0;j < n - 1;j++)
		{
			e = 10 * a + SZ[j + 1];
			s = e / 13;
			a = e % 13;
			if (j == 0 && s == 0)
			{
				continue;
			}
			if (j < n - 2)
			{
				System.out.printf("%d",s);
			}
			else if (j == n - 2)
			{
				System.out.printf("%d\n",s);
				System.out.printf("%d\n",a);
			}
		}

		if (n == 1)
		{
		System.out.print("0\n");
		System.out.printf("%d\n",SZ[0]);
		}
		if (n == 2 && SZ[0] * 10 + SZ[1] < 13)
		{
		System.out.print("0\n");
		System.out.printf("%d\n",SZ[0] * 10 + SZ[1]);
		}
		//scanf("%d",&n);
		return 0;
	}

}
