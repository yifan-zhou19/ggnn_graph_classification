package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] cha = new char[200][50];
		char[][] te = new char[200][50];
		int e;
		int[] num = new int[200];
		int a = 0;
		int b;
		int c;
		int d;
		int temp;
		while (~scanf("%s",cha[a]) != 0)
		{
			a++;
		}
		for (b = 0;b < a;b++)
		{
			num[b] = String.valueOf(cha[b]).length();
		}
		for (c = 0;c < a;c++)
		{
			for (d = 0;d < a - c - 1;d++)
			{
				  if (num[d] > num[d + 1])
				  {
					temp = num[d + 1];
				num[d + 1] = num[d];
				num[d] = temp;
				te[d] = cha[d];
				cha[d] = cha[d + 1];
				cha[d + 1] = te[d];
				  }
			}
		}
		for (e = a - 1;e >= 0;e--)
		{
		if (num[e] != num[e-1])
		{
			System.out.printf("%s\n%s",cha[e],cha[0]);
		break;
		}
		}
		return 0;
	}
}
