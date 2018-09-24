package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] num = new int[20001];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,0,20001);
		int i;
		int j;
		int count = 1;
		int number;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				number = Integer.parseInt(tempVar2);
			}
			if (i == 1)
			{
				num[0] = number;
			}
			else
			{
				for (j = 1;j <= count;j++)
				{
					if (number == num[j - 1])
					{
						break;
					}
					else
					{
					}
					if (j == count)
					{
						count++;
						num[count - 1] = number;
					}
					else
					{
					}
				}
			}
		}
		for (i = 1;i < count;i++)
		{
			System.out.printf("%d ",num[i - 1]);
		}
		System.out.printf("%d",num[count - 1]);
		return 0;
	}
}

