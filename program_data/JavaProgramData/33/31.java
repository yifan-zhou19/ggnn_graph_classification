public class DNA
{
	public String zfc = new String(new char[255]);
}

package <missing>;

public class GlobalMembers
{
	public static DNA[] a = tangible.Arrays.initializeWithDefaultDNAInstances(1000);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		a[i].zfc = new Scanner(System.in).nextLine();
			t = String.valueOf(a[i].zfc).length();
			for (j = 0;j < t;j++)
			{
				if (a[i].zfc.charAt(j) == 'A')
				{
					a[i].zfc = tangible.StringFunctions.changeCharacter(a[i].zfc, j, 'T');
				}
				else if (a[i].zfc.charAt(j) == 'T')
				{
					a[i].zfc = tangible.StringFunctions.changeCharacter(a[i].zfc, j, 'A');
				}
				else if (a[i].zfc.charAt(j) == 'C')
				{
					a[i].zfc = tangible.StringFunctions.changeCharacter(a[i].zfc, j, 'G');
				}
				else if (a[i].zfc.charAt(j) == 'G')
				{
					a[i].zfc = tangible.StringFunctions.changeCharacter(a[i].zfc, j, 'C');
				}
			}
			System.out.println(a[i].zfc);
		}
		return 0;
	}
}

