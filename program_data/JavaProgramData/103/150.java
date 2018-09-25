package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String n = new String(new char[1000]);
		int[] x = new int[1000];
		int a;
		int b;
		int c;
		int i;
		int j;
		int k;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = tempVar.charAt(0);
		}
		i = 0;
		for (j = 0;j < 1000;j++)
		{
						   x[j] = 0;
						if (n.charAt(j) != 0)
						{
							i++;
						}
						else
						{
							break;
						}
		}
		for (j = 0;j < i;j++)
		{
						if ((n.charAt(j) >= 'a') && (n.charAt(j) <= 'z'))
						{
						n = tangible.StringFunctions.changeCharacter(n, j, n.charAt(j) - 32);
						}
		}
		j = 0;
		for (j = 0;j < i;j++)
		{
						while (n.charAt(j) == n.charAt(j + 1))
						{
										   for (k = j;k < i;k++)
										   {
										   n = tangible.StringFunctions.changeCharacter(n, k, n.charAt(k + 1));
										   }
										   i--;
										   x[t]++;
						}
						t++;
		}
		for (j = 0;j < t;j++)
		{
						System.out.printf("(%c,%d)",n.charAt(j),x[j] + 1);
		}
	}


}

