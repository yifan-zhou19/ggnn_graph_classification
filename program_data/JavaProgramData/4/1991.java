package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int zong;
		int x;
		int y;
		int sum;
		int i;
		int zanshi;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * c;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *d;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		zong = m * n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		d = (int)malloc(zong * (Integer.SIZE / Byte.SIZE));
		c = d;
		for (;c < d + zong;c++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c = Integer.parseInt(tempVar3);
			}
		}
		for (sum = 2;sum <= m + n;sum++)
		{
			for (y = 1;y < sum;y++)
			{
				x = sum - y;
				zanshi = n * (y - 1) + x;
				if (x <= n != 0 && y <= m != 0 && zanshi >= 1 && zanshi <= zong)
				{
					System.out.printf("%d\n",*(d + zanshi - 1));
				}
			}

		}

	}
}

