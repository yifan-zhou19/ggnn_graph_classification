package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

	int a;
	int b;
	int c;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}


	for (i = 1;i <= 50;i++)
	{
		if (a > b)
		{
			c = a;
		  a = b;
		  b = c;
		}
		else if (b > a)
		{
		 b = b / 2;
		}
		else
		{
			System.out.printf("%d",a);
		break;
		}
	}
	}
}

