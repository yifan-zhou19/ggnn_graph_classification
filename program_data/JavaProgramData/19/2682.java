public class node
{
	public String str = new String(new char[110]);
}

package <missing>;

public class GlobalMembers
{
	public static node[] all = tangible.Arrays.initializeWithDefaultnodeInstances(110);

	public static int Main()
	{
		String s = new String(new char[110]);
		String str = new String(new char[110]);
		String word = new String(new char[110]);
		String one = new String(new char[110]);
		int i;
		int j;
		int k;
		s = new Scanner(System.in).nextLine();
		str = new Scanner(System.in).nextLine();
		word = new Scanner(System.in).nextLine();

		for (k = 0, j = 0, i = 0; ; i++)
		{
			if (s.charAt(i) == ' ' || s.charAt(i) == '\0')
			{
				one = tangible.StringFunctions.changeCharacter(one, j, '\0');
				all[k].str = one;
				j = 0;
				k++;
				if (s.charAt(i) == '\0')
				{
					break;
				}
				continue;
			}
			one = tangible.StringFunctions.changeCharacter(one, j++, s.charAt(i));
		}

		for (i = 0; i < k; i++)
		{
			if (strcmp(all[i].str, str) == 0)
			{
				all[i].str = word;
			}
		}

		for (i = 0; i < k; i++)
		{
			if (i < k - 1)
			{
				System.out.printf("%s ", all[i].str);
			}
			else
			{
				System.out.printf("%s", all[i].str);
			}
		}

		return 0;
	}
}

