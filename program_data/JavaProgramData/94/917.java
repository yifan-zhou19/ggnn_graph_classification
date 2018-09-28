package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int num = -1;
		int[] a = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = Integer.parseInt(tempVar2);
			}
			if (t % 2 == 1)
			{
				num++;
				a[num] = t;
			} // choose odd number
		}
		sort(a,a + num + 1); //sort the numbers
		System.out.printf("%d",a[0]);
		for (int i = 1;i <= num;i++)
		{
			System.out.printf(",%d",a[i]); // print
		}

		return 0;
	}

}

