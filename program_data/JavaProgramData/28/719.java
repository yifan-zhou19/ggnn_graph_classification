package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[301];
		int n = 0;
		char[][] zf = new char[300][100];
		for (i = 0;i < 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				zf[i] = tempVar.charAt(0);
			}
			a[i] = String.valueOf(zf[i]).length();
			if (a[i] == 0)
			{
				break;
			}
			n++;
		}
		for (i = 0;i < n - 1;i++)
		{
			 System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d",a[i]);
		return 0;
	}


}

