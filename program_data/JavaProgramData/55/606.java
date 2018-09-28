package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int b;
		int c = 0;
		int[] t = new int[100];
		int l;
		int[] k = new int[100];
		String s = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		l = s.length();
		for (i = 0;i < l;i++)
		{
			if ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z'))
			{
			t[i] = s.charAt(i) - 87;
			}
			else if ((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z'))
			{
			t[i] = s.charAt(i) - 55;
			}
			else
			{
				t[i] = s.charAt(i) - 48;
			}
		}
		for (i = l - 1;i > -1;i--)
		{
			c += t[i] * Math.pow(a,l - 1 - i);
		}
		for (i = 1;;i++)
		{

			k[i] = c % b;

			if (k[i] > 9)
			{
				k[i] = k[i] + 55;
			}
			if (c < b)
			{
				break;
			}
			int h = c / b;
			c = h;

		}
		for (;i > 0;i--)
		{
			if (k[i] >= 55)
			{
				System.out.printf("%c",k[i]);
			}
			else
			{
			System.out.printf("%d",k[i]);
			}
		}
		return 0;
	}

}

