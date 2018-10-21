package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String ch = new String(new char[300]);
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			ch = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		int k = 0;
		int i;
		for (i = 0;i < ch.length();i++)
		{
			if (ch.charAt(i) >= '0' && ch.charAt(i) <= '9')
			{
				k = k * a + ch.charAt(i) - '0';
				continue;
			}
			if (ch.charAt(i) >= 'A' && ch.charAt(i) <= 'Z')
			{
				k = k * a + ch.charAt(i) - 'A' + 10;
				continue;
			}
			if (ch.charAt(i) >= 'a' && ch.charAt(i) <= 'z')
			{
				k = k * a + ch.charAt(i) - 'a' + 10;
				continue;
			}
		}
		int[] save = new int[1000];
		i = 0;
		if (k == 0)
		{
			System.out.print("0");
		}
		else
		{
		while (k > 0)
		{
			save[i] = k % b;
			k = k / b;
			i++;
		}
		i--;
		while (i >= 0)
		{
			if (save[i] < 10)
			{
				System.out.printf("%d",save[i]);
			}
			else
			{
				System.out.printf("%c",save[i] + 55);
			}
			i--;
		}
		}
	}
}

