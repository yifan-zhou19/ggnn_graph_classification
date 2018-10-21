package <missing>;

public class GlobalMembers
{
	/*********************
	*file:4.cpp
	*author:?? 
	*time:2013-10-19 
	*description:?????????? 
	***********************/
	public static int Main()
	{
		int[] a = new int[110];
		int[] b = new int[110];
		int[] c = new int[110];
		String str1 = new String(new char[110]);
		String str2 = new String(new char[110]);
		int n;
		int i;
		int j;
		int len1;
		int len2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(c,0,(Integer.SIZE / Byte.SIZE)); //????????0
			str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len1 = str1.length();
			len2 = str2.length();
			j = 0;
			for (i = len1 - 1; i >= 0; i--) //?str1???a???
			{
				a[j++] = str1.charAt(i) - '0';
			}
			j = 0;
			for (i = len2 - 1; i >= 0; i--) //?str2???b???
			{
				b[j++] = str2.charAt(i) - '0';
			}
			for (i = 0; i < len1; i++) //?????
			{
				c[i] += (a[i] - b[i]);
				if (c[i] < 0) //??
				{
					c[i + 1]--;
					c[i] += 10;
				}
			}
			i = len1 - 1;
			while (c[i] == 0) //???0???
			{
				i--;
				if (i == -1)
				{
					break;
				}
			}
			if (i == -1) //????1????
			{
				System.out.print(0);
				System.out.print("\n");
				continue;
			}
			while (i >= 0)
			{
				System.out.print(c[i]);
				i--;
			}
			System.out.print("\n");
		}
		return 0;
	}
}

