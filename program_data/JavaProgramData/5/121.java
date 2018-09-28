package <missing>;

public class GlobalMembers
{
	public static char[][] sen = new char[100][500];
	public static char ori;
	public static char final;
	public static char temp;
	public static int Main()
	{
		int n;
		int m;
		int temp1;
		int temp2;
		int i;
		int j;
		int a;
		int b;
		int k;
		int c;
		int d;
		int e;
		int[] sz = new int[100];
		double f;
		double g;
		a = 0;
		d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			f = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sen[0] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sen[1] = tempVar3.charAt(0);
		}
		for (i = 0; i < 2 && d == 0; i++)
		{
			for (j = 0; j < String.valueOf(sen[i]).length() && d == 0; j++)
			{

				if (sen[i][j] != 'A' && sen[i][j] != 'T' && sen[i][j] != 'C' && sen[i][j] != 'G')
				{
					d = 1;
				}
			}
		}
		if (d == 0)
		{
		if (String.valueOf(sen[0]).length() == String.valueOf(sen[1]).length())
		{
			for (i = 0; i < String.valueOf(sen[0]).length(); i++)
			{
					if (sen[0][i] == sen[1][i])
					{
						a++;
					}
			}
				g = 1.0 * a / String.valueOf(sen[0]).length();
				if (g >= f)
				{
					System.out.print("yes");
				}
				else
				{
					System.out.print("no");
				}
		}
		else
		{
			System.out.print("error");
		}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}



}

