package <missing>;

public class GlobalMembers
{
	public static void print(int a)
	{
		System.out.printf("%d %d\n",a,a + 2);
	}

	public static int search(int b)
	{
		int i = 2;
		int j = 1;
	for (i = 2;i <= Math.sqrt(b);i++)
	{
		if (b % i == 0)
		{
		j = 0;
		break;
		}
	}
	return (j);
	}

	public static void Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int i = 2;
	int sum = 0;
	for (i = 2;i <= n - 2;i++)
	{
		if (search(i) == 1 && search(i + 2) == 1)
		{
		print(i);
		sum++;
		}
	}
	if (sum == 0)
	{
		System.out.print("empty");
	}
	}

}

