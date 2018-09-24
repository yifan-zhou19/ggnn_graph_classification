import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, '0', (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b, '0', (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c, '0', (Character.SIZE / Byte.SIZE));

		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();

		int len_a = a.length();
		int len_b = b.length();

		int i;
		int j;
		int temp;
		for (i = 0, j = len_a - 1; i < j; i++, j--)
		{
			temp = a.charAt(i);
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(j));
			a = tangible.StringFunctions.changeCharacter(a, j, temp);
		}
		for (i = 0, j = len_b - 1; i < j; i++, j--)
		{
			temp = b.charAt(i);
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(j));
			b = tangible.StringFunctions.changeCharacter(b, j, temp);
		}

		//cout << a << endl << b << endl;

		int len = Math.max(len_a, len_b);
		for (i = 0; i < len; i++)
		{
			int x = a.charAt(i) - '0';
			int y = b.charAt(i) - '0';
			if (x < 0)
			{
				x = 0;
			}
			if (y < 0)
			{
				y = 0;
			}
			int z = x + y + (c.charAt(i) - '0');
			if (z < 10)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, z + '0');
			}
			else
			{
				c.charAt(i + 1) += 1;
				c = tangible.StringFunctions.changeCharacter(c, i, z - 10 + '0');
			}
		}

		i = 299;
		while (c.charAt(i) == '0' && i >= 0)
		{
			i--;
		}
		if (i < 0)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		else
		{
			for (; i >= 0; i--)
			{
				System.out.print(c.charAt(i));
			}
			System.out.print("\n");
		}

		return 0;
	}

}

