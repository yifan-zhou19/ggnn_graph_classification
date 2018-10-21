package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int num;
	int i;
	int j;
	int sum = 0;
	int mark;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		num = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= num;i++)
	{
	mark = 1;
	j = i;
	if ((j % 7) == 0)
	{
		mark = 0;
	}
	while (j != 0)
	{
	if (j % 10 == 7)
	{
		mark = 0;
		break;
	}
	else
	{
		j /= 10;
	}
	}
	if (mark != 0)
	{
		sum += i * i;
	}
	}
	System.out.printf("%d",sum);
	}
}

