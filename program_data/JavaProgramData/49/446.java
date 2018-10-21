import java.util.*;

//******************************************
//*???????                              **
//*??????    1100062706            **
//*???2011.11.14                         **
//******************************************
void panDuan(int);
int main()
{
	int w = 1;
	panDuan(w);
	String a = new String(new char[500]);
	char[][] e = new char[500][500];
	a = new Scanner(System.in).nextLine();
	int i = 0;
	int k;
	int j;
	int n;
	int m;
	int g = 0;
	int l;
	int t;
	int h = 0;
	int y = 0;
	int b = 0;
	int q = 0;
	int r = 0;
	int x;
	int z;
	int[] p = new int[500];
	do
	{
		if (a.charAt(i) != '\0')
		{
			i++;
		}
		else
		{
			break;
		}
	}while (1 != 0);
	for (k = 2;k < i + 1;k++)
	{
		for (j = 0;j < i - k + 1;j++)
		{
			g = 0;
			for (m = j, n = j + k - 1; ;m++, n--)
			{
				if (m >= n != 0 || n >= i)
				{
					break;
				}
				if (a.charAt(m) == a.charAt(n))
				{
					g++;
				}
			}
			t = j, x = t;
			if (g == k / 2)
			{
				for (l = 0;l < k;l++)
				{
					System.out.print(a.charAt(t++));
				}
				System.out.print('\n');



			}
		}
	h = 0;
	}
	return 0;
}
void panDuan(int a)
{
	if (a != 1)
	{
		System.out.print("false");
		System.out.print("\n");
	}
}
