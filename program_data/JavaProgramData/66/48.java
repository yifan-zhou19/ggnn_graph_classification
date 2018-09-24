package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int y,m,d,r,f,h;
		int y;
		int m;
		int d;
		int r;
		int f;
		int h;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int b=0,i;
		int b = 0;
		int i;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		h = (y - 1) % 2800;
		for (i = 1;i <= h;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				b += 1;
			}
		}
		r = (h + b) % 7;
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
			a[1] = 29;
		}
		for (i = 1;i < m;i++)
		{
			r += a[i - 1];
		}
		r += d;
		f = r % 7;
		switch (f)
		{
		case 0:
			System.out.print("Sun.");
			break;
		case 1:
			System.out.print("Mon.");
			break;
		case 2:
			System.out.print("Tue.");
			break;
		case 3:
			System.out.print("Wed.");
			break;
		case 4:
			System.out.print("Thu.");
			break;
		case 5:
			System.out.print("Fri.");
			break;
		case 6:
			System.out.print("Sat.");
			break;
		}
		return 0;
	}
}

