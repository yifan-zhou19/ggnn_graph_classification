package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_a = new int[16];
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_b = new int[16];
	public static int Main()
	{
	int x;
	int y;
	int i;
	int j;
	int m;
	int n;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//static int a[16];
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//static int b[16];
	Main_a[0] = 10000;
	Main_b[0] = 20000;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		y = Integer.parseInt(tempVar2);
	}
	Main_a[1] = x;
	Main_b[1] = y;
	for (i = 2;x > 1;i++)
	{
		  Main_a[i] = x / 2;
	   x = x / 2;
	}
	m = i - 1;
	for (j = 2;y > 1;j++)
	{
		  Main_b[j] = y / 2;
		y = y / 2;
	}
	n = j - 1;
	do
	{
		if (Main_a[m] == Main_b[n])
		{
		 m--;
		}
		 n--;
	}while (Main_a[m] == Main_b[n]);
	System.out.printf("%d",Main_a[m + 1]);
	}




}

