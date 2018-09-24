package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int k;
		int count = 0;
		int s = 1;
		int sum = 0;
		while (n != 0)
		{
			 k = n % 10;
			 if (k == 0)
			 {
			 count++;
			 }
			 n = n / 10;
			 sum = sum * 10 + k;
		}
		for (i = 1;i <= count;i++)
		{
		System.out.print("0");
		}
		System.out.printf("%d",sum);
		System.in.read();
		System.in.read();
	}

}

