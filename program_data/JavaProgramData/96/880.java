package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int d;
		int[] c = new int[100];
		int[] b = new int[100];
		int p = 0;
		int temp;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = 0; i < a.length(); i++) //??????????????
		{
			c[i] = a.charAt(i) - '0';
		}
		if (a.length() == 1) //????????????0????
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(c[0]);
			System.out.print("\n");
			return 0; //?????
		}
		if (a.length() == 2 && c[0] * 10 + c[1] < 13) //????????????13???
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(c[0] * 10 + c[1]);
			System.out.print("\n");
			return 0; //?????
		}
		d = c[0] * 10 + c[1]; //????????????
		for (int i = 2; i <= a.length(); i++) //?????????????
		{
			b[p] = d / 13;
			p++;
			temp = d % 13;
			d = temp * 10 + c[i];
		}
		if (b[0] == 0) //????0??????
		{
			for (int i = 1; i < p; i++)
			{
				System.out.print(b[i]);
			}
			System.out.print("\n");
		}
		else
		{
			for (int i = 0; i < p; i++)
			{
				System.out.print(b[i]);
			}
			System.out.print("\n");
		}
		System.out.print(temp);
		System.out.print("\n");
		return 0;
	}

}

