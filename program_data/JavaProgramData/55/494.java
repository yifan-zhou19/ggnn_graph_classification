package <missing>;

public class GlobalMembers
{
	public static int cifang(int x, int y)
	{
		int z;
		int i;
		z = 1;
		for (i = 0; i < y; i++)
		{
			z = z * x;
		}
		return (z);
	}

	public static void Main()
	{
		int a;
		int b;
		int t;
		int i;
		int[] mod = new int[50];
		String n = new String(new char[10]);
		int ten;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}

		//?a????????
		t = 0;
		ten = 0;
		for (i = 0; n.charAt(i) != '\0'; i++)
		{
			t++;
		}
		for (i = 0; i < t; i++)
		{
			if (n.charAt(i) >= 48 && n.charAt(i) <= 57)
			{
				ten = ten + (n.charAt(i) - 48) * cifang(a, t - i - 1);
			}
			else if (n.charAt(i) >= 65 && n.charAt(i) <= 90)
			{
				ten = ten + (n.charAt(i) - 55) * cifang(a, t - i - 1);
			}
			else if (n.charAt(i) >= 97 && n.charAt(i) <= 122)
			{
				ten = ten + (n.charAt(i) - 87) * cifang(a, t - i - 1);
			}
		}
		//???????b??
		t = 0;
		for (i = 0; ; i++)
		{
			t++;
			mod[i] = ten % b;
			ten = (ten - mod[i]) / b;
			if (ten == 0)
			{
				break;
			}
			else
			{
				continue;
			}
		}

		//??
		for (i = t - 1; i >= 0; i--)
		{
			if (mod[i] <= 9)
			{
				System.out.printf("%d", mod[i]);
			}
			else if (mod[i] > 9)
			{
				System.out.printf("%c", mod[i] + 55);
			}
		}
	}
}

