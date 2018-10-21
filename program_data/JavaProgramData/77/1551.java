public class bg
{
	public int b;
	public int g;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] peo = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char e;
		int i;
		int j;
		int k = 0;
		int l;
		bg[] bag = tangible.Arrays.initializeWithDefaultbgInstances(50);

		peo = new Scanner(System.in).nextLine();

		l = peo.length();
		e = peo[l - 1];
		for (i = 1;i < l;i++)
		{
			if (peo[i] == e)
			{
			 for (j = i - 1;j >= 0;j--)
			 {
					  if (peo[j] != '\0')
					  {
							  bag[k].b = i;
							bag[k].g = j;
							k++;
							peo[i] = '\0';
							peo[j] = '\0';
							break;
					  }
			 }
			}
		}
			for (i = 0;i < k;i++)
			{
				System.out.printf("%d %d\n",bag[i].g,bag[i].b);
			}

			return 0;
	}


}

