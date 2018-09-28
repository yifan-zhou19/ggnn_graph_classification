package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0 && m == 0)
			{
				break;
			}
			int count = n;
			int currentIndex = 0;
			int[] flags = new int[302];
			for (int i = 0; i < n; i++)
			{
				flags[i] = i + 1;
			}
			while (count != 1)
			{
				int currentNumber = 1;
				while (currentNumber != m)
				{
					currentNumber++;
					currentIndex = (currentIndex + 1) % count;
				}

				// delete the element in currentIndex.
				for (int i = currentIndex + 1; i < count; i++)
				{
					flags[i - 1] = flags[i];
				}
				count--;
			}
			System.out.printf("%d\n", flags[0]);
		}
	}
}

