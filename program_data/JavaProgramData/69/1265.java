package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a1 = new String(new char[260]);
		String a2 = new String(new char[260]);

		String result = new String(new char[260]);

		a1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		a2 = ConsoleInput.readToWhiteSpace(true).charAt(0);

		int len1 = a1.length();
		int len2 = a2.length();


//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(result,0,(Character.SIZE / Byte.SIZE));
		int i = len1 - 1;
		int j = len2 - 1;
		int k = 0;

		while (i >= 0 && j >= 0)
		{
			result.charAt(k) += a1.charAt(i) + a2.charAt(j) - '0';
			if (result.charAt(k) > '9')
			{
				result.charAt(k + 1)++;
				result.charAt(k) -= 10;
			}
			i--;
			j--;
			k++;
		}
		if (i >= 0)
		{
			while (i >= 0)
			{
				result.charAt(k) += a1.charAt(i);
				if (result.charAt(k) > '9')
				{
					result.charAt(k + 1)++;
					result.charAt(k) -= 10;
				}
				i--;
				k++;
			}
		}
		if (j >= 0)
		{
			while (j >= 0)
			{
				result.charAt(k) += a2.charAt(j);
				if (result.charAt(k) > '9')
				{
					result.charAt(k + 1)++;
					result.charAt(k) -= 10;
				}
				j--;
				k++;
			}
		}

		if (result.charAt(k) != 0)
		{
			result.charAt(k) += '0';
			k++;
		}

		while (result.charAt(k - 1) == '0' && k != 1)
		{
			k--;
		}


		String final = new String(new char[260]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(final,0,(Character.SIZE / Byte.SIZE));

		for (i = 0;i < k;i++)
		{
			final = tangible.StringFunctions.changeCharacter(final, i, result.charAt(k - 1 - i));
		}

		System.out.print(final);
		System.out.print("\n");



	}
}

