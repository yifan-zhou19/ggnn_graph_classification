package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String ID = "";
		final String young = "";
		final String old = "";
		final String wae = "";
		int[] age = new int[100];
		int[] y = new int[100];
		int[] o = new int[100];
		int i;
		int n;
		int m = 0;
		int k = 0;
		int temp = 0;
		int a;
		int b;
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
				ID = tangible.StringFunctions.changeCharacter(ID, i, tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				age[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (age[i] < 60)
			{
				young = tangible.StringFunctions.changeCharacter(young, m, ID.charAt(i));
				y[m] = age[i];
				m++;
			}
			else
			{
				old = tangible.StringFunctions.changeCharacter(old, k, ID.charAt(i));
				o[k] = age[i];
				k++;
			}
		}
		for (a = 0;a < k - 1;a++)
		{
			for (b = 0;b < k - a - 1;b++)
			{
				if (o[b] < o[b + 1])
				{
					temp = o[b];
					o[b] = o[b + 1];
					o[b + 1] = temp;
					wae = old.charAt(b);
					old = tangible.StringFunctions.changeCharacter(old, b, old.charAt(b + 1));
					old = tangible.StringFunctions.changeCharacter(old, b + 1, wae);
				}
			}
		}
		for (a = 0;a < k;a++)
		{
			System.out.printf("%s\n",old.charAt(a));
		}
		for (b = 0;b < m;b++)
		{
			System.out.printf("%s\n",young.charAt(b));
		}
	}


}

