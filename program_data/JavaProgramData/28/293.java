package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[300][1000];
		int i;
		int j;
		int k;
		int[] a = new int[10000];
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str[i] = tempVar.charAt(0);
			}
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		for (j = 0;j <= i;j++)
		{
			a[j] = String.valueOf(str[j]).length();
		}
		for (k = 0;k <= i;k++)
		{
			if (k == i)
			{
				System.out.printf("%d\n",a[k]);
			}
			else
			{
				System.out.printf("%d,",a[k]);
			}
		}
	}
}

