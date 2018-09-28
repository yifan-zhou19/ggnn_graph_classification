package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
	int[] b = new int[50];
	int sb;
	int lb;
	int h = 0;
	int k = 0;
	int n;
	int i = 0;
	while (true)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = tempVar.charAt(0);
		}
		b[i] = String.valueOf(a[i]).length();
	//	printf("%d ",b[i]);//
		if (System.in.read() == '\n')
		{
			break;
		}
		else
		{
			i++;
			n = i;
		}
	}
	sb = b[0];
	lb = b[0];
	for (i = 0;i <= n;i++)
	{
		if (lb < b[i])
		{
			lb = b[i];
			h = i;
		}
		if (sb > b[i])
		{
			sb = b[i];
			k = i;
		}
	}
	System.out.printf("%s",a[h]);
	System.out.printf("\n%s",a[k]);
	return 0;
	}
}

