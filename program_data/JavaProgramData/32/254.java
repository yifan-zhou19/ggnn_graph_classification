public class number
{
	public String a = new String(new char[100]);
	public int lena;
	public String b = new String(new char[100]);
	public int lenb;
}

package <missing>;

public class GlobalMembers
{
	public static number[] num = tangible.Arrays.initializeWithDefaultnumberInstances(1000);

	public static void Main()
	{
		int n;
		int i;
		int j;
		int ll;

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
				   num[i].a = tempVar2.charAt(0);
			   }
			   num[i].lena = String.valueOf(num[i].a).length();
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   num[i].b = tempVar3.charAt(0);
			   }
			   num[i].lenb = String.valueOf(num[i].b).length();
		}
		for (i = 0;i < n;i++)
		{
			ll = num[i].lena - num[i].lenb;
			for (j = num[i].lenb - 1;j >= 0;j--)
			{
				if (num[i].a.charAt(j + ll) - num[i].b.charAt(j) >= 0)
				{
					num[i].a = tangible.StringFunctions.changeCharacter(num[i].a, j + ll, num[i].a.charAt(j + ll) - num[i].b.charAt(j) + 48);
				}
				else
				{
					num[i].a = tangible.StringFunctions.changeCharacter(num[i].a, j + ll, num[i].a.charAt(j + ll) - num[i].b.charAt(j) + 48 + 10);
					num[i].a.charAt(j + ll - 1)--;
				}
			}
			System.out.printf("%s\n",num[i].a);
		}

	}
}

