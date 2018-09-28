package <missing>;

public class GlobalMembers
{
	public static void string1(tangible.RefObject<String> a, int[] x1, int[] x2, int len)
	{
		int temp1 = 0;
		int temp2 = 0;
		for (int i = 0; x2[i] != 0; i++)
		{
			if (a.argValue.charAt(x2[i] + len / 2) == a.argValue.charAt(x2[i] - len / 2) && x2[i] + len / 2 != 0 && x2[i] + len / 2 < 501 && x2[i] - len / 2 >= 0) //?????
			{
				out(x1[i] - len / 2, len, a);
				x2[temp2] = x2[i]; //??x2???????
				temp2++;
			}
		}
		x2[temp2] = 0;
		if (x1[0] == 0 && x2[0] == 0)
		{
			System.exit(0); //?????????????????
		}
		string2(a, x1, x2, ++len);
	}
	public static void string2(tangible.RefObject<String> a, int[] x1, int[] x2, int len)
	{
		int temp1 = 0;
		int temp2 = 0;
		for (int i = 0; x1[i] != 0; i++)
		{
			if (a.argValue.charAt(x1[i] + len / 2 - 1) == a.argValue.charAt(x1[i] - len / 2) && x1[i] + len / 2 - 1 != 0 && x1[i] + len / 2 - 1 < 501 && x1[i] - len / 2 >= 0) //?????
			{
				out(x1[i] - len / 2, len, a);
				x1[temp2] = x1[i];
				temp2++;
			}
		}
		x1[temp2] = 0;
		if (x1[0] == 0 && x2[0] == 0)
		{
			System.exit(0); //?????????????????
		}
		string1(a, x1, x2, ++len);
	}
	public static void out(int q, int len, tangible.RefObject<String> a)
	{
		for (int i = 0; i < len; i++)
		{
			System.out.print(a.argValue.charAt(q + i));
		}
		System.out.print("\n");
	}

	public static int Main()
	{
		String a = new String(new char[501]);
		int[] x1 = new int[501];
		int[] x2 = new int[501];
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int j = 0;
		for (int i = 1; a.charAt(i) != '\0'; i++)
		{
			if (a.charAt(i - 1) == a.charAt(i))
			{
				System.out.print(a.charAt(i - 1));
				System.out.print(a.charAt(i));
				System.out.print("\n");
				x1[j] = i;
				j++;
			}
		}
		j = 0;
		for (int i = 1; a.charAt(i + 1) != '\0'; i++)
		{
			if (a.charAt(i - 1) == a.charAt(i + 1) && a.charAt(i) != a.charAt(i - 1))
			{
				System.out.print(a.charAt(i - 1));
				System.out.print(a.charAt(i));
				System.out.print(a.charAt(i + 1));
				System.out.print("\n");
				x2[j] = i;
				j++;
			}
		}
		//??????2?3???,??????
	tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
		string1(tempRef_a, x1, x2, 3); //??????????
		a = tempRef_a.argValue;
	}

}

