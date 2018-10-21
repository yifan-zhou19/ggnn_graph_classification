package <missing>;

public class GlobalMembers
{
	public static void shuchu(int[] c, int i)
	{
		int j;
		for (j = i - 1 ; j >= 0 ; j--)
		{
			if (c[j] >= 0 && c[j] <= 9)
			{
				System.out.print(c[j]);
			}
			if (c[j] >= 10)
			{
				System.out.print((char)(c[j] + 55));
			}
		}
		System.out.print("\n");
	}
	public static int Main()
	{
		String str1 = new String(new char[10000]);
		String str2 = new String(new char[10000]);
		char l;
		int i;
		int j;
		int[] num = new int[10000];
		int sum = 0;
		int[] c = new int[10000];
		int nlen;
		int k;
		double before;
		double after;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str1, ' ', (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str2, ' ', (Character.SIZE / Byte.SIZE));
		before = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		after = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		nlen = str1.length();
		for (i = 0 ; i < nlen ; i++)
		{
			if (str1.charAt(i) >= 97 && str1.charAt(i) < 122)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, (char)Character.toUpperCase(str1.charAt(i)));
			}
			if (str1.charAt(i) >= 65 && str1.charAt(i) <= 90)
			{
				num[i] = str1.charAt(i) - '7';
			}
			else
			{
				num[i] = str1.charAt(i) - '0';
			}
		}
		k = nlen - 1;
		for (i = 0 ; i < nlen ; i++)
		{

			sum = sum + num[i] * Math.pow(before, k);
			k--;
		}
		i = 0;
		do
		{
			c[i] = sum % (int)after;

			sum = sum / after;
			i++;
		}while (sum > 0);
		shuchu(c, i);

		return 0;
	}

}

