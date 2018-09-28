package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[10000]);
		String m = new String(new char[10000]);
		int a;
		int b;
		int i;
		int j;
		int[] n = new int[10000];
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		for (i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) <= 'z' && str.charAt(i) >= 'a')
			{
				str.charAt(i) -= 32;
			}
			else
			{
				str.charAt(i) += 0;
			}
		}
		for (i = 0; i < str.length(); i++)
		{
			if ('0' <= str.charAt(i) && str.charAt(i) <= '9')
			{
				str.charAt(i) -= 48;
			}
			else
			{
				str.charAt(i) -= 55;
			}
			n[i] = str.charAt(i);
		}
		for (i = 0; i < str.length(); i++)
		{
			sum += n[i] * Math.pow(a, str.length() - i - 1);
		}
		for (i = 0; ;i++)
		{
			n[i] = sum % b;
			sum /= b;
			if (sum == 0)
			{
				break;
			}
			else
			{
				continue;
			}
		}
		for (j = 0; j <= i; j++)
		{
			if (n[j] < 10)
			{
				m = tangible.StringFunctions.changeCharacter(m, j, n[j] + 48);
			}
			else
			{
				m = tangible.StringFunctions.changeCharacter(m, j, n[j] + 55);
			}
		}
		for (j = i; j >= 0; j--)
		{
			System.out.printf("%c", m.charAt(j));
		}
	}
}

