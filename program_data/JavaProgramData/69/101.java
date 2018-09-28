package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String inl = new String(new char[200]);
		String ink = new String(new char[200]);
		int[] a = new int[200];
		int[] b = new int[200];
		int[] c = new int[200];
		int[] out = new int[200];
		int len1;
		int len2;
		int i;
		int j;
		int len = 1;
		inl = ConsoleInput.readToWhiteSpace(true).charAt(0);
		ink = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(out,0,(Integer.SIZE / Byte.SIZE));
		len1 = inl.length();
		len2 = ink.length();
		j = 0;
		for (i = len1 - 1;i >= 0;i--)
		{
			a[j] = inl.charAt(i) - 48;
			j += 1;
		}
		j = 0;
		for (i = len2 - 1;i >= 0;i--)
		{
			b[j] = ink.charAt(i) - 48;
			j += 1;
		}
		for (i = 0;i < 200;i++)
		{
			if (a[i] + b[i] + c[i] >= 10)
			{
				c[i + 1] += 1;
				out[i] = (c[i] + a[i] + b[i]) % 10;
			}
			else
			{
				out[i] = c[i] + a[i] + b[i];
			}
		}
		for (i = 199;i >= 0;i--)
		{
			if (out[i] != 0)
			{
				len = i + 1;
				break;
			}
		}
		for (i = len - 1;i >= 0;i--)
		{
			System.out.print(out[i]);
		}
		return 0;
	}
}

