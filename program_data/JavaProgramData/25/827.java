package <missing>;

public class GlobalMembers
{
	//?????????100?????


	public static int Main()
	{
		int[] result = new int[80]; //????
		//???????????????????????????OTZ?
		int l = 1; //??
		int c; //????????
		int n; //??
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 30)
		{
			c = (int)Math.pow(2,n);
			System.out.printf("%d",c);
			return 0; //????????????=u=+
		}
	   //if(n==100)
	   //{
	   //     printf("1267650600228229401496703205376");
	   //     return 0;
	   // }
		result[0] = 1; //2?0??
		for (i = 0;i < n;i++) //???2
		{
			c = 0; //??????
			for (j = 0;j < l;j++) //??????
			{
				result[j] = result[j] * 2 + c;
				c = result[j] / 1000; //??
				if (result[j] >= 1000) //????
				{
					result[j] = result[j] % 1000; //??
					if (j == l - 1) //?????
					{
						l++; //�?�+1
					}
				}
			}
		}
		for (i = l - 1;i >= 0;i--) //??
		{
			if (i != l - 1) //??
			{
				System.out.printf("%.3d",result[i]);
				continue;
			}
			System.out.printf("%d",result[i]);
		}
	System.out.print("\n");
		return 0;
	}

}

