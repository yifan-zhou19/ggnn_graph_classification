public class yasuo
{
	public char d;
	public int m;
}

package <missing>;

public class GlobalMembers
{
	public static yasuo[] b = tangible.Arrays.initializeWithDefaultyasuoInstances(1010);
	public static int Main()
	{
		int n;
		int i;
		int k = 0;
		String a = new String(new char[1010]);
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i <= n - 1;i++)
		{
					   if (a.charAt(i) >= 97)
					   {
						   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
					   }
		}
		for (i = 0;i <= n - 1;i++)
		{
			b[k].d = a.charAt(i);
			b[k].m = 1;
			while (a.charAt(i + 1) == a.charAt(i))
			{
				b[k].m++;
				i++;
			}
			k++;
		}
		for (i = 0;i <= k - 1;i++)
		{
			System.out.printf("(%c,%d)",b[i].d,b[i].m);
		}
		return 0;
	}

}

