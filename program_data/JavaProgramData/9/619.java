package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] a = new char[100][10];
		int[] x = new int[100];
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			x[i] = Integer.parseInt(tempVar3);
		}
		}
		for (j = 100;j >= 60;j--)
		{
						for (i = 0;i < n;i++)
						{
							if (x[i] == j)
							{
							System.out.printf("%s\n",a[i]);
							}
						}
		}
		for (i = 0;i < n;i++)
		{
						if (x[i] < 60)
						{
						System.out.printf("%s\n",a[i]);
						}
		}
		System.in.read();
		System.in.read();
	}


}

