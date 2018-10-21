package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int z;
	int q;
	int s;
	int l;
	int i;
	int j;
	int k;
	int n;
	int[] a = new int[100];
	String b = new String(new char[100]);
	for (i = 1;i <= 4;i++)
	{
		z = i * 10;
		for (j = 1;j <= 4;j++)
		{
			q = j * 10;
			for (k = 1;k <= 4;k++)
			{
				s = k * 10;
				l = z + q - s;
				if (z + l > s + q && z + s < q)
				{
				  a[1] = z;
				  b = tangible.StringFunctions.changeCharacter(b, a[1], 'z');
				  a[2] = q;
				  b = tangible.StringFunctions.changeCharacter(b, a[2], 'q');
				  a[3] = s;
				  b = tangible.StringFunctions.changeCharacter(b, a[3], 's');
				  a[4] = l;
				  b = tangible.StringFunctions.changeCharacter(b, a[4], 'l');
				}
			}
		}
	}
	for (i = 1;i <= 4;i++)
	{
		for (j = 1;j <= 3;j++)
		{
			if (a[j] < a[j + 1])
			{
				n = a[j];
				a[j] = a[j + 1];
				a[j + 1] = n;
			}
		}
	}
	for (i = 1;i <= 4;i++)
	{
		System.out.print(b.charAt(a[i]));
		System.out.print(" ");
		System.out.print(a[i]);
		System.out.print("\n");
	}
	return 0;
	}

}

