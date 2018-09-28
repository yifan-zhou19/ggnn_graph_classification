package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int left;
		int monkey;
		int s;
		int n;
		int last;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			monkey = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			left = Integer.parseInt(tempVar2);
		}
		for (last = 1;;last++)
		{
		s = last + left;
		n = monkey;
		while (s % (monkey - 1) == 0)
		{
			s = s * monkey / (monkey - 1);
			n = n - 1;
			if (n == 1)
			{
				System.out.printf("%d\n",(s - left) * monkey + left);
				break;
			}
		}
		if (n != 1)
		{
			continue;
		}
		else
		{
			break;
		}
		}
		return 0;
	}


}

