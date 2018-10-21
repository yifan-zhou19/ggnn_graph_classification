package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[26];
	public static int k;
	public static int max = 1;

	public static void f(int i,int n)
	{
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//	extern int a[26],k,max;
		int j;
		if (i == (k - 1))
		{
			if (n > max)
			{
				max = n;
			}
			return;
		}
		for (j = i + 1;j < k;j++)
		{
			if (a[i] >= a[j])
			{
				f(j, n + 1);
			}
			else
			{
				if (n > max)
				{
					max = n;
				}
			}
		}
	}

	public static int Main()
	{
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//	extern int a[26],k,max;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < k;i++)
		{
			f(i, 1);
		}
		System.out.printf("%d",max);
		return 0;
	}
}

