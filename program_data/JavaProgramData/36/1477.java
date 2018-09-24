package <missing>;

public class GlobalMembers
{
	//?????? ???

	public static String A = new String(new char[200]);
	public static String B = new String(new char[200]);
	public static int[] a = new int[256];
	public static int[] b = new int[256];
	public static int i;

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			A = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			B = tempVar2.charAt(0);
		}
		i = 0;

		//????????????????
		while (A.charAt(i) != '\0')
		{
			a[A.charAt(i)]++;
			i++;
		}
		i = 0;
		while (B.charAt(i) != '\0')
		{
			b[B.charAt(i)]++;
			i++;
		}

		//??????
		for (i = 0;i < 256;i++)
		{
			if (a[i] != b[i])
			{
				System.out.print("NO");
				return 0;
			}
		}

		System.out.print("YES");
	}

}

