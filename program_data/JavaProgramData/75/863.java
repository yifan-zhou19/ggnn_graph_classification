package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] intime = new int[9999];
		int[] outtime = new int[9999];
		int count = 0;
		int[] sum = new int[1000];
		//intime???????outtime???????count?????sum?????????
		char temp;
		int i = 0; //????i,j?max?????
		int j = 0;
		int max = 0;

		while (true) //?????
		{
			intime[count] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
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
		while (true) //?????
		{
			outtime[count] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
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

		for (i = 0;i < count;i++)
		{
			for (j = intime[i];j < outtime[i];j++)
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

