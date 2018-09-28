package <missing>;

public class GlobalMembers
{
	public static void reverse(int num) //?????????
	{
		if (num == 0) //?0????
		{
			System.out.print(num);
			System.out.print("\n");
		}
		else if (num > 0)
		{
			int i = 0;
			int n;
			int[] a = new int[20];
			while (num != 0) //??0???????????
			{
				a[i] = num % 10;
				num = num / 10;
				i++;
			}
			n = i; //????
			int count = 0;
			for (i = 0;i < 20;i++) //??????????0?????
			{
				if (a[i] == 0)
				{
					count++;
				}
				else
				{
					break;
				}
			}
			for (i = count;i < n;i++) //?????
			{
				System.out.print(a[i]);
			}
			System.out.print("\n");
		}
	}
	public static int Main() //???
	{
		int num;
		for (int i = 1;i <= 6;i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num < 0) //??0???????????????
			{
				System.out.print("-");
				reverse(-num);
			}
			else
			{
				reverse(num);
			}
		}
		return 0;
	}

}

