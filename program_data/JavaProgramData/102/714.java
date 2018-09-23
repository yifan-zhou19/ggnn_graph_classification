package <missing>;

public class GlobalMembers
{
	// test11.cpp : Defines the entry point for the console application.
	//

	public static String a = new String(new char[10]);
	public static float[] man = new float[100];
	public static float[] woman = new float[100];
	public static int l1 = 1;
	public static int l2 = 1;

	public static int Main()
	{
		int M;
		float b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			M = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= M;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Float.parseFloat(tempVar3);
			}
				if (a.charAt(0) == 'm')
				{
					man[l1++] = b;
				}
				else
				{
					woman[l2++] = b;
				}
		}
		sort(man + 1,man + l1);
		sort(woman + 1,woman + l2);

		System.out.printf("%.2f",man[1]);
		for (int i = 2;i < l1;i++)
		{
			System.out.printf(" %.2f",man[i]);
		}
		for (int i = l2 - 1;i >= 1;i--)
		{
			System.out.printf(" %.2f",woman[i]);
		}
		System.out.println("");
		//getchar();
		//getchar();
		//getchar();
		return 0;
	}


}

