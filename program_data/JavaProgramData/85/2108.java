package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int c;
	int[] m = new int[100];
	String zfc = new String(new char[21]);
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
			zfc = tempVar2.charAt(0);
		}
		 c = 0;
		for (j = 0;zfc.charAt(j) != '\0';j++)
		{

			if (j == 0)
			{
			   if ((zfc.charAt(j) >= 'a' && zfc.charAt(j) <= 'z') || (zfc.charAt(j) >= 'A' && zfc.charAt(j) <= 'Z') || (zfc.charAt(j) == '_'))
			   {
			   c++;
			   }
			}
			else
			{
				if ((zfc.charAt(j) >= 'a' && zfc.charAt(j) <= 'z') || (zfc.charAt(j) >= 'A' && zfc.charAt(j) <= 'Z') || (zfc.charAt(j) == '_') || (zfc.charAt(j) >= '0' && zfc.charAt(j) <= '9'))
				{
					c++;
				}
			}
		}
	if (c == j)
	{
	m[i] = 1;
	}
	else
	{
	m[i] = 0;
	}
	}
	for (i = 0;i < n;i++)
	{
		if (m[i] == 1)
		{
			System.out.print("yes\n");
		}
		else
		{
			System.out.print("no\n");
		}
	}
	return 0;
	}


}

