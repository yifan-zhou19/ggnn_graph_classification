package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int g;

		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			a = 0;
					 g = 0;
			String s = new String(new char[21]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
				for (j = 0;s.charAt(j) != '\0';j++)

				{

					if (s.charAt(0) >= 65 && s.charAt(0) <= 90 || s.charAt(0) >= 97 && s.charAt(0) <= 122 || s.charAt(0) == 95)
					{
						a = a + 1;
					}
						g++;
						if (s.charAt(j) >= 65 && s.charAt(j) <= 90 || s.charAt(j) >= 97 && s.charAt(j) <= 122 || s.charAt(j) == 95 || s.charAt(j) >= 48 && s.charAt(j) <= 57)
						{
						a = a + 1;
						}
						g++;

				}
				if (a == g)
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

