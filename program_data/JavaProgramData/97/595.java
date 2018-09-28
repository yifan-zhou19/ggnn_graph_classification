package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int[] s = {0, 0, 0, 0, 0, 0};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		s[0] = a / 100;
		s[1] = (a % 100) / 50;
		s[2] = ((a % 100) % 50) / 20;
		s[3] = (((a % 100) % 50) % 20) / 10;
		s[4] = ((((a % 100) % 50) % 20) % 10) / 5;
		s[5] = (((((a % 100) % 50) % 20) % 10) % 5) / 1;
		System.out.printf("%d\n",s[0]);
		System.out.printf("%d\n",s[1]);
		System.out.printf("%d\n",s[2]);
		System.out.printf("%d\n",s[3]);
		System.out.printf("%d\n",s[4]);
		System.out.printf("%d",s[5]);


		return 0;
	}
}

