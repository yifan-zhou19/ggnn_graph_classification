package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i;
		int s;
		s = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		if (n == 2)
		{
			System.out.print("7");
		}
		else
		{
			for (i = 1;i <= n;i++)
			{
				s = s * n;
			}
			s = s - n * k + k;
			System.out.printf("%d",s);
		}
	}

}

