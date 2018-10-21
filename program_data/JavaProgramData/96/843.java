package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		int num;
		int[] shang = new int[1000];
		int[] yushu = new int[1000];
		num = a.length();
		int i;
		int j = 1;
		int k = 0;
		int b = 0;
		int c;
		int d;
		if (num == 1)
		{
			for (i = 0;i <= num - 1;i++)
			{
			System.out.print("0\n");
			System.out.printf("%d",a.charAt(i) - '0');
			}
		}
		else
		{
			for (i = 0;i <= num - 2;i++)
			{
			if (i == 0)
			{
				b = (a.charAt(i) - '0') * 10 + (a.charAt(i + 1) - '0') * 1;
				shang[i] = b / 13;
				yushu[i] = b % 13;
			}
			else
			{
				b = yushu[i - 1] * 10 + (a.charAt(i + 1) - '0') * 1;
				shang[i] = b / 13;
				yushu[i] = b % 13;

			}
			}


			for (i = 0;i <= num - 2;i++)
			{
			if (i == 0 && num == 2 && shang[i] == 0)
			{
				System.out.printf("%d\n",shang[i]);
			}
			if (i == 0 && shang[i] != 0 && num != 2)
			{
				System.out.printf("%d",shang[i]);
			}
			if (i == 0 && shang[i] != 0 && num == 2)
			{
				System.out.printf("%d\n",shang[i]);
			}
			if (i != 0)
			{
				if (i == num - 2)
				{
					System.out.printf("%d\n",shang[i]);
				}
				else
				{
					System.out.printf("%d",shang[i]);
				}
			}

			}
	 System.out.printf("%d",yushu[num - 2]);
		}

		return 0;
	}

}
