package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l1;
		int l2;
		int[] c = new int[101];
		int[] d = new int[101];
		String a = new String(new char[101]); //????????????
		String b = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Character.SIZE / Byte.SIZE)); //??????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0 && (b = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0) //?????
		{
			int i = 0;
			int j = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(c,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(d,0,(Integer.SIZE / Byte.SIZE));
			l1 = a.length();
			l2 = b.length(); //?????????????????
			for (i = l1 - 1;i >= 0;i--)
			{
				 c[j++] = a.charAt(i) - '0';
			}
			j = 0;
			for (i = l2 - 1;i >= 0;i--)
			{
				 d[j++] = b.charAt(i) - '0';
			}
			for (i = 0;i < 100;i++) //???
			{
				 c[i + 1]--;
				 c[i] = c[i] + 10;
				c[i] = c[i] - d[i];
				if (c[i] >= 10)
				{
					c[i] = c[i] - 10;
					c[i + 1] = c[i + 1] + 1;
				}
			}
			i = 100;
			while (c[i] == 0 && i > 0) //???
			{
				i--;
			}
			for (j = i;j >= 0;j--)
			{
				System.out.print(c[j]);
			}
			System.out.print("\n");
		};
		return 0;
	}
}

