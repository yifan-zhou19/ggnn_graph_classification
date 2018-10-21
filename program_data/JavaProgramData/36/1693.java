package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		int i;
		int la;
		int lb;
		int[] A = new int[1000];
		int[] B = new int[1000];
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
		la = a.length();
		lb = b.length();
		if (la != lb)
		{
			System.out.print("NO");
			return 0;
		}
		else
		{
			for (i = 0;i < la;i++)
			{
				A[a.charAt(i)]++;
				B[b.charAt(i)]++;
			}
		}
		for (i = 0;i < 1000;i++)
		{
			if (A[i] != B[i])
			{
			System.out.print("NO");
			break;
			}
			if (i == 999)
			{
				System.out.print("YES");
				break;
			}
		}
		return 0;
	}

}

