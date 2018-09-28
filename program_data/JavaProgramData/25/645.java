package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] array = new int[1000];
		int i;
		int j;
		int add = 0;
		int head;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		array[0] = 1;
		head = 1;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < head;j++)
			{
			array[j] = add + array[j] * 2;
			add = 0;
			if (array[j] >= 10)
			{
			 add = array[j] / 10;
			 array[j] = array[j] % 10;
			 if (j + 1 == head)
			 {
			 array[head] = add;
			 add = 0;
			 head++;
			 break;
			 }
			}
			}
		}
		for (i = head - 1;i >= 0;i--)
		{
			System.out.printf("%d",array[i]);
		}
		return 0;
	}
}

