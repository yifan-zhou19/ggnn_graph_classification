package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_a = new int[16];
	public static int Main()
	{
		int n;
		int m;
		int k;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//static int a[16];
	while (scanf("%d", Main_a[0]) && Main_a[0] != -1)
	{
		for (k = 1;k <= 15;k++)
		{
		String tempVar = ConsoleInput.scanfRead(" ");
		if (tempVar != null)
		{
			Main_a[k] = Integer.parseInt(tempVar);
		}
	if (Main_a[k] == 0)
	{
	break;
	}
		}
	n = 0;
	for (k = 0;Main_a[k] != 0;k++)
	{
	for (m = 0;Main_a[m] != 0;m++)
	{
	if (Main_a[m] == 2 * Main_a[k])
	{
		n++;
		break;
	}
	}
	}
	System.out.printf("%d\n",n);
	}
	return 0;
	}

}

