package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[101];
		int num;
		int i;
		int temp = 0;
		char c;
		for (i = 0;i <= 100;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				c = tempVar.charAt(0);
			}
			if (c == '\n')
			{
				num = i;
				break;
			}
			a[i] = c - '0';
		}
		if (num > 2)
		{
			for (i = 0;i < num - 2;i++)
			{
				temp = a[i] * 100 + a[i + 1] * 10 + a[i + 2];
				System.out.printf("%d",temp / 13);
				temp = temp % 13;
				a[i + 1] = (temp - temp % 10) / 10;
				a[i + 2] = temp % 10;
			}
			System.out.printf("\n%d\n",temp);
		}
		if (num == 2)
		{
			temp = 10 * a[0] + a[1];
			System.out.printf("%d\n%d\n",temp / 13,temp % 13);
		}
		if (num == 1)
		{
			System.out.printf("0\n%d\n",a[0]);
		}
		return 0;
	}


}

