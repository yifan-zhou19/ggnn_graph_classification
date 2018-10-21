package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int[] flag = new int[200];
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(flag, 0, (Integer.SIZE / Byte.SIZE));
		int lenA = a.length();
		int lenB = b.length();
		for (i = 0; i < lenA; i++)
		{
			flag[a.charAt(i)]++;
		}
		if (lenA != lenB)
		{
			System.out.print("NO");
			return 0;
		}
		for (i = 0; i < lenB; i++)
		{
			flag[b.charAt(i)]--;
			if (flag[b.charAt(i)] < 0)
			{
				System.out.print("NO");
				return 0;
			}
		}
		System.out.print("YES");
		return 0;
	}

}

