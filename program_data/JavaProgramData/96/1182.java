package <missing>;

public class GlobalMembers
{
	public static void trans(tangible.RefObject<String> s, int[] p)
	{
		 int n;
		 int i;
		 n = s.argValue.length();
		 for (i = 0;i < n;i++)
		 {
			 p[i] = s.argValue.charAt(i) - '0';
		 }
	}
	public static int Main()
	{
		String str = new String(new char[110]);
		int[] a = new int[110];
		int[] b = new int[110];
		int i;
		int j;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
	tangible.RefObject<String> tempRef_str = new tangible.RefObject<String>(str);
		trans(tempRef_str, a);
		str = tempRef_str.argValue;
		n = str.length();
		for (i = 0;i < n - 1;i++)
		{
			b[i + 1] = (10 * a[i] + a[i + 1]) / 13;
			a[i + 1] = (a[i + 1] + 10 * a[i]) % 13;
		}
		for (j = 0,k = 0;j < n;j++)
		{
			if (b[j] != 0)
			{
				k++;
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

