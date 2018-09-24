package <missing>;

public class GlobalMembers
{
	/*
	 * temp.cpp
	 *
	 *  Created on: 2011-5-8
	 *      Author: 10288
	 */
	public static void add(tangible.RefObject<String> a, tangible.RefObject<String> b)
	{
		String c = new String(new char[301]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,'0',(Character.SIZE / Byte.SIZE));
		int[] d = new int[301];
		int[] f = new int[301];
		int l1 = a.argValue.length();
		int l2 = b.argValue.length();
		int i;
		int t;
		int j;
		for (i = l1 - 1;i >= 0;i--)
		{
			d[l1 - 1 - i] = a.argValue.charAt(i) - '0';
		}
		for (i = l2 - 1;i >= 0;i--)
		{
			f[l2 - 1 - i] = b.argValue.charAt(i) - '0';
		}
		for (i = l2;i < l1;i++)
		{
			f[i] = 0;
		}
		for (i = 0;i < l1;i++)
		{
			t = d[i] + f[i] + c.charAt(i) - '0';
			c = tangible.StringFunctions.changeCharacter(c, i, t % 10 + '0');
			c = tangible.StringFunctions.changeCharacter(c, i + 1, t / 10 + '0');
		}
		for (i = 200;i >= 0;i--)
		{
			if (c.charAt(i) != '0')
			{
				break;
			}
		}
		for (j = i;j >= 0;j--)
		{
			System.out.print(c.charAt(j));
		}
	}
	public static int Main()
	{
		String a = new String(new char[301]);
		String b = new String(new char[301]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (strcmp(a,"0") == 0 && strcmp(b,"0") == 0)
		{
			System.out.print(0);
		}
		else
		{
		if (a.length() >= b.length())
		{
		tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
		tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
			add(tempRef_a, tempRef_b);
			b = tempRef_b.argValue;
			a = tempRef_a.argValue;
		}
		else
		{
		tangible.RefObject<String> tempRef_b2 = new tangible.RefObject<String>(b);
		tangible.RefObject<String> tempRef_a2 = new tangible.RefObject<String>(a);
			add(tempRef_b2, tempRef_a2);
			a = tempRef_a2.argValue;
			b = tempRef_b2.argValue;
		}
		}

	}

}

