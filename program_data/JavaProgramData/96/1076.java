package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int n;
		int i;
		int m;
		int f;
		int j;
		n = a.length();
		int[] b = new int[99];
		if (n == 1)
		{
				System.out.print("0\n");
				System.out.printf("%d",a.charAt(0) - '0');
		}
		else if (((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0')) < 13 && n == 2)
		{
				System.out.print("0\n");
				System.out.printf("%d",((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0')));
		}
		else
		{
		m = ((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0')) / 13;
		f = ((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0')) % 13;
		if (m == 0)
		{
				m = ((a.charAt(0) - '0') * 100 + (a.charAt(1) - '0') * 10 + (a.charAt(2) - '0')) / 13;
				f = ((a.charAt(0) - '0') * 100 + (a.charAt(1) - '0') * 10 + (a.charAt(2) - '0')) % 13;
				System.out.printf("%d",m);
				for (i = 1;i < n - 2;i++)
				{
								b[i] = (f * 10 + (a.charAt(i + 2) - '0')) / 13;
								f = (f * 10 + (a.charAt(i + 2) - '0')) % 13;
								System.out.printf("%d",b[i]);
				}
				System.out.print("\n");
				System.out.printf("%d",f);
		}
		else
		{
				System.out.printf("%d",m);
				for (i = 1;i < n - 1;i++)
				{
								b[i] = (f * 10 + (a.charAt(i + 1) - '0')) / 13;
								f = (f * 10 + (a.charAt(i + 1) - '0')) % 13;
								System.out.printf("%d",b[i]);
				}
				System.out.print("\n");
				System.out.printf("%d",f);
		}
		}
		return 0;
	}
}

