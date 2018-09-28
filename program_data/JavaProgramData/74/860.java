package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int hw = (int)c;
		int m;
		int n;
		int i;
		int j;
		int t;
		t = 0;

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
		for (i = m;i <= n;i++)
		{
		for (j = 2;j < i;j++)
		{
		if (i % j == 0)
		{
		break;
		}
		if (j >= i - 1)
		{
		if (hw(i) != 0)
		{

		  t = t + 1;
		  if (t == 1)
		  {
			  System.out.printf("%d",i);
		  }
		  else
		  {
			  System.out.printf(",%d",i);
		  }
		}
		}

		}


		}




		if (t == 0)
		{
			System.out.print("no");
		}
	}


	public static int hw(int(c))
	{
		int x;
		int y;
		x = 0;
		y = c;
		do
		{
			x = 10 * x + y % 10;
		y = y / 10;
		} while (y > 0);
		if (x == c)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
}

