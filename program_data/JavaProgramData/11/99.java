package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_d = {0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int Main()
	{
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int d[13]={0,31,0,31,30,31,30,31,31,30,31,30,31};
		if (a % 4 == 0 && a % 100 != 0 || a % 100 == 0)
		{
			Main_d[2] = 29;
		}
		else
		{
			Main_d[2] = 28;
		}
		int i;
		int sum = 0;
		for (i = 1;i < b;i++)
		{
			sum += Main_d[i];
		}
		sum += c;
		System.out.printf("%d",sum);
		return 0;
	}


}

