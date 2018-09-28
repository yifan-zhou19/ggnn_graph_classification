package <missing>;

public class GlobalMembers
{
	public static int arr(String a, String b)
	{
		int i;
		int n;
		int m;
		int[] count1 = new int[128];
		int[] count2 = new int[128];
		n = a.length();
		m = b.length();
		if (n != m)
		{
			return 0;
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				count1[a[i]]++;
				count2[b[i]]++;
			}
		}
		for (i = 0;i < 128;i++)
		{
		if (count1[i] != count2[i])
		{
			return 0;
		break;
		}
		}
		return 1;
	}
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		if (arr(a, b) == 0)
		{
			System.out.print("NO");
		}
		if (arr(a, b) == 1)
		{
			System.out.print("YES");
		}
		return 0;
	}

}

