package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
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
		if (n < k)
		{
			System.out.print("n>k not match!\n");
			return 1;
		}
		int m = n + k;
		int flag = 1;
		int i;
		int x;
		while (true)
		{
			 x = m;
			 for (i = 0;i < n - 1;i++) //??n-1?
			 {
				if (x % n != k)
				{
					flag = 0;
					break;
				} //???????????k
				x = x - x / n - k;
			 }
			 if (x % n == k && flag == 1 && x > n)
			 {
				 break; //?????????K????????????
			 }
			 flag = 1; // ?????
			 m++; //m??1
		}
		System.out.printf("%d\n",m);
		return 0;
	}

}

