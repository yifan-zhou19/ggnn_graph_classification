package <missing>;

public class GlobalMembers
{
	public static int max(tangible.RefObject<Integer> data, int lens)
	{
		int r = data.argValue;
		for (int j = 0;j < lens;j++)
		{
			if (*(data.argValue + j) > r)
			{
				r = (data.argValue + j);
			}
		}
		return r;
	}
	public static int f(int[] data, int lens, int height)
	{
		int[] tempResult = new int[25];
		if (lens == 0)
		{
			return 0;
		}
		int count = 0;
		int tempHeight = 0;
		for (int i = 0;i < lens;i++)
		{
						   if (data[i] <= height != 0 && data[i] >= tempHeight)
						   {
							   tempHeight = data[i];
							   tempResult[count] = f(data + i + 1, lens - i - 1, data[i]);
							   count++;
						   }

		}
		if (count == 0)
		{
			return 0;
		}
	tangible.RefObject<Integer> tempRef_tempResult = new tangible.RefObject<Integer>(tempResult);
		Object tempVar = max(tempRef_tempResult, count) + 1;
		tempResult = tempRef_tempResult.argValue;
		return tempVar;
	}


	public static int Main()
	{
		int[] data = new int[25];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			data[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	tangible.RefObject<Integer> tempRef_data = new tangible.RefObject<Integer>(data);
		System.out.print(f(data, n, max(tempRef_data, n)));
		data = tempRef_data.argValue;

					 return 0;
	}

}

