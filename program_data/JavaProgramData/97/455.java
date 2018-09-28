package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int bai;
		bai = n / 100;
		if (bai > 0)
		{
			System.out.printf("%d\n",bai);
			n = n - bai * 100;
		}
		else
		{
			System.out.print("0\n");
		}

		int wushi;
		wushi = n / 50;
		if (wushi > 0)
		{
			System.out.printf("%d\n",wushi);
			n = n - wushi * 50;
		}
		else
		{
			System.out.print("0\n");
		}

		int ershi;
		ershi = n / 20;
		if (ershi > 0)
		{
			System.out.printf("%d\n",ershi);
			n = n - ershi * 20;
		}
		else
		{
			System.out.print("0\n");
		}

		int shi;
		shi = n / 10;
		if (shi > 0)
		{
			System.out.printf("%d\n",shi);
			n = n - shi * 10;
		}
		else
		{
			System.out.print("0\n");
		}

		int wu;
		wu = n / 5;
		if (wu > 0)
		{
			System.out.printf("%d\n",wu);
			n = n - wu * 5;
		}
		else
		{
			System.out.print("0\n");
		}

		int yi;
		yi = n;
		if (yi > 0)
		{
			System.out.printf("%d\n",yi);
		}
		else
		{
			System.out.print("0\n");
		}


		return 0;
	}

}

