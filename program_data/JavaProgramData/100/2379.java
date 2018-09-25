package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[10000]);
	public static int i;
	public static int bo;
	public static int[] ctt = new int[10000];
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ctt, 0, (Integer.SIZE / Byte.SIZE));
		bo = 0;
		for (i = 0; i < a.length(); i++)
		{
			if ((a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || (a.charAt(i) >= 'a' && a.charAt(i) <= 'z'))
			{
				ctt[a.charAt(i)]++, bo = 1;
			}
		}
		if (bo == 0)
		{
			System.out.print("No");
		}
		for (i = 'A'; i <= 'Z'; i++)
		{
			if (ctt[i] != 0)
			{
				System.out.printf("%c=%d\n\n", i, ctt[i]);
			}
		}
		for (i = 'a'; i <= 'z'; i++)
		{
			if (ctt[i] != 0)
			{
				System.out.printf("%c=%d\n\n", i, ctt[i]);
			}
		}
		return 0;
	}

}

