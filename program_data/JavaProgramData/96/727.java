package <missing>;

public class GlobalMembers
{
	//*******************************
	//?????13 
	//??????1200012798
	//??? 2012.11.15
	//******************************* 


	public static int Main()
	{
		int[] a = new int[101];
		int[] b = new int[101];
		int count = 0;
		int p;
		int deta;
		int i;
		int j;
		int k;
		char t;

		t = System.in.read();
		for (k = 0;t != '\n';k++)
		{
			a[k] = (int)t - 48;
			count++;
			t = System.in.read();
		}



		p = a[0];
		for (i = 0;i <= count - 1;i++)
		{
			if (p < 13)
			{
				p = 10 * p + a[i + 1];
				b[i] = 0;
			}
			else
			{
				b[i] = p / 13;
				p = (p % 13) * 10 + a[i + 1];
			}

		}

		if (a[0] * 10 + a[1] < 13)
		{
			deta = 2;
		}
		else
		{
			deta = 1;
		}

		if (count == 1 || (count == 2 && deta == 2))
		{
			System.out.print(0);
		}
		else
		{
			for (j = deta;j <= count - 1;j++)
			{
				System.out.print(b[j]);
			}
		}
		System.out.print("\n");
		System.out.print(p / 10);
		System.out.print("\n");


		return 0;
	}
}
