package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i1;
		int i2 = 0;
		int i3 = 0;
		int mark1;
		int mark2;
		int len;
		int mark3 = 0;
		int[] a = new int[10];
		int k;
		int x;
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
		for (k = m;k <= n;k++) //??k?????????
		{

			mark1 = 1;
			mark2 = 1;
			for (i1 = 2;i1 < k;i1++)
			{
				if (k % i1 == 0)
				{
				mark1 = 0;
				break;
				}
			}
			if (mark1 != 0) //?k???????k??????
			{
				x = k;
				i2 = 0;
				i3 = 0;
				while (x != 0) //?k???a[]???len?x=k,??while????k?????????k???????
				{
					a[i2] = x % 10;
					x = x / 10;
					i2++;
				}
				len = i2;
				for (;i3 < i2;i3++,i2--) //?a[]????????????????????a??k?????
				{
					if (a[i2 - 1] != a[i3]) //??????mark2=0??
					{
						mark2 = 0;
						break;
					}
				}
				if (mark2 == 1)
				{
					if (mark3 == 0) //mark3=0:??????????????????
					{
						for (i3 = 0;i3 < len;i3++)
						{
						System.out.printf("%d",a[i3]);
						}
						mark3 = 1; //mark3=1:????????
					}
					else
					{
						System.out.print(",");
						for (i3 = 0;i3 < len;i3++)
						{
						System.out.printf("%d",a[i3]);
						}
					}
				}
			}
		}

		if (mark3 == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			System.out.print("\n");
		}
	}

}

