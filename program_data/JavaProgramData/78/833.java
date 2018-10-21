package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z; //?????
		int q;
		int s;
		int l;
		int a; //????
		int b;
		int c;
		int[] w = new int[6]; //????????
		char[] r = {0, '\0', '\0', '\0', '\0', '\0'}; //????
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++) //??
					{
						a = (z + q == s + l);
						b = (z + q > q + s);
						c = (z + s < q);
						if ((a + b + c) == 3) //????
						{
							w[z] = z * 10;
							r[z] = 'z';
							w[q] = q * 10;
							r[q] = 'q';
							w[s] = s * 10;
							r[s] = 's';
							w[l] = l * 10;
							r[l] = 'l';
						} //??

					}
				}
			}
		}
		{
			for (int i = 5;i >= 1;i--)
			{
				if (w[i] != 0)
				{
					System.out.print(r[i]);
					System.out.print(" ");
					System.out.print(w[i]);
					System.out.print("\n");
				}
			}
	}
		return 0;
	}
}
