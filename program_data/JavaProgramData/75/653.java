package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????   **
	//*?????? 1300012957 **
	//*???2013.11.05  **
	//********************************
	public static int Main()
	{
		int s = 0;
		int i = 0;
		int j;
		int k;
		int n;
		char ch;
		int[] a = new int[1001];
		int[] b = new int[1001];
		do
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
		}while (System.in.read() == ',');

		i = 0;

		do
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			i++;
		}while (System.in.read() == ',');
									   //i??????
		int t = 0;
		for (j = 0;j <= 1000;j++)
		{
			t = Math.max(t,s); //t??????????????
									   //t???????????????????????????????????
			s = 0; //???????s?0????
			for (k = 1;k <= i;k++)
			{
				if ((a[k - 1] <= j) && (j < b[k - 1]))
				{
					s++; //???????????????
				}
			}
		}

		System.out.print(i);
		System.out.print(" ");
		System.out.print(t);
		System.out.print("\n");

		return 0;
	}
}

