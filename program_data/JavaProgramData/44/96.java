package <missing>;

public class GlobalMembers
{
	//?????????????????????
	//20101126 liuyi
	public static int Main()
	{
		int reverse = int num; //?????????
		int i;
		int[] a = new int[7];
		for (i = 1;i < 7;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i < 7;i++)
		{
		reverse(a[i]);
		}
		return 0;
	}
	public static int reverse(int num)
	{
		int[] b = new int[20];
		int j = 0;
		if (num == 0)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else if (num > 0)
		{
			for (j = 1;j < 20;j++)
			{
				   b[j] = num % 10; //???????????????????
				   num = num / 10;
				   if (num == 0)
				   {
					   break;
				   }
			}
			int i = 1;
			while (b[i] == 0)
			{
				i++; //???????0 ????
			}
			for (int k = i;k <= j;k++)
			{
				System.out.print(b[k]);
			}
			System.out.print("\n");
		}
		else //?????
		{
			System.out.print("-");
			reverse(-num); //??????????????
		}
		return 0;
	}





}

