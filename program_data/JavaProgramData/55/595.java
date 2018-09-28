package <missing>;

public class GlobalMembers
{
	//vc++??????
	public static int Main()
	{
		int lenth;
		int a;
		int b;
		int shinumber = 0;
		int temp;
		int bwei;
		int i;
		String num = new String(new char[1000]);
		String final = new String(new char[1000]);
		int[] numshi = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			num = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		lenth = num.length();
		for (i = 0;i < lenth;i++)
		{
			if (num.charAt(i) >= '0' && num.charAt(i) <= '9')
			{
				numshi[i] = num.charAt(i) - '0';
			}
			if (num.charAt(i) >= 'a' && num.charAt(i) <= 'z')
			{
				numshi[i] = num.charAt(i) - 'a' + 10;
			}
			if (num.charAt(i) >= 'A' && num.charAt(i) <= 'Z')
			{
				numshi[i] = num.charAt(i) - 'A' + 10;
			}
		}
		for (i = 0;i < lenth;i++)
		{
			shinumber += numshi[i] * Math.pow(a,lenth - i - 1); // ????
		}
		for (i = 0;;i++)
		{
			temp = shinumber / Math.pow(b,i);
			if (temp == 0)
			{
				bwei = i;
				break;
			}
		}
		temp = shinumber;
		for (i = 0;i < bwei;i++)
		{
			numshi[i] = temp / Math.pow(b,bwei - i - 1);
			temp -= numshi[i] * Math.pow(b,bwei - i - 1);
		}
		for (i = 0;i < bwei;i++)
		{
			if (numshi[i] < 10)
			{
				final = tangible.StringFunctions.changeCharacter(final, i, numshi[i] + '0');
			}
			else
			{
				final = tangible.StringFunctions.changeCharacter(final, i, numshi[i] - 10 + 'A');
			}
		}
		if (shinumber != 0)
		{
		for (i = 0;i < bwei;i++)
		{
			System.out.printf("%c",final.charAt(i));
		}
		}
		else
		{
			System.out.print("0");
		}
	}

}

