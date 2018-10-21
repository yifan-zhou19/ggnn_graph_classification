package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void jiafa(char a[],char b[],int c[]);
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int[] jieguo = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(jieguo,0,(Integer.SIZE / Byte.SIZE));
		jiafa(a, b, jieguo);
		int i = 296;
		while (jieguo[i] == 0 && i > 0)
		{
			i--;
		}
		if (i == 0)
		{
			System.out.print(jieguo[0]);
		}
		else
		{
			for (;i >= 0;i--)
			{
				System.out.print(jieguo[i]);
			}
		}
	}

	public static void jiafa(String a, String b, int[] c)
	{
		final int len = 300;
		int[] an = new int[len];
		int[] bn = new int[len];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(bn,0,(Integer.SIZE / Byte.SIZE));
		int lena = a.length();
		int lenb = b.length();
		int i = 0;
		int j = 0;
		for (i = lena - 1;i >= 0;i--)
		{
			an[j++] = a[i] - '0';
		}
		j = 0;
		for (i = lenb - 1;i >= 0;i--)
		{
			bn[j++] = b[i] - '0';
		}
		for (i = 0;i < len;i++)
		{
			an[i] += bn[i];
			if (an[i] > 9)
			{
				an[i] -= 10;
				an[i + 1]++;
			}
			c[i] = an[i];
		}
	}
}

