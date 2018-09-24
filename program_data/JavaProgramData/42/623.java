package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int sum = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] string = new int[100000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=String;
		int p = String;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p + i = Integer.parseInt(tempVar2);
			}
		}
		int k;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			if (String[i] != k)
			{
				System.out.printf("%d",*(p + i));
				break;
			}
		}
		for (j = i + 1;j < n;j++)
		{
			if (String[j] != k)
			{
				System.out.printf(" %d",*(p + j));
			}
		}
	}


}

