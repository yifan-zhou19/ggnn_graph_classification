package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int bai;
		int wushi;
		int ershi;
		int shi;
		int wu;
		int yuan;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		bai = (n - n % 100) / 100;
		System.out.printf("%d\n",bai);
		wushi = ((n - 100 * bai) - (n - 100 * bai) % 50) / 50;
		System.out.printf("%d\n",wushi);
		ershi = ((n - 100 * bai - 50 * wushi) - (n - 100 * bai - 50 * wushi) % 20) / 20;
		System.out.printf("%d\n",ershi);
		shi = ((n - 100 * bai - 50 * wushi - 20 * ershi) - (n - 100 * bai - 50 * wushi - 20 * ershi) % 10) / 10;
		System.out.printf("%d\n",shi);
		wu = ((n - 100 * bai - 50 * wushi - 20 * ershi - 10 * shi) - (n - 100 * bai - 50 * wushi - 20 * ershi - 10 * shi) % 5) / 5;
		System.out.printf("%d\n",wu);
		yuan = n - 100 * bai - 50 * wushi - 20 * ershi - 10 * shi - 5 * wu;
		System.out.printf("%d\n",yuan);
		return 0;
	}

}

