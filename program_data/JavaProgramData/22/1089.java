package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int max = 0;
		int i;
		int sec = 0;
		int[] a = new int[301];
		char c;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c != ',')
			{
				break;
			}
		}
		n = i;
		for (i = 1;i <= n;i++)
		{
			if (a[i] > a[max])
			{
				sec = a[max];
				max = i;
			}
			else if (a[i] > sec && a[i] < a[max])
			{
				sec = a[i];
			}
		}
		if (a[max] == sec || sec == 0)
		{
			System.out.print("No");
		}
		else
		{
		System.out.printf("%d",sec);
		}
		return 0;
	}
}

