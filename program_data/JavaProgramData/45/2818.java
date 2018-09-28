package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int p;
		int j;
		int l;
		int k;
		int l2;
		String a = new String(new char[60]);
		String b = new String(new char[60]);


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		l = a.length();
		l2 = b.length();
		i = 0;
		j = 0;
		k = 0;
		while (i < l2)
		{
			if (a.charAt(0) == b.charAt(i))
			{
				k = i;
				p = i;

				while (a.charAt(j) == b.charAt(k))

				{
					j++;
					k++;
				}

			}
			if (j >= l - 1)
			{
				System.out.printf("%d",p);
			break;
			}



			i++;

		}



	}

}

