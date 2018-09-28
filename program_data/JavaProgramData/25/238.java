package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int p;
		int[] an1 = new int[500];
		int[] an2 = new int[500];
		int[] sum = new int[500];
		 an1[0] = 1;
		 an2[0] = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			System.out.print("1");
		}
		else
		{
		for (p = 0;p < n;p++)
		{
			int carry = 0; //???
			for (i = 0; i < 500; i++)
			{
				sum[i] = an1[i] + an2[i] + carry;
			  if (sum[i] >= 10)
			  {
				sum[i] -= 10;
				carry = 1;
			  }
			  else
			  {
				carry = 0;
			  }
			}
			for (i = 0;i < 500;i++)
			{
				an1[i] = an2[i] = sum[i];
			}
		}
		  i = 500 - 1;
		while (sum[i] == 0)
		{ //???????0??
			 i--;
		}
		for (;i >= 0;i--)
		{ //??????0?
			System.out.printf("%d", sum[i]); //??????
		}
		System.out.print("\n");
		}
		return 0;
	}

}

