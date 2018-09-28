package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] fun_b = new int[5];
int i = 0;
int c = 0;
	public static int fun(int a)
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int b[5],i=0,c=0;
	int j;
	int k;
	fun_b[i] = a % 10;
	i++;
	a = a / 10;
	if (a > 0)
	{
		fun(a);
	}
	else
	{
		for (k = 0;k <= i;k++)
		{
		for (j = 0;j < i - k - 1;j++)
		{
	fun_b[k] = fun_b[k] * 10;
		}
	c = c + fun_b[k];
		}
	}
	return (c);
	}
	public static int Main()
	{
		int n;
		int d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	d = fun(n);
	System.out.printf("%d",d);
	return 0;
	}
}

