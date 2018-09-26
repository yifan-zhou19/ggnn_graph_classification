package <missing>;

public class GlobalMembers
{
	//**********************************************
	//**????????****************************
	//**?????? 1000012741*********************
	//**???2010?11?26?************************
	//**********************************************
	public static int Main()
	{
		//n?????p?????????a?b???????????????
		int n;
		int p;
		int i = 1;
		int j;
		int[] a = new int[1002];
		int[] b = new int[1002];
		int count;
		int max1 = 0;
		char c; //c??????
		do
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read();
			i++;
		} while (c == ',');
		p = i - 1; //??????
		i = 1;
		do
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read();
			i++;
		} while (c == ',');
		int max = 0; //max?????????min????????
		int min = 1004;
		for (i = 1; i <= p; i++) //?????????
		{
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		for (i = 1; i <= p; i++) //?????????
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = min; i <= max; i++) //???????????
		{
			count = 0; //count?????????????
			for (j = 1; j <= p; j++)
			{
				if (a[j] <= i != 0 && b[j] >= (i + 1))
				{
					count++;
				}
			}
			if (count > max1) //?????????
			{
				max1 = count;
			}
		}
		System.out.print(p);
		System.out.print(" ");
		System.out.print(max1);
		System.out.print("\n");
		return 0;
	}
	//**********************************************
}

