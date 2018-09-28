package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int expa;
		int expb;
		int temp = 0;
		String r = new String(new char[65]);
		char[] n = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		expa = n.length();
		for (i = 0;n[i] != '\0';i++)
		{
			if (n[i] >= 'a')
			{
				n[i] += -87;
			}
			else if (n[i] >= 'A')
			{
				n[i] += -55;
			}
			else
			{
				n[i] += -48;
			}
			temp += n[i] * (int)Math.pow(a,expa - 1 - i);
		}
		if (temp == 0)
		{
			System.out.print("0");
		}
		else
		{
			expb = (int)(Math.log(temp) / Math.log(b)) + 1;
			for (i = 0;i < expb;i++)
			{
				r = tangible.StringFunctions.changeCharacter(r, i, (temp % (int)(Math.pow(b,expb - i))) / (int)Math.pow(b,expb - 1 - i));
				if (r.charAt(i) >= 10)
				{
					r.charAt(i) += 55;
				}
				else
				{
					r.charAt(i) += 48;
				}
				System.out.printf("%c",r.charAt(i));
			}
		}
	System.out.print("\n");
	}
}

