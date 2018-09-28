package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int k;
		int s;
		a = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
	  for (b = 1;;b++)
	  {
		  s = b * (n - 1);
		while (a <= n)
		{
			if (s % (n - 1) == 0)
			{
			s = n * s / (n - 1) + k;
		a++;
			}
		else
		{
			a = 1;
		break;
		}
		}
		if (a - 1 == n)
		{
			System.out.printf("%d",s);
		break;
		}
		else
		{
			continue;
		}
	  }
		return 0;
	}
}

