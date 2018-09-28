package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[200]);
		int[] a = new int[200];
		int[] b = new int[200];
		int c;
		int i;
		int j;
		int k;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		n = str.length();
		for (i = 0;i < n;i++)
		{
			a[i] = str.charAt(i) - '0';
		}
		for (i = 1;i < n;i++)
		{
			a[i] = 10 * a[i - 1] + a[i];
			b[i] = a[i] / 13;
			a[i] = a[i] % 13;
		}
		for (i = 0,k = 0;i < n;i++)
		{
			if (b[i] != 0)
			{
				k++,j = i;
				break;
			}
		}
		if (k == 0)
		{
			System.out.print("0\n");
		}
		else
		{
			for (i = j;i < n;i++)
			{
				System.out.printf("%d",b[i]);
			}
			System.out.print("\n");
		}
		System.out.printf("%d\n",a[n - 1]);
	}


}

