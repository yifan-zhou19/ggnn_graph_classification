package <missing>;

public class GlobalMembers
{
	//**************************
	//*   ?????????   *
	//*   ?  ?????       *
	//*   ?  ??1000012738   *
	//*   ?  ??2010.11.20   *
	//**************************

	public static int Main()
	{
		String a = new String(new char[101]); //?????????????
		String b = new String(new char[101]);
		int c; //??????
		int d;
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			c = a.length(); //????
			d = b.length();
			int[] numa = new int[100]; //????????????
			int[] numb = new int[100];
			k = 0; //?????
			for (j = c - 1; j >= 0; j--) //??????
			{
				numa[k++] = a.charAt(j) - '0';
			}
			k = 0;
			for (j = d - 1; j >= 0; j--)
			{
				numb[k++] = b.charAt(j) - '0';
			}
			for (j = 0; j <= d; j++) //???????
			{
				numa[j] -= numb[j];
				if (numa[j] < 0) //????????
				{
					numa[j] += 10; //????
					numa[j + 1]--;
				}
			}
			j = c;
			while (numa[j] == 0) //?????????0??
			{
				j--;
			}
			for (; j >= 0; j--) //??
			{
				System.out.print(numa[j]);
			}
			System.out.print("\n");
		}
		return 0;
	}


}

