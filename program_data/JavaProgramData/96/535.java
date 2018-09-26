package <missing>;

public class GlobalMembers
{
	/*??(12-11) ??13
	??
	??????0????N??????100?????????13?????????????
	????
	????0??????????100?
	????
	??????????????????*/
	public static int Main()
	{
			int l;
			int i;
			int t = 0;
			int p = 0;
			int j;
			int temp;
			int k;
			short[] a = new short[100];
			short[] b = new short[100];
			short r;
			String ip = new String(new char[100]);
			ip = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l = ip.length();
			for (i = 0;i < l;i++)
			{
				a[i] = ip.charAt(i) - '0';
			}
			if (l == 1)
			{
					System.out.print(0);
					System.out.print("\n");
					System.out.print(a[0]);
					System.out.print("\n");
					return 0;
			}
			a[1] = a[0] * 10 + a[1];
			if (l == 2)
			{
					System.out.print(a[1] / 13);
					System.out.print("\n");
					System.out.print(a[1] % 13);
					System.out.print("\n");
					return 0;
			}
			for (i = 1;i < l - 1;i++)
			{
					temp = a[i] * 10 + a[i + 1];
					a[i + 1] = temp % 13;
					System.out.print(temp / 13);
			}
			System.out.print("\n");
			System.out.print(a[l - 1]);
	}

}

