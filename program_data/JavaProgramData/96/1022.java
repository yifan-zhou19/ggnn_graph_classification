package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char t;
		int[] in = new int[100];
		int i = 0;
		int[] an = new int[100];
		t = System.in.read();
		while (t != 10)
		{
			in[i] = t - '0';
			i++;
			t = System.in.read();
		}
		int j = 2;
		int n = 0;
		int temp = in[0];
		if (i != 1)
		{
			temp = 10 * temp + in[1];
			if (temp >= 13)
			{
				an[0] = temp / 13;
				temp = temp % 13;
				n++;
			}
			while (j != i)
			{
				temp = 10 * temp + in[j];
				an[n] = temp / 13;
				temp = temp % 13;
				n++;
				j++;
			}
			if (n == 0)
			{
				System.out.print('0');
			}
			for (int k = 0;k < n;k++)
			{
				System.out.print(an[k]);
			}
			System.out.print("\n");
			System.out.print(temp);
		}
		else
		{
			System.out.print("0\n");
			System.out.print(in[0]);
		}
		return 0;
	}
}
