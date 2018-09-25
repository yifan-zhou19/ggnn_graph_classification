package <missing>;

public class GlobalMembers
{
	public static int fenjie(int[] out, int a, int n, int m, int sheng, int[] b)
	{
	//n??out?????????m?????????????2?????????,sheng???????
		int i;
		for (i = m;i <= a / 2;i++)
		{
			if (sheng % i == 0)
			{
				out[n] = i;
				int qiu = 1;
				int k;
				for (k = 0;k <= n;k++)
				{
					qiu = out[k] * qiu;
				}
				//cout<<i<<" "<<qiu<<" "<<n<<endl;
				if (qiu == a)
				{
					b[0]++;
					break;
				}
				if (qiu > a)
				{
					break;
				}
				else
				{
					fenjie(out, a, n + 1, i, sheng / i, b);
				}


			}


		}
		return 0;
	}
	public static int Main()
	{
		int hang = 0;
		hang = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (hang > 0)
		{
			int a;
			int[] b = new int[2];
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[] out = new int[16];
			fenjie(out, a, 0, 2, a, b);
			System.out.print(b[0] + 1);
			System.out.print("\n");
			hang--;
		}
		return 0;
	}

}

