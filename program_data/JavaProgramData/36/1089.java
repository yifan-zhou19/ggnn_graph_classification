package <missing>;

public class GlobalMembers
{
	public static int count(tangible.RefObject<String> p, tangible.RefObject<Integer> pn, int n)
	{
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 65;j < 91;j++)
			{
				if (*(p.argValue.Substring(i)) == j)
				{
					(*(pn.argValue + j - 65))++;
				}
			}
			for (j = 97;j < 123;j++)
			{
				if (*(p.argValue.Substring(i)) == j)
				{
					(*(pn.argValue + j - 97 + 26))++;
				}
			}

		}
		return 0;
	}

	public static int Main()
	{
		String z1 = new String(new char[100]);
		String z2 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			z1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			z2 = tempVar2.charAt(0);
		}
		int[] a1 = new int[52];
		int[] a2 = new int[52];
		int n1 = z1.length();
		int n2 = z2.length();
		int i;
		int flag = 0;
		String p1 = z1;
		String p2 = z2;
		int[] pn1 = a1;
		int[] pn2 = a2;
	tangible.RefObject<String> tempRef_p1 = new tangible.RefObject<String>(p1);
	tangible.RefObject<Integer> tempRef_pn1 = new tangible.RefObject<Integer>(pn1);
		count(tempRef_p1, tempRef_pn1, n1);
		pn1 = tempRef_pn1.argValue;
		p1 = tempRef_p1.argValue;
	tangible.RefObject<String> tempRef_p2 = new tangible.RefObject<String>(p2);
	tangible.RefObject<Integer> tempRef_pn2 = new tangible.RefObject<Integer>(pn2);
		count(tempRef_p2, tempRef_pn2, n2);
		pn2 = tempRef_pn2.argValue;
		p2 = tempRef_p2.argValue;
		for (i = 0;i < 52;i++)
		{
			if (a1[i] != a2[i])
			{
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}
}

