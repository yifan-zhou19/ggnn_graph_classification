package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int p;
		int len;
		int w = 0;
		String s = new String(new char[1000]);
		String s1 = new String(new char[1000]);
		int[] zs = new int[1000];
		int[] zs1 = new int[1000];
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
		len = s.length();

		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57)
			{
			zs[i] = s.charAt(i) - 48;
			}
		else if (s.charAt(i) <= 90 && s.charAt(i) >= 65)
		{
			zs[i] = s.charAt(i) - 55;
		}
		else if (s.charAt(i) <= 122 && s.charAt(i) >= 97)
		{
			zs[i] = s.charAt(i) - 87;
		}
			w = w * a + zs[i];
		}
		for (i = 0;i < 1000;i++)
		{
			p = i;
			zs1[i] = w % b;
			w = w / b;
			if (w == 0)
			{
				break;
			}

		}


		for (i = 0;i <= p;i++)
		{
			if (zs1[i] >= 0 && zs1[i] <= 9)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, i, zs1[i] + 48);
			}
			else if (zs1[i] >= 10)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, i, zs1[i] + 55);
			}
			else
			{
				break;
			}

		}

		for (i = p;i >= 0;i--)
		{
			System.out.printf("%c",s1.charAt(i));
		}
	}










}

