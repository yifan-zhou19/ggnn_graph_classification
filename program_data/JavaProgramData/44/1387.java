package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[6];
		int i;
		int[] b = new int[6];
		int reverse = int num;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			b[i] = reverse(a[i]); //????a[i],???????b[i]//
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		return 0;
	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static reverse(int num)
	{
		int x = 0;
		int i;
		int weishu;
		int[] a = new int[15];
		if (num >= 0) //?????//
		{
		for (i = 0;;i++)
		{
			if ((num / (Math.pow(10,x))) < 1) //????????????//
			{
				weishu = i - 1;
				break;
			}
			a[i] = ((int)(num / (Math.pow(10,x)))) % 10; //????????//
			x = x + 1;
		}
		x = 0;
		num = 0;
		for (i = weishu;i >= 0;i--) //??//
		{
			num = num + a[i] * (Math.pow(10,x)); //?????//
			x = x + 1;
		}
		}
		if (num < 0) //????//
		{
			num = -num; //????//
			for (i = 0;;i++)
			{
				if ((num / (Math.pow(10,x))) < 1)
				{
					weishu = i - 1;
					break;
				}
				a[i] = ((int)(num / (Math.pow(10,x)))) % 10;
				x = x + 1;
			}
			x = 0;
			num = 0;
			for (i = weishu;i >= 0;i--)
			{
				num = num + a[i] * (Math.pow(10,x));
			 x = x + 1;
			}
			num = -num; //??????????//
		}
		return (num);
	}

}

