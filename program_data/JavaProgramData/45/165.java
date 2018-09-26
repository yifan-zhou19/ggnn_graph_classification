package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int j = 0;
		int[] c = new int[100];
		int length1;
		int length2;
		int i;
		int k;
		int m;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		length1 = a.length();
		length2 = b.length();
		for (i = 0;i < length2;i++)
		{
			if (a.charAt(0) == b.charAt(i))
			{

				c[j] = i;
				j++;
			}
		}
		for (k = 0;k < j;k++)
		{
			s = c[k];

			for (m = 0;m < length1;m++)
			{

				if (a.charAt(m) == b.charAt(c[k]))
				{

					c[k]++;
				}
				else
				{
					break;
				}

			}
			if (m >= length1)
			{
				System.out.printf("%d",s);
				break;
			}


		}
		return 0;

	}

}

