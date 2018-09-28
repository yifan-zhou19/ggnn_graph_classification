package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int n;
	int j;
	int l;
	int a;
	int flag = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 3;i <= n;i = i + 2)

	{
		for (j = 2;j <= Math.sqrt(i);j++)
		{
	if (i % j == 0)
	{
		break;
	}
		}
	if (j > Math.sqrt(i))
	{
		a = i;
	}

	for (l = 2;l <= Math.sqrt(a + 2);l++)
	{
	if ((a + 2) % l == 0)
	{
		break;
	}
	}
	if (l > Math.sqrt(a + 2) && (a + 2 <= n))
	{
		flag = 1;
		System.out.printf("%d %d\n",a,a + 2);
	}
	}
	if (flag == 0)
	{
		System.out.print("empty");
	}


	}
}

