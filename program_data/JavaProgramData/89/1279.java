package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int mingren = 0;
		int count;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *person = null;
		int person = null;
		int num = 0;
		int temp1;
		int temp2;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		count = num;

		int[][] relation = new int[num];
		for (i = 0; i < num; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			relation[i] = (int)malloc(num * (Integer.SIZE / Byte.SIZE));
		}
		//?????,?????????
		do
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				temp1 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				temp2 = Integer.parseInt(tempVar3);
			}
			relation[temp1][temp2] = 1;
		} while (temp2 != 0 || temp1 != 0);
		//////////////////////////////////////////////////////////
		temp1 = 0;
		temp2 = 1;
		for (i = 0; i < num - 2; i++)
		{
			if (relation[temp1][temp2] == 1)
			{
				temp1 = num - 1 - i;
			}
			else
			{
				temp2 = num - 1 - i;
			}
		}
		if (relation[temp1][temp2] == 1)
		{
			mingren = temp2;
		}
		else
		{
			mingren = temp1;
		}

		for (i = 0; i < num; i++) //?????????
		{
			if (i != mingren)
			{
				if (relation[i][mingren] == 0 || relation[mingren][i] == 1)
				{
					mingren = -1;
					break;
				}
			}
		}

		///////////////////////////////////////////////////////////

		if (mingren == -1)
		{
			System.out.print("NOT FOUND\n");
		}
		else
		{
			System.out.printf("%d\n", mingren);
		}

		for (i = 0; i < num; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(relation[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(relation);

	}
}

