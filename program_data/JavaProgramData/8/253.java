package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int i;
	public static int[] str = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: The following statement was not recognized, possibly due to an unrecognized macro:
	void get();
	public static void sort()
	{
		int i;
		int j;
		int temp;
		for (i = 0;i < m;i++)
		{
			for (j = i + 1;j < m;j++)
			{
		if (str[j] < str[i])
		{
		temp = str[i];
		str[i] = str[j];
		str[j] = temp;
		}
			}
		}
		for (i = m;i < m + n;i++)
		{
			for (j = i + 1;j < m + n;j++)
			{
		if (str[j] < str[i])
		{
		temp = str[i];
		str[i] = str[j];
		str[j] = temp;
		}
			}
		}
	}
	public static int join()
	{
		return 0;
	}
	public static void print()
	{
		System.out.printf("%d",str[0]);
	for (i = 1;i < m + n;i++)
	{
	System.out.printf(" %d",str[i]);
	}
	}
	public static void get()
	{
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
		for (i = 0;i < m + n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				str[i] = Integer.parseInt(tempVar3);
			}
		}
	}
	public static void Main()
	{
		get(str);
	sort(str);
	join(str);
	print(str);
	}
}

