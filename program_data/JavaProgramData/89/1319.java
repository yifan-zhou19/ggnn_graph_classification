package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int i;
		int j;
		int[] relation;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		relation = new int[num * num];
		assert relation != null;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(relation,0,num * num * (Integer.SIZE / Byte.SIZE));

		i = 1;
		j = 1;

		while (!(i == 0 && j == 0))
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				i = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				j = Integer.parseInt(tempVar3);
			}
			relation[j * num + i] = 1;
		}

		j = 0;
		for (i = 1;i < num;i++)
		{
			if (relation[j * num + i] == 0)
			{
				j = i;
			}
		}

		for (i = 0;i < num;i++)
		{
			if (i != j)
			{
				if (relation[j * num + i] == 0)
				{
					System.out.print("NOT FOUND");
					return 0;
				}
			}
		}

		System.out.printf("%d",j);
		return 0;

	}
}

