package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_a = new int[300];
	public static int Main()
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int a[300];
		int i;
		int max = 0;
		int cmax = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			Main_a[0] = Integer.parseInt(tempVar);
		}
		for (i = 1;System.in.read() == ',';i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				Main_a[i] = Integer.parseInt(tempVar2);
			}
		}

		for (i = 0;i < 300;i++)
		{
			if (Main_a[i] > max)
			{
				max = Main_a[i];
			}
		}

		for (i = 0;i < 300;i++)
		{
			if ((Main_a[i] != max) && (Main_a[i] > cmax))
			{
				cmax = Main_a[i];
			}
		}
		if (cmax == 0)
		{
			System.out.print("No\n");
		}
			else
			{
		System.out.printf("%d",cmax);
			}
		return 0;
	}
}

