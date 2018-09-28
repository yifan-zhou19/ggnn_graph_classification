package <missing>;

public class GlobalMembers
{
	public static int len1;
	public static int len2;
	public static int[] sz1;
	public static int[] sz2;

	public static void read()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			len1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			len2 = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		sz1 = (int)malloc(LEN * (len1 + len2));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		sz2 = (int)malloc(LEN * len2);

		for (i = 0;i < len1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz1 + i = tempVar3;
			}
		}
		for (i = 0;i < len2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				sz2 + i = tempVar4;
			}
		}
	}
	public static void sort()
	{
		int i;
		int j;
		int temp;

		for (i = 0;i < len1;i++)
		{
			for (j = i + 1;j < len1;j++)
			{
				if (sz1[i] > sz1[j])
				{
					temp = sz1[i];
					sz1[i] = sz1[j];
					sz1[j] = temp;
				}
			}
		}
		for (i = 0;i < len2;i++)
		{
			for (j = i + 1;j < len2;j++)
			{
				if (sz2[i] > sz2[j])
				{
					temp = sz2[i];
					sz2[i] = sz2[j];
					sz2[j] = temp;
				}
			}
		}
	}
	public static void combine()
	{
		int i;
		for (i = 0;i < len2;i++)
		{
			sz1[len1 + i] = sz2[i];
		}
	}
	public static void print()
	{
		int i;
		System.out.printf("%d",sz1[0]);
		for (i = 1;i < len1 + len2;i++)
		{
			System.out.printf(" %d",sz1[i]);
		}
		System.out.print("\n");
	}

	public static void Main()
	{
		read();
		sort();
		combine();
		print();
	}

}

