package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int b;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		i = 0;
		do
		{
			a[i] = b % 10;
			b = b / 10;
			i++;
		}while (b > 0);
		n = i;
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d",a[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

