package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[1003]);
		String c = new String(new char[100]);
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
		int i;
		int j;
		int num = 0;
		int k = -1;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			num = num + 1;
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			for (j = 0;b.charAt(j) != '\n';j++)
			{
				if (a.charAt(i) == b.charAt(j))
				{
					break;
				}


			}
			System.out.printf("%d",j);
			break;
		}
		for (i = j;i <= num + j;i++)
		{
			k = k + 1;
			c.charAt(k) == b.charAt(i);

		}
		if (strcmp(a,c) == 0)
		{
			System.out.printf("%d",j);
		}



		return 0;


	}
}

