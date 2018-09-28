package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int[] t = new int[100];
		int n1;
		int n2;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			n1 = a.length();
			n2 = b.length();
			for (j = n1 - 1,k = n2 - 1;k >= 0;k--)
			{
				if (a.charAt(j) < b.charAt(k))
				{
					t[j] = a.charAt(j) - b.charAt(k) + 10;
					a = tangible.StringFunctions.changeCharacter(a, j - 1, a.charAt(j - 1) - 1);
				}
				else
				{
					t[j] = a.charAt(j) - b.charAt(k);
				}
				j--;
			}
			for (j = 0;j < n1 - n2;j++)
			{
				t[j] = a.charAt(j) - '0';
			}
			for (j = 0;j < n1;j++)
			{
				System.out.printf("%d",t[j]);
			}
			System.out.print("\n");
		}
	}

}

