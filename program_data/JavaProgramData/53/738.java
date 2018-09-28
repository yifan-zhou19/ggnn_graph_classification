package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[301];
		int[] input = a;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int temp;
			int isinsert = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				temp = Integer.parseInt(tempVar2);
			}
			int[] find = a;
			while (find != input)
			{
				if (temp == find[0])
				{
					isinsert = 0;
					break;
				}
				find++;
			}
			if (isinsert == 0)
			{
				continue;
			}
			input[0] = temp;
			input++;
		}
		int[] begin = a;
		System.out.printf("%d",begin[0]);
		begin++;
		while (begin != input)
		{
			System.out.printf(",%d",begin[0]);
			begin++;
		}
	}

}

