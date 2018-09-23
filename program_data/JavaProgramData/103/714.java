public class point
{
	public char a;
	public int b;
}

package <missing>;

public class GlobalMembers
{
	public static point[] poi = tangible.Arrays.initializeWithDefaultpointInstances(40);
	public static int Main()
	{
		String str = new String(new char[1000]);
		int i;
		int j = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		poi[j].a = str.charAt(0);
		for (i = 1;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) == str.charAt(i - 1) || str.charAt(i) == str.charAt(i - 1) - 32 || str.charAt(i) == str.charAt(i - 1) + 32)
			{
				poi[j].b++;
			}
			else
			{
				j++;
				poi[j].a = str.charAt(i);
			}
		}
		for (k = 0;k <= j;k++)
		{
			if (poi[k].a > 96)
			{
				poi[k].a = poi[k].a - 32;
			}
			System.out.printf("(%c,%d)",poi[k].a,poi[k].b + 1);

		}
		return 0;
	}
}

