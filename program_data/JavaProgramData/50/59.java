package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_p = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int Main()
	{
		int w;
		int a = 0;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int p[13]={0,31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i = 0;i < 13;i++)
		{
			a = a + Main_p[i];
			b = a + 12;
			c = b % 7;
			d = w + c;
			if (d % 7 == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
		return 0;
	}

}

