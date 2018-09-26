package <missing>;

public class GlobalMembers
{
	public static int key(int rest,int monkey,int count,int k)
	{
		if (count == 1)
		{
			return (rest > k && (rest - k) % monkey == 0)?1:0;
		}
		else
		{
			return (rest > k && (rest - k) % monkey == 0)?key((rest - k) * (monkey - 1) / monkey, monkey, count - 1, k):0;
		}
	}
	public static void Main()
	{
		int i;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 1;;i++)
		{
			if (key(i, n, n, k) == 1)
			{
				System.out.printf("%d\n",i);
				break;
			}
		}
	}


}

