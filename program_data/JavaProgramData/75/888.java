package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] itime = new int[10000]; //itime???????otime???????sum???????????
		int[] otime = new int[10000];
		int[] sum = new int[1000];
		int count = 0; //count??????i,j??????
		int i = 0;
		int j = 0;
		int max = 0;
		char temp;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(sum,0,(Integer.SIZE / Byte.SIZE)); //?????
		while (true) //??????
		{
			itime[count] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(temp);
			if (temp != '\n')
			{
				count++;
			}
			else
			{
				count++;
				break;
			}
		}
		count = 0;
		while (true) //??????
		{
		otime[count] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cin.get(temp);
		if (temp != '\n')
		{
			count++;
		}
		else
		{
			count++;
			break;
		}
		}
		for (i = 0;i < count;i++) //????
		{
			for (j = itime[i];j < otime[i];j++)
			{
				sum[j]++;
			}
		}
		for (i = 0;i < 1000;i++)
		{
			if (sum[i] > max)
			{
				max = sum[i];
			}
		}
		System.out.print(count);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}



}

