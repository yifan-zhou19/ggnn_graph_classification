package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int a;
		int b;
		int max;
		int sub;
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
	max = a;
	sub = a;
	for (i = 1;i <= (n - 1);i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if (max < b)
		{
			temp = max;
			max = b;
			sub = temp;
		}
		if (sub < b && b < max)
		{
			sub = b;
		}
	}
		System.out.printf("%d\n%d",max,sub);
	}

}

