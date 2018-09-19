package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		int[] one = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] another = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int m = 0;
		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
		{
			  for (i = 0;i < (b - 1);i++)
			  {
				  m = m + one[i];
			  }
			  n = m + c;
		}
		else
		{
			for (i = 0;i < (b - 1);i++)
			{
				m = m + another[i];
			}
			n = m + c;
		}
		System.out.printf("%d\n",n);
	return 0;
	}


}

