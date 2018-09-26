public class point
{
	public String A = new String(new char[256]);
	public String B = new String(new char[256]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		point[] chain = tangible.Arrays.initializeWithDefaultpointInstances(n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(chain[i].A) = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;chain[i].A.charAt(j);j++)
			{
				if (chain[i].A.charAt(j) == 'A')
				{
					chain[i].B = tangible.StringFunctions.changeCharacter(chain[i].B, j, 'T');
				}
				if (chain[i].A.charAt(j) == 'T')
				{
					chain[i].B = tangible.StringFunctions.changeCharacter(chain[i].B, j, 'A');
				}
				if (chain[i].A.charAt(j) == 'C')
				{
					chain[i].B = tangible.StringFunctions.changeCharacter(chain[i].B, j, 'G');
				}
				if (chain[i].A.charAt(j) == 'G')
				{
					chain[i].B = tangible.StringFunctions.changeCharacter(chain[i].B, j, 'C');
				}
			}
			chain[i].B = tangible.StringFunctions.changeCharacter(chain[i].B, j, '\0');
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",chain[i].B);
		}
		return 0;
	}
}

