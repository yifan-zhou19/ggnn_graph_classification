package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] d = new int[1000];
		int[] b = new int[1000];
		int[] q = new int[1000];
		int a1;
		int c1;
		int num;
		String c = new String(new char[1000]);
		String a = new String(new char[1000]);
		c = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		a1 = a.length();
		c1 = c.length();
		int i = 0;
		do
		{
			b[i] = c.charAt(c1 - 1 - i) - 48;
		i++;
		}while (i < c1);
		i = 0;
		do
		{
			d[i] = a.charAt(a1 - 1 - i) - 48;
		i++;
		}while (i < a1);
		i = 0;
		num = 0;
		do
		{
			q[i] = (d[i] + b[i] + num) % 10;
			if (q[i] == b[i] + d[i] + num)
			{
				num = 0;
			}
			else
			{
				num = 1;
			}
			i++;
		}while (i <= 999);
		i = 999;
		do
		{
			if (q[i] != 0)
			{
				break;
			}
			i--;
		}while (i >= 1);
		i = i;
		do
		{
			System.out.printf("%d",q[i]);
			i--;
		}while (i >= 0);
		return 0;
	}

}
