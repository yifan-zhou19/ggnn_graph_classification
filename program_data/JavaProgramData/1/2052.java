package <missing>;

public class GlobalMembers
{
	public static int[] s = new int[100];
	public static int f(int a,int min)
	{
	if (a < min)
	{
	return 0;
	}
	int result = 1;
	for (int i = min;i < a;i++)
	{
	if (a % i == 0)
	{
	result += f(a / i, i);
	}
	}
	return result;
	}

	public static int Main()
	{
		int m;
		int mm;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < m;i++)
	{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				mm = Integer.parseInt(tempVar2);
			}
	/*for(int i=0;i<m+1;i++){s[i]=0;printf("%d",s[i]);}*/
	 System.out.printf("%d\n",f(mm, 2));
	}
	}

}

