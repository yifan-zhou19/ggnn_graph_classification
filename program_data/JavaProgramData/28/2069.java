package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	int[] sz = new int[300];
	j = 0;
	n = 0;
	String zfc = new String(new char[1001]);
	zfc = new Scanner(System.in).nextLine();
	for (i = 0;zfc.charAt(i) != '\0';i++)
	{
		if (zfc.charAt(i) != ' ')
		{
			n++;
		}
		else
		{
			if (n != 0)
			{
			sz[j] = n;
			j++;
			}
			n = 0;
		}
	}
	sz[j] = n;
	for (i = 0;i < j;i++)
	{
	System.out.printf("%d,",sz[i]);
	}
	System.out.printf("%d",sz[j]);
	return 0;
	}



}
