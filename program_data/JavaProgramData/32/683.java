package <missing>;

public class GlobalMembers
{
	/*
	 * ????BigIntegerSubtraction.cpp
	 * ?????????????
	 * Created on: 2010-12-25
	 * Author: ???
	 */
	public static int Main()
	{
		int n;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String d = new String(new char[100]);
		String e = new String(new char[100]);
		int[] f = new int[100];
		int i;
		int j;
		int k;
		int p;
		int q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(f,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(d,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(e,0,(Character.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = new Scanner(System.in).nextLine();
		for (k = 1;k <= n;k++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(b,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(f,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(d,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(e,0,(Character.SIZE / Byte.SIZE));
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			p = a.length();
			q = b.length();
			for (j = 0;j < p;j++)
			{
				d = tangible.StringFunctions.changeCharacter(d, j, a.charAt(p - 1 - j));
			}
			for (j = 0;j < q;j++)
			{
				e = tangible.StringFunctions.changeCharacter(e, j, b.charAt(q - 1 - j));
			}
			for (i = 0;i < q;i++)
			{
				if (d.charAt(i) >= e.charAt(i))
				{
				   f[i] = d.charAt(i) - e.charAt(i);
				}
				else
				{
					f[i] = 10 + d.charAt(i) - e.charAt(i);
					d = tangible.StringFunctions.changeCharacter(d, i + 1, d.charAt(i + 1) - 1);
				}

			}
			for (;i < p;i++)
			{
				f[i] = d.charAt(i) - '0';
			}
			for (i = 99;i >= 0;i--)
			{
				if (f[i] != 0)
				{
					break;
				}


			}
			for (;i >= 0;i--)
			{
				System.out.print(f[i]);
			}
			System.out.print("\n");


		}
		return 0;

	}
}

