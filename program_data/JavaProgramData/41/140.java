package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[5];
		int flag = 0;
		int[] h = new int[5];
		for (i = 0;i < 5 * 5 * 5 * 5 * 5; i++)
		{
			flag = 0;
				a[0] = (i % 5) + 1;
				a[1] = (i / 5) % 5 + 1;
				a[2] = (i / 25) % 5 + 1;
				a[3] = (i / 125) % 5 + 1;
				a[4] = (i / 625) % 5 + 1;
				for (int j = 0;j < 5;j++)
				{
				for (int k = 0;k < j;k++)
				{
				if (a[j] == a[k])
				{
				flag++;
				}
				}
				}
				if (flag == 0 && a[4] != 2 && a[4] != 3)
				{ //cout<<"a"<<i;
						h[0] = (a[0] < 3 && a[4] == 1);
						h[1] = (a[1] < 3 && a[1] == 2);
						h[2] = (a[2] < 3 && a[0] == 5);
						h[3] = (a[3] < 3 && a[2]>1);
						h[4] = (a[4] < 3 && a[3] == 1);
						flag = h[0] + h[1] + h[2] + h[3] + h[4];
						h[0] = (a[0] < 3 || a[4] == 1);
						h[1] = (a[1] < 3 || a[1] == 2);
						h[2] = (a[2] < 3 || a[0] == 5);
						h[3] = (a[3] < 3 || a[2]>1);
						h[4] = (a[4] < 3 || a[3] == 1);
						if (flag == 2 && h[0] + h[1] + h[2] + h[3] + h[4] == 2)
						{
						System.out.print(a[0]);
						System.out.print(' ');
						System.out.print(a[1]);
						System.out.print(' ');
						System.out.print(a[2]);
						System.out.print(' ');
						System.out.print(a[3]);
						System.out.print(' ');
						System.out.print(a[4]);
						}
				}
		}
	}
}
