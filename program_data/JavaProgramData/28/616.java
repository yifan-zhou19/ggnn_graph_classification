package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[300][50];
		char m;
		int i = 1;
		int j = 0;
		int n = 0;
		int[] b = new int[300];
		int t;

		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar.charAt(0);
			}
			if ((m = System.in.read()) == ' ')
			{
				i = i + 1;
				n = n + 1;
				continue;
			}
			else if (m == '\n')
			{
				n = n + 1;
				break;
			}
		}
		for (i = 1;i < n;i++)
		{
			t = String.valueOf(a[i]).length();
			System.out.printf("%d,",t);
		}
		t = String.valueOf(a[n]).length();
		System.out.printf("%d",t);
	}

}

