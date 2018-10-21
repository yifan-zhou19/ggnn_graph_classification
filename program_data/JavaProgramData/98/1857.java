package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int len;
	public static int tot;
	public static char[][] a = new char[1000][50];
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void fill(int p);
	public static int Main()
	{
		int i;
		int j;
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
				a[i] = tempVar2.charAt(0);
			}
		}
		System.out.printf("%s",a[0]);
		tot = String.valueOf(a[0]).length();
		for (i = 1;i < n;i++)
		{
			len = String.valueOf(a[i]).length();
			if (tot + len + 1 <= 80)
			{
				System.out.printf(" %s",a[i]);
				tot += len + 1;
			}
			else
			{
				System.out.print("\n");
				System.out.printf("%s",a[i]);
				tot = len;
			}
		}
	}

}

