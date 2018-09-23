package <missing>;

public class GlobalMembers
{
	public static int[] max = new int[26];
	public static int[] a = new int[26];
	public static void attack(int n)
	{
		int i = 0;
		int j = 0;
		int premax = 0;
		for (i = 0;i < n;i++)
		{
			max[i] = 1;
			for (j = 0;j < i;j++)
			{
				if (a[i] <= a[j])
				{
				premax = max[j] + 1;
				if (premax > max[i])
				{
				max[i] = premax;
				}
				}
			}
		}
	}
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int Main_n;
int i;
int num = 0;
	public static int Main()
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int n,i,num=0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			Main_n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < Main_n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		attack(Main_n);
		num = max[0];
		for (i = 1;i < Main_n;i++)
		{
		if (max[i] > num)
		{
		num = max[i];
		}
		}
		System.out.printf("%d",num);
	}
}

