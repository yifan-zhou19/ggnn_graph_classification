package <missing>;

public class GlobalMembers
{
	public static int Find(tangible.RefObject<String> tgt, tangible.RefObject<String> src)
	{
		int len_t;
		int len_s;
		int i;
		int j = 0;
		len_t = tgt.argValue.length();
		len_s = src.argValue.length();

		for (i = 0; i < len_s; i++)
		{
			if (*(tgt.argValue.Substring(j)) == *(src.argValue.Substring(i)))
			{
				j++;
			}
			else
			{
				j = 0;
			}
			if (j == len_t)
			{
				return (i - j);
			}
		}
	}

	public static int Main()
	{
		int i;
		int len;
		String tgt = new String(new char[50]);
		String src = new String(new char[50]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			tgt = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			src = tempVar2.charAt(0);
		}

	tangible.RefObject<String> tempRef_tgt = new tangible.RefObject<String>(tgt);
	tangible.RefObject<String> tempRef_src = new tangible.RefObject<String>(src);
		System.out.printf("%d\n", Find(tempRef_tgt, tempRef_src) + 1);
		src = tempRef_src.argValue;
		tgt = tempRef_tgt.argValue;

		return 0;
	}
}

