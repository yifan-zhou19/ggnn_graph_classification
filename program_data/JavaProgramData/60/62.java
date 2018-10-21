package <missing>;

public class GlobalMembers
{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: int prime(unsigned int x)
	public static int prime(int x)
	{
		int y;
	 for (y = 2;y <= Math.sqrt(x);y += 1)
	 {
	if (x % y == 0)
	{
		break;
	}
	 }
	if (y > Math.sqrt(x))
	{
		return 0;
	}
	return 1;
	}

	public static void Main()
	{
		int youmeiyou;
		int i;
		int n;
	youmeiyou = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 5;i <= n;i += 2)
	{
		if (prime(i - 2) == 0 && prime(i) == 0)
		{
			System.out.printf("%d %d\n", i - 2,i);
			youmeiyou = 1;
		}
	}
	if (youmeiyou == 0)
	{
		System.out.print("empty\n");
	}
	}
}

