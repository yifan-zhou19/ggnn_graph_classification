package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_a = new int[100];
int[] b = new int[100];
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int a[100],b[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}

		for (i = 0;i < m;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			Main_a[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < n;i++)
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b[i] = Integer.parseInt(tempVar4);
		}
		}
		for (i = 0;i < m - 1;i++)
		{
			for (j = i + 1;j < m;j++)
			{
			if (Main_a[j] < Main_a[i])
			{
				Main_a[j] = Main_a[j] + Main_a[i];
				Main_a[i] = Main_a[j] - Main_a[i];
				Main_a[j] = Main_a[j] - Main_a[i];
			}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
			if (b[j] < b[i])
			{
				b[j] = b[j] + b[i];
				b[i] = b[j] - b[i];
				b[j] = b[j] - b[i];
			}
			}
		}
		for (i = m;i < m + n;i++)
		{
		Main_a[i] = b[i - m];
		}
		for (i = 0;i < m + n - 1;i++)
		{
		System.out.printf("%d ",Main_a[i]);
		}
	System.out.printf("%d",Main_a[m + n - 1]);
	}
}

