package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int h;
		int i;
		String no = new String(new char[5]);

		if (num <= 0)
		{
			num = -num;
			h = -1;
		}

		for (i = 4;i >= 0;i--)
		{
			no = tangible.StringFunctions.changeCharacter(no, i, num / ((int) Math.pow(10, i))); //???????(parameter)????????????!!;(int)pow(10,i)????????.
			num = num - (no.charAt(i) * ((int) Math.pow(10,i)));
		}
		if (no.charAt(4) != 0)
		{
		num = no.charAt(0) * 10000 + no.charAt(1) * 1000 + no.charAt(2) * 100 + no.charAt(3) * 10 + no.charAt(4);
		}
		else if (no.charAt(3) != 0)
		{
		num = no.charAt(0) * 1000 + no.charAt(1) * 100 + no.charAt(2) * 10 + no.charAt(3);
		}
		else if (no.charAt(2) != 0)
		{
		num = no.charAt(0) * 100 + no.charAt(1) * 10 + no.charAt(2);
		}
		else if (no.charAt(1) != 0)
		{
		num = no.charAt(0) * 10 + no.charAt(1);
		}
		else
		{
			num = no.charAt(0);
		}

		if (h == -1)
		{
			num = -num; //=?==!!!!!!!!!
		}
		return (num);
	}
	public static void Main()
	{
		int num;
		int ci;
		for (ci = 1;ci <= 6;ci++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}
		num = reverse(num);
		System.out.printf("%d\n",num);
		}
	}

}

