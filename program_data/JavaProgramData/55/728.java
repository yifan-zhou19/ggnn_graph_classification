package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //?????????????
		int a;
		int b;
		int n;
		int[] e = new int[100];
		int[] f = new int[100];
		int value = 0;
		String c = new String(new char[100]); //????????????
		String d = new String(new char[100]);

		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = c.length();

		for (i = 0;i < n;i++)
		{
			if (c.charAt(i) > 91)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 32); //???????????????
			}
		}


		for (i = 0;i < n;i++)
		{
			if (c.charAt(i) > 60)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 55); //?????A~Z?????10~35
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 48); //???0~9?????0~9/*    cout<<f[i];*/
			}
		}


		for (i = 0;i < n;i++)
		{
			e[i] = (int)(c.charAt(i)); //?????c[i]??????????e[i]
		}


		for (i = 0;i < n;i++)
		{
			value = value + e[i] * Math.pow((double)a,(double)(n - i - 1)); //?????????
		}

		if (value == 0)
		{
			System.out.print(value);
		}

		for (i = 0;i < 100;i++)
		{
			if (Math.pow((double)b,(double)i) < value)
			{
				f[i] = (value % ((int)Math.pow((double)b,(double)(i + 1)))) / (int)Math.pow((double)b,(double)i); //?f[i]?????????

				d = tangible.StringFunctions.changeCharacter(d, i, (char)(f[i]));

			if (d.charAt(i) > 9)
			{
				d = tangible.StringFunctions.changeCharacter(d, i, d.charAt(i) + 55); //???10~35???????A~Z
			}
			else
			{
				d = tangible.StringFunctions.changeCharacter(d, i, d.charAt(i) + 48); //?0~9???????0~9
			}
			}
		}


		for (i = 99;i >= 0;i--)
		{
			if (Math.pow((double)b,(double)i) < value)
			{
				System.out.print(d.charAt(i));
			}
		}


		return 0;
	}
}

