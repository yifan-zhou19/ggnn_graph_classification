package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int z;
		int a;
		int b;
		int c;
		int result;
		int i;
		while (i = 1)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			z = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			b = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			c = Integer.parseInt(tempVar6);
		}
		if (x == 0 && y == 0 && z == 0 && a == 0 && b == 0 && c == 0)
		{
		break;
		}
		else
		{
		result = 0;
		result = result + ((60 - y - 1) * 60) + 60 - z + (60 * b) + c;
		result = result + (a + 12 - x - 1) * 60 * 60;
		System.out.printf("%d\n",result);
		}
		}
		return 0;
	}


}

