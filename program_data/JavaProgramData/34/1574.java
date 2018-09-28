package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num; //????num,????,?????????
		int i;
		int odd;
		int even;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;;i++)
		{
			if (num % 2 == 0) //?????????2
			{
				even = num;
				num = num / 2;
				System.out.print(even);
				System.out.print("/2=");
				System.out.print(num);
				System.out.print("\n");
			}
			if (num % 2 == 1 && num != 1) //????????1???3+1
			{
				odd = num;
				num = num * 3 + 1;
				System.out.print(odd);
				System.out.print("*3+1=");
				System.out.print(num);
				System.out.print("\n");
			}
			if (num == 1) //???1  ??
			{
				System.out.print("End");
				break;
			}
		}
		return 0;
	}


}

