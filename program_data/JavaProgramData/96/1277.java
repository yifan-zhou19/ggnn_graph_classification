package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int x;
		int y;
		int z;
		int[] b = new int[1000];
		int[] c = new int[1000];
		String a = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();
		for (i = 0;i < l;i++)
		{
						b[i] = a.charAt(i) - '0';
		}
		b[l] = 0;
		for (i = 0;i < l;i++)
		{
						c[i] = b[i] / 13;
						b[i + 1] = (b[i] % 13) * 10 + b[i + 1];
		}
		if (l == 1)
		{
			System.out.printf("%d",0);
		}
		if (c[1] != 0)
		{
			System.out.printf("%d",c[1]);
		}
		else if (l == 2)
		{
			System.out.printf("%d",c[1]);
		}
		for (i = 2;i < l;i++)
		{
						System.out.printf("%d",c[i]);
		}
		System.out.printf("\n%d",b[l] / 10);

	}



}

