package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int length;
		int i;
		int j;
		int temp;
		int start = -1;
		int end;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			length = Integer.parseInt(tempVar);
		}
		for (i = 0;i < length;i++)
		{
			for (j = 0;j < length;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					temp = Integer.parseInt(tempVar2);
				}
				if (temp == 0)
				{
					if (start == -1)
					{
						start = i * length + j;
					}
					end = i * length + j;
				}
			}
		}
		System.out.printf("%d",(end / length - start / length - 1) * (end % length - start % length - 1));
	}
}

