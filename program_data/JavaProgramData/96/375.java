package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[100]);
		int[] a = new int[99];
		int d;
		int i;
		int j;
		int k;
		int flag = 0;
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		d = num.charAt(0) - '0';
		a[0] = 0;
		for (i = 1; num.charAt(i) != '\0'; i++)
		{
			a[i - 1] = (d * 10 + (num.charAt (i) - '0')) / 13;
			d = (d * 10 + (num.charAt (i) - '0')) % 13;
		}
		for (j = 1; num.charAt(j) != '\0'; j++)
		{
			if (a[j - 1] == 0)
			{
				continue;
			}
			else
			{
				System.out.print(a[j - 1]);
				flag = 1;
				break;
			}
		}
		if (flag == 1)
		{
			for (k = j; k < i - 1; k++)
			{
				System.out.print(a[k]);
			}
			System.out.print("\n");
		}
		else
		{
			System.out.print(a[0]);
			System.out.print("\n");
		}
		System.out.print(d);
		return 0;
	}
}

