package <missing>;

public class GlobalMembers
{
	/*Conversion from characters to numbers*/
	public static void char2int(tangible.RefObject<Integer> length, tangible.RefObject<String> a, int[] aa)
	{
		int temp = 0;
		int k = 0;
		for (int j = 0; j < length.argValue; ++j)
		{
			if (a.argValue.charAt(j) == ',')
			{
				temp = 0;
				++k;
			}
			else
			{
				aa[k] = 10 * aa[k] + a.argValue.charAt(j) - '0';
			}
		}
	}

	public static int Main()
	{
		char c;
		String a = new String(new char[4 * 1000]);
		String b = new String(new char[4 * 1000]);
		int[] aa = new int[1000];
		int[] bb = new int[1000];
		int[] stat = new int[1000];
		int i = 0;
		int num = 0;
		int length1 = 0;
		int length2 = 0;
		int maxindex = 0;
		int in;
		int out;
		while (scanf("%c", c) != EOF && c != '\n')
		{
			a = tangible.StringFunctions.changeCharacter(a, i++, c);
			++length1;
			if (c == ',')
			{
				++num;
			}
		}
		i = 0;
		while (scanf("%c", c) != EOF && c != '\n')
		{
			b = tangible.StringFunctions.changeCharacter(b, i++, c);
			++length2;
		}
	tangible.RefObject<Integer> tempRef_length1 = new tangible.RefObject<Integer>(length1);
	tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
		char2int(tempRef_length1, tempRef_a, aa);
		a = tempRef_a.argValue;
		length1 = tempRef_length1.argValue;
	tangible.RefObject<Integer> tempRef_length2 = new tangible.RefObject<Integer>(length2);
	tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
		char2int(tempRef_length2, tempRef_b, bb);
		b = tempRef_b.argValue;
		length2 = tempRef_length2.argValue;
		++num;
		for (int i = 0; i < num; ++i)
		{
			in = aa[i];
			out = bb[i];
			for (int j = in; j < out; ++j)
			{
				++stat[j];
			}
		}
		for (int i = 0; i < 1000; ++i)
		{
			if (stat[i] > stat[maxindex])
			{
				maxindex = i;
			}
		}
		System.out.print(num);
		System.out.print(" ");
		System.out.print(stat[maxindex]);
		System.out.print("\n");
		return 0;
	}

}

