package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sn = new String(new char[10]);
		int n;
		sn = new Scanner(System.in).nextLine();
		n = Integer.parseInt(sn);
		int k;
		char[][] a = new char[250][250];
		char[][] b = new char[250][250];
		String cc = new String(new char[10]);

		for (k = 0;k < n;k++)
		{
			if (k == 0)
			{
				a[k] = new Scanner(System.in).nextLine();
				b[k] = new Scanner(System.in).nextLine();
			}
			else
			{
				cc = new Scanner(System.in).nextLine();
				a[k] = new Scanner(System.in).nextLine();
				b[k] = new Scanner(System.in).nextLine();
			}
		}
		int[] lena = new int[250];
		int[] lenb = new int[250];
		int i;
		int j;
		for (k = 0;k < n;k++)
		{

		lena[k] = String.valueOf(a[k]).length();
		lenb[k] = String.valueOf(b[k]).length();


		int[][] shua = new int[251][250];
		int[][] shub = new int[251][250];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(shua[k],0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(shub[k],0,(Integer.SIZE / Byte.SIZE));

		j = 0;
		for (i = lena[k] - 1;i >= 0;i--)
		{
			 shua[k][j++] = a[k][i] - '0';
		}
		j = 0;
		for (i = lenb[k] - 1;i >= 0;i--)
		{
			 shub[k][j++] = b[k][i] - '0';
		}


		for (i = 0;i < 250;i++)
		{
			shua[k][i] -= shub[k][i];
			if (shua[k][i] < 0)
			{
				shua[k][i] += 10;
				shua[k][i + 1]--;
			}
		}
		int bStartOutput = 0;
		for (i = 249;i >= 0;i--)
		{
			if (bStartOutput != 0)
			{
				System.out.printf("%d",shua[k][i]);
			}
			else if (shua[k][i] > 0)
			{
				System.out.printf("%d",shua[k][i]);
				bStartOutput = 1;
			}
		}
		System.out.print("\n");
		if (bStartOutput == 0)
		{
			System.out.print("0\n");
		}

		}

		return 0;
	}
}
