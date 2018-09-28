package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int n;
		int front = 0;
		int back = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 3 || n>50000)
		{
			System.out.print("no");
			return 0;
		}
		int[] a = new int[n];
		int[] b = new int[n];
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a + i = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b + i = tempVar3;
			}
			if (a[i] > b[i])
			{
				System.out.print("input error");
				return 0;
			}
			if ((front != back && a[i] < front) || front == back)
			{
				front = a[i];
				back = b[i];
			}
			i++;
		}
		for (i = 0;i < n;i++)
		{
			if (front <= a[i] != 0 && a[i] <= back != 0 && back < b[i])
			{
				back = b[i];
				i = -1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] < front || b[i]> back)
			{
				System.out.print("no");
				return 0;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(b);
		System.out.printf("%d %d\n",front,back);
	}

}

