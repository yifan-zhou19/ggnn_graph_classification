package <missing>;

public class GlobalMembers
{
	//**********************************
	//****       ??????     *****
	//****        1200016612       *****
	//**      ?????????      **
	//**********************************
	public static int Main() //?????
	{
		int N = 0; //a[500]???????b[500]????
		int[] a = new int[500];
		int[] b = new int[500];
		int i = 0;
		int j = 0;
		int k = 0;
		int t = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < N;i++) //??????????????b[500]????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] % 2 != 0)
			{
			b[j++] = a[i];
			}
		}
		for (i = 1;i <= j - 1;i++)
		{ //????????
			for (k = 0;k < j - i;k++)
			{ //????????
				if (b[k] > b[k + 1])
				{
					t = b[k];
					b[k] = b[k + 1];
					b[k + 1] = t;
				}
			}
		}
		System.out.print(b[0]);
		for (k = 1;k < j;k++)
		{
			System.out.print(",");
			System.out.print(b[k]);
		}
		return 0;
	}
}

