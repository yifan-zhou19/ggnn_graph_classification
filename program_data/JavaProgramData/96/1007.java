package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int l;
			int i;
			int j;
			int tem;
			int carry;
			String input = new String(new char[110]);
			int[] in = new int[110];
			int[] out = new int[110];
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				input = tempVar.charAt(0);
			}
			l = input.length();
			for (i = 0;i < l;i++)
			{
					in[i] = input.charAt(i) - '0';
			}
			carry = in[0];
	if (l == 1)
	{
		System.out.printf("0\n%d",in[0]);
		return 0;
	}
			for (i = 1;i < l;i++)
			{
					tem = 10 * carry + in[i];
					out[i - 1] = tem / 13;
					carry = tem % 13;
			}
			if (out[0] != 0)
			{
					System.out.printf("%d",out[0]);
					for (i = 1;i < l - 1;i++)
					{
					  System.out.printf("%d",out[i]);
					}
					System.out.print("\n");
			}
			else if ((out[0] == 1 || out[0] == 0) && l - 1 < 2)
			{
				System.out.printf("%d\n",out[0]);
			}
			else if (out[0] == 0 && l - 1 > 1)
			{
					for (i = 1;i < l - 1;i++)
					{
							System.out.printf("%d",out[i]);
					}
					System.out.print("\n");
			}

			System.out.printf("%d",carry);
			return 0;
	}
}

