package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k = 0;
		int ll = 0;
		char[][] word = new char[300][41];
		String[] p;
		int[] len = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *l;
		int l;
		l = len;
		p = word;
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
				word[i] = tempVar2.charAt(0);
			}
			*(l + i) = String.valueOf(word[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			if (k == 0)
			{
				System.out.printf("%s",word[i]);
				k++;
				ll += *(l + i);
			}
			else
			{
				if (ll + *(l + i) + 1 <= 80)
				{
					System.out.printf(" %s",word[i]);
					ll += *(l + i) + 1;
				}
				else
				{
					System.out.printf("\n%s",word[i]);
					ll = (l + i);
				}
			}
		}
		return 0;
	}


}

